package usal.util;

public class DAOExcepcion extends Exception{

	private static final long serialVersionUID = 1L;

    public DAOExcepcion(String message) {
        super(message);
    }

    public DAOExcepcion(Throwable cause) {
        super(cause);
    }

    public DAOExcepcion(String message, Throwable cause) {
        super(message, cause);
    }
}
