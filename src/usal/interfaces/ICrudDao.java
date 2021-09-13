package usal.interfaces;

import java.util.List;

public interface ICrudDao <T>{
	
	public void insertar(T o);
	
	public void modificar(T o);
	
	public void eliminar(T o);
	
	public T getUno(int id);
	
	public List<T> getTodos();
}