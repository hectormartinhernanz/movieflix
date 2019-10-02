/*
 * @Pedro Javier Umpiï¿½rrez Fernï¿½ndez
 * Se crean los mï¿½todos para dar de alta y baja los usuarios, las pelï¿½culas, para modificar ambos y se muestra la lista de las peliculas
 * */
package movieflix.servicios;
import movieflix.utilidades.LeerDatos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import movieflix.datos.Datos;
import movieflix.model.Pelicula;
import movieflix.model.Usuario;
import java.text.ParseException;


public class MovieServ { //implements IMovieServ {
	
	Datos d = new Datos();	
	
	public MovieServ() {
			
	}
		
	public boolean altaUsuario() {
		
		System.out.println("Introduzca el nombre del usuario a dar de alta");
		String nombre=LeerDatos.tecladoString();
		
		System.out.println("Introduzca la fecha de nacimiento (dd/mm/yyyy)");
		String fecha= LeerDatos.tecladoString();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaDate= null;
		try {
			fechaDate = formato.parse(fecha);
		}
		catch (ParseException ex) {
			System.out.println(ex);
		}				
		
		
		System.out.println("Si desea introducir la ciudad de residencia, escriba si y pulse enter. De lo contrario, escriba no y pulse enter");
		String respuesta= LeerDatos.tecladoString();
		Usuario u;
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Escriba la ciudad de residencia");
			String ciudad=LeerDatos.tecladoString();		
			u = new Usuario(nombre,fechaDate,ciudad);
			d.altaUsuario(u);			
		}									
		else {
			u = new Usuario(nombre, fechaDate);
			d.altaUsuario(u);
		}
		return true;
	}
	
	
		
	public boolean bajaUsuario(){
		System.out.println("Introduzca el id del usuario para darle de baja");
		int id=LeerDatos.tecladoInt();
		d.bajaUsuario(id);
		//
		return true;
	}
	/*
	public ArrayList<Usuario> mostrarListaUsuario() { 
		
	}
	*/
	public boolean modificarUsuario(Usuario u){
		return true;
	}
	
	public void altaPelicula() {		
		System.out.println("Introduzca el nombre de la pelicula a dar de alta");
		String nombre=LeerDatos.tecladoString();
		System.out.println("Introduzca el anyo de la pelicula");
		int anyo = LeerDatos.tecladoInt();
		int cat=0;
		do {
			System.out.println("Por favor, introduzca el numero de la categoria de la pelicula");
			System.out.println("1. Policiaca");
			System.out.println("2. Romantica");
			System.out.println("3. Aventuras");
			System.out.println("4. Comedia");
			System.out.println("5. Animacion");
			System.out.println("6. Thriller");	
			
			cat = LeerDatos.tecladoInt();	
		}
		while(cat<1 && cat>6);
			

		//crear pelicula
		Pelicula p = new Pelicula(nombre,anyo,cat);
		d.altaPelicula(p);		
		
		}	
	
	
	public boolean bajaPelicula() {
		System.out.println("Introduzca el id de la pelï¿½cula para darle de baja");
		int id=LeerDatos.tecladoInt();
		d.bajaPelicula(id);		
		return true;
	}

	public void mostrarListaPelicula(){
		
	
		ArrayList<Pelicula> lista = d.obtenerListaPelicula();
		System.out.println("Estas son las películas disponibles:\n");
		for(int i=0; i<lista.size();i++)
		{
			System.out.println(lista.get(i).toString());
		}
		
	}
	
}
	//public boolean modificarPelicula(Pelicula p);{}	
//}
