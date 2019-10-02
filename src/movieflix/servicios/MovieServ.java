/*
 * @Pedro Javier Umpi�rrez Fern�ndez
 * Se crean los m�todos para dar de alta y baja los usuarios, las pel�culas, para modificar ambos y se muestra la lista de las peliculas
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
	
	
		
	public void bajaUsuario(){
		System.out.println("Introduzca el id del usuario para darle de baja");
		int id=LeerDatos.tecladoInt();
		d.bajaUsuario(id);

	}
	
	public void mostrarUsuario() { 
		System.out.println("Introduzca el id del usuario para mostrar sus datos");
		int id=LeerDatos.tecladoInt();
		ArrayList<Usuario> lista = d.mostrarUsuario(id);
		for ( Usuario u : lista ) {
			System.out.println(u.toString());
		}
	}
	
	/**
	 * @author rocioBorrazas
	 * @version 02/10
	 */
	
	public void modificarUsuario(){
		
	
		System.out.println("Introduzca el ID del usuario que desea modificar");
		int id = LeerDatos.tecladoInt();

		System.out.println("Introduzca el nombre del usuario");
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
		
		System.out.println("Si desea modificar la ciudad de residencia, escriba si y pulse enter. De lo contrario, escriba no y pulse enter");
		String respuesta= LeerDatos.tecladoString();
		
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Escriba la ciudad de residencia");
			String ciudad=LeerDatos.tecladoString();		
			Usuario u = new Usuario(id, nombre,fechaDate,ciudad);
			d.modificarUsuario(u);			
		}									
		else {
			Usuario u = new Usuario (id, nombre, fechaDate);
			d.modificarUsuario(u);
		}
		
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
			if(cat<1 || cat >6) {
				cat = 0;
			}
		}
		while(cat==0);
			

		//crear pelicula
		Pelicula p = new Pelicula(nombre,anyo,cat);
		d.altaPelicula(p);		
		
		}	
	
	
	public void bajaPelicula() {
		System.out.println("Introduzca el id de la pel�cula para darle de baja");
		int id=LeerDatos.tecladoInt();
		d.bajaPelicula(id);		
	}

	public void mostrarListaPelicula(){
		
	
		ArrayList<Pelicula> lista = d.obtenerListaPelicula();
		System.out.println("Estas son las pel�culas disponibles:\n");
		for(int i=0; i<lista.size();i++)
		{
			System.out.println(lista.get(i).toString());
		}
		
	}
	
	
	public void mostrarListaUsuarios(){
		
		ArrayList<Usuario> lista = d.obtenerListaUsuarios();
		System.out.println("Estos son los usuario:\n");
		for(int i=0; i<lista.size();i++)
		{
			System.out.println(lista.get(i).toString());
		}
		
	}
	
}
	//public boolean modificarPelicula(Pelicula p);{}	

