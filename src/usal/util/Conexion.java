package usal.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {

	public static Connection conectar() {
		Properties prop = new Properties();
		Connection conn = null;
		try {
			//Leemos el .properties
			prop.load(new FileReader("C:\\Users\\agden\\Desktop\\AGUS\\FACULTAD\\"
					+ "4 año\\Seminario de Integracion Profesional\\TP\\2do Cuatrimestre\\"
					+ "CODIGO\\easyLawyer-DAO\\Conf.properties"));
			
			//Buscamos las creedenciales para conectar a la base de datos
			String URL = prop.getProperty("bd_url");
			String USER = prop.getProperty("bd_user");
			String PASSWORD = prop.getProperty("bd_password");
			
//			Class.forName(prop.getProperty("jdbc_diver"));
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void desconectar(Connection conn) {
		if (conn != null) {
            try {
               conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
}
