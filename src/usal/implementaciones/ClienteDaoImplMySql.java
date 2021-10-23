package usal.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import usal.dominio.Cliente;
import usal.dominio.Direccion;
import usal.dominio.enums.Provincia;
import usal.factory.DAOFactory;
import usal.interfaces.IClienteDao;
import usal.interfaces.ICrudDao;
import usal.util.Conexion;
import usal.util.DAOExcepcion;

public class ClienteDaoImplMySql implements IClienteDao{
	
//  --------------- Consultas Base de Datos ---------------
	private final String INSERT = "INSERT INTO clientes (nombre, apellido, direccion, mail, celular, cuit, estado) "
									+ "VALUES (?,?,?,?,?,?,?)";
	private final String MODIFY = "UPDATE clientes SET nombre = ?, apellido = ?, direccion = ?, mail = ?, celular = ?,"
									+ "cuit = ?, estado = ? WHERE idCliente = ?";
	private final String DELETE = "UPDATE clientes SET estado = 0 WHERE idCliente = ?";
	private final String GETONE = "SELECT * FROM clientes WHERE idCliente = ?";
	private final String GETALL = "SELECT * FROM clientes";
	private final String GETALLACTIVE = "SELECT * FROM clientes WHERE estado = 1";

	public ClienteDaoImplMySql() {}
		
	@Override
	public void insertar(Cliente o) throws DAOExcepcion{
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = Conexion.conectar();
			ps = conn.prepareStatement(INSERT);
			
			ps.setString(1, o.getNombre());
			ps.setString(2, o.getApellido());
			//Direccion -> Calle Numero, Provincia
			ps.setString(3, o.getDireccion().getCalle() + " " + o.getDireccion().getNumero() + ", " + o.getDireccion().getProvincia().getNombreProvincia());
			ps.setString(4, o.getMail());
			ps.setString(5, o.getCelular());
			ps.setString(6, o.getCuit());
			ps.setInt(7, o.getEstado());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOExcepcion("Error en MYSQL - INSERT- Cliente", e.getCause());
		} finally {
			
			//Cerrar todos los recursos utilizados (Connection, PreparedStatement - ResultSet)
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}	
	}

	@Override
	public void modificar(Cliente o) throws DAOExcepcion {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = Conexion.conectar();
			ps = conn.prepareStatement(MODIFY);
			
			ps.setString(1, o.getNombre());
			ps.setString(2, o.getApellido());
			//Direccion -> Calle Numero, Provincia
			ps.setString(3, o.getDireccion().getCalle() + " " + o.getDireccion().getNumero() + ", " + o.getDireccion().getProvincia().getNombreProvincia());
			ps.setString(4, o.getMail());
			ps.setString(5, o.getCelular());
			ps.setString(6, o.getCuit());
			ps.setInt(7, o.getEstado());
			ps.setInt(8, o.getIdCliente());	//Para poder hacer WHERE = idCliente
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOExcepcion("Error en MYSQL - MODIFICAR - Cliente", e.getCause());
		} finally {
			
			//Cerrar todos los recursos utilizados (Connection, PreparedStatement - ResultSet)
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}
	}

	@Override
	public void eliminar(Cliente o) throws DAOExcepcion {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = Conexion.conectar();
			ps = conn.prepareStatement(DELETE);
			
			ps.setInt(1, o.getIdCliente());	//Para poder hacer WHERE = idCliente
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOExcepcion("Error en MYSQL - ELIMINAR - Cliente", e.getCause());
		} finally {
			
			//Cerrar todos los recursos utilizados (Connection - PreparedStatement - ResultSet)
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}
		
	}

	@Override
	public Cliente getUno(int id) throws DAOExcepcion{
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente= null;
		
		try {
			conn = Conexion.conectar();
			ps = conn.prepareStatement(GETONE);
			
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				//Hago el mapeo de Rs a Camion
				cliente = convertir(rs);
			}
		} catch (SQLException SQL) {
			throw new DAOExcepcion("Error en MYSQL - GETONE - Cliente", SQL.getCause());
		}finally {
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		return cliente; //Si devuelve null es porque no se encontro al Camion
	}

	@Override
	public List<Cliente> getTodos() throws DAOExcepcion{
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = Conexion.conectar();
			
			ps = conn.prepareStatement(GETALL);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				//Hago del mapeo de Rs a Camion y los agrego a la lista
				clientes.add(convertir(rs));
			}
			
		}catch(SQLException SQL) {
			throw new DAOExcepcion("Error en MYSQL - GETALL - Cliente", SQL.getCause());
		}finally {
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		return clientes;
	}
	
	@Override
	public List<Cliente> getTodosActivos() throws DAOExcepcion{
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = Conexion.conectar();
			
			ps = conn.prepareStatement(GETALLACTIVE);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				//Hago del mapeo de Rs a Camion y los agrego a la lista
				clientes.add(convertir(rs));
			}
			
		}catch(SQLException SQL) {
			throw new DAOExcepcion("Error en MYSQL - GETALLACTIVE - Cliente", SQL.getCause());
		}finally {
			Conexion.desconectar(conn);
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		return clientes;
	}
	
	//Para mappear los clientes
	public Cliente convertir(ResultSet rs) throws SQLException {
		
		int idCliente = rs.getInt("idCliente");
		String nombre = rs.getString("nombre");
		String apellido = rs.getString("apellido");
		String cuit = rs.getString("cuit");
		String mail = rs.getString("mail");
		String celular = rs.getString("celular");
		int estado = rs.getInt("estado");
		
		String direccion = rs.getString("direccion");
		
		Cliente c = new Cliente(nombre, apellido, cuit, Direccion.convertirDireccion(direccion), mail, celular);
		c.setIdCliente(idCliente);
		c.setEstado(estado);
		
		return c;
	}
}
