package usal.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import usal.dominio.Cliente;
import usal.dominio.Direccion;
import usal.interfaces.ICrudDao;
import usal.util.Conexion;
import usal.util.DAOExcepcion;

public class ClienteDaoImplMySql implements ICrudDao<Cliente>{
	
	private List<Cliente> clientes;

//  --------------- Consultas Base de Datos ---------------
	private final String INSERT = "INSERT INTO clientes (fk_idDireccion, nombre, apellido, mail, celular, cuit, estado) "
									+ "VALUES (?,?,?,?,?,?,?)";
	private final String MODIFY = "UPDATE clientes SET fk_idDireccion = ?, nombre = ?, apellido = ?, mail = ?, celular = ?,"
									+ "cuit = ?, estado = ? WHERE idCliente = ?";
	private final String DELETE = "UPDATE clientes SET estado = 0 WHERE idCliente = ?";
	private final String GETONE = "SELECT * FROM clientes WHERE idCliente = ?";
	private final String GETALL = "SELECT * FROM clientes";
	
	//Constructor
	public ClienteDaoImplMySql() {
		this.clientes = new ArrayList<Cliente>();
	}
		
	@Override
	public void insertar(Cliente o) throws DAOExcepcion{
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = Conexion.conectar();
			ps = conn.prepareStatement(INSERT);
			
			ps.setInt(1, o.getDireccion().getIdDireccion());
			ps.setString(2, o.getNombre());
			ps.setString(3, o.getApellido());
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
			
			ps.setInt(1, o.getDireccion().getIdDireccion());
			ps.setString(2, o.getNombre());
			ps.setString(3, o.getApellido());
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
			throw new DAOExcepcion("Error en MYSQL - GETONE - Camion", SQL.getCause());
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
	public List<Cliente> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Para mappear 
		public Cliente convertir(ResultSet rs) throws SQLException {
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			String cuit = rs.getString("cuit");
			String fk_idDireccion = rs.getString("fk_idDireccion");
			String mail = rs.getString("nroChasis");
			String celular = rs.getString("celular");
			int estado = rs.getInt("estado");
			
			Cliente c = new Cliente(nombre, apellido, cuit, new Direccion(), mail, celular, estado);
			c.setIdCliente(rs.getInt("idCliente"));
			
			return c;
		}

	public static void main(String[] args) throws DAOExcepcion {
//		Prueba MODIFY DAO
//		Direccion d =new Direccion();
//		d.setIdDireccion(1);
//		Cliente c = new Cliente("TEST-2", "test-2", "9999999", d, "test2@test2.com", "1122334455", 0);
//		c.setIdCliente(2);
		ICrudDao<Cliente> dao = new ClienteDaoImplMySql();
//		
//		dao.modificar(c);
		
//		Cliente c = new Cliente();
//		c.setIdCliente(1);
//		
//		dao.eliminar(c);
		
		Cliente c = dao.getUno(1);
		
		
		
		System.out.println("EJECUCION FINALIZADA");
		System.out.println(c);
		
	}
	
}
