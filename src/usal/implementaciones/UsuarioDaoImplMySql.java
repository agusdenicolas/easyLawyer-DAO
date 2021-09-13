package usal.implementaciones;

import java.util.ArrayList;
import java.util.List;

import usal.dominio.Usuario;
import usal.interfaces.ICrudDao;

public class UsuarioDaoImplMySql implements ICrudDao<Usuario>{
	
	// Consultas Base de Datos
	/*		TODO: Cambiar las consultas por la tabla Usuarios y datos respectivos
	private final String INSERT = "INSERT INTO perros (nombre,raza,edad) VALUES (?,?,?)";
	private final String MODIFY = "UPDATE perros SET nombre = ?, raza = ?, edad = ? WHERE ID = ?";
	private final String DELETE = "DELETE FROM perros WHERE id = ?";
	private final String GETONE = "SELECT * FROM perros WHERE id = ?";
	private final String GETALL = "SELECT * FROM perros";
	*/

	private List<Usuario> usuarios;
	
	public UsuarioDaoImplMySql() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	@Override
	public void insertar(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario getUno(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
