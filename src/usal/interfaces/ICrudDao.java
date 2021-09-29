package usal.interfaces;

import java.util.List;

import usal.util.DAOExcepcion;

public interface ICrudDao <T>{
	
	public void insertar(T o) throws DAOExcepcion;
	
	public void modificar(T o) throws DAOExcepcion;
	
	public void eliminar(T o) throws DAOExcepcion;
	
	public T getUno(int id) throws DAOExcepcion;
	
	public List<T> getTodos() throws DAOExcepcion;
}