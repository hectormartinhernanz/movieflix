package movieflix.servicios;
import java.sql.ResultSet;
import java.sql.SQLException;

import movieflix.datos.ConexionBBDD;

public class Modificar {

	public static void mostrarListadoPeliculas() 
	{
		ResultSet listaPeliculas = ConexionBBDD.sentenciaSelectBBDD("SELECT * FROM categorias;");

		try {
			if(listaPeliculas != null) {		
			while(listaPeliculas.next()) 
			{
				System.out.println( "C�digo: "+listaPeliculas.getString(1)+" Nombre: "+listaPeliculas.getString(2));
		
			}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
