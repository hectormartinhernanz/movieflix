package movieflix.datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**

 * Esta clase estática sirve para lanzar los statement a la base de datos
 * Tiene dos métodos, uno que devuelve un ResultSet para las consultas y
 * otro que no devuelve nada para las altas, modificaciones y eliminaciones. 
 * @author: Hector Martin
 * @version: 30/09/2019
 */

public class conexionBBDD {
/**
*Este método devuelve un ResultSet para las consultas
**/
public static ResultSet sentenciaSelectBBDD (String sentencia) {

	Connection connection = null;
	java.sql.Statement st = null;
	ResultSet rs = null;
	
	try {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String driverUrl = "jdbc:mysql://10.90.36.111:3306/movieflix";
		String user = "root";
		String password = "password";
		Class.forName(driverClassName);
		connection = DriverManager.getConnection(driverUrl, user, password);
		
		st = connection.createStatement();
		rs = st.executeQuery(sentencia);
		
		return rs;
		
		}
	
	catch(ClassNotFoundException e){
		e.toString();
		return null;
	}
	
	catch(SQLException e){
		e.toString();
		return null;
	}
	
	finally {
		
		try { //cerrandolo todo...
			if (rs != null) rs.close();
			if (st != null) st.close();
			if (connection != null) connection.close();
		}
		catch(SQLException e){
			e.toString();
			e.printStackTrace();
		}
		
	}
	
}

/**
*Este método ejecuta sentencia SQL y no devuelve nada.
**/
public static void sentenciaInsertUpdateDeleteBBDD (String sentencia) {

	Connection connection = null;
	java.sql.Statement st = null;
	
	try {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String driverUrl = "jdbc:mysql://10.90.36.111:3306/movieflix";
		String user = "root";
		String password = "password";
		Class.forName(driverClassName);
		connection = DriverManager.getConnection(driverUrl, user, password);
		
		st = connection.createStatement();
		st.executeQuery(sentencia);
		
		}
	
	catch(ClassNotFoundException e){
		e.toString();
	
	}
	
	catch(SQLException e){
		e.toString();
	
	}
	
	finally {
		
		try {
			if (st != null) st.close();
			if (connection != null) connection.close();
		}
		catch(SQLException e){
			e.toString();
			e.printStackTrace();
		}	
	}
}

}
