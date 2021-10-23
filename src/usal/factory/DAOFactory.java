package usal.factory;

import usal.implementaciones.ClienteDaoImplMySql;
import usal.interfaces.IClienteDao;
import usal.interfaces.ICrudDao;

public class DAOFactory {
	
	private static IClienteDao daoCliente;
	
	public static IClienteDao getClienteDao() {
		if (daoCliente == null) {
			daoCliente = new ClienteDaoImplMySql();
		}
		return daoCliente;
	}
	
	//Demas daos...
}
