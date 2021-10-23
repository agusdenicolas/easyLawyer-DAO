package usal.interfaces;

import java.util.List;

import usal.dominio.Cliente;
import usal.util.DAOExcepcion;

public interface IClienteDao extends ICrudDao<Cliente>{

	public List<Cliente> getTodosActivos() throws DAOExcepcion;
}