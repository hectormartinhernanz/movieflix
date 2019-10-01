/*
 * @Pedro Javier Umpi�rrez Fern�ndez
 * Se crean los m�todos para dar de alta y baja los usuarios, las pel�culas, para modificar ambos y se muestra la lista de las peliculas
 * */
package movieflix.servicios;
import movieflix.utilidades.LeerDatos;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import movieflix.datos.Datos;
import movieflix.model.Pelicula;
import movieflix.model.Usuario;
import java.text.ParseException;


public class MovieServ { //implements IMovieServ {
	
	//Conectar con la base de datos
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
	
	public ArrayList<Usuario> mostrarListaUsuario() { 
		
	}
	public boolean modificarUsuario(Usuario u){
		
	}
	
	public boolean altaPelicula() {		
		System.out.println("Introduzca el nombre de la pel�cula a dar de alta");
		String nombre=LeerDatos.tecladoString();
		System.out.println("Introduzca el anyo de la pel�cula");
		int anyo = LeerDatos.tecladoInt();
		System.out.println("Introduzca la categor�a de la pel�cula");
		int cat = LeerDatos.tecladoInt();	
		//crear pel�cula
		Pelicula p = new Pelicula(nombre,anyo,cat);
		d.altaPelicula(p);		
		return true;
		}	
	
	
	public boolean bajaPelicula() {
		System.out.println("Introduzca el id de la pel�cula para darle de baja");
		int id=LeerDatos.tecladoInt();
		d.bajaPelicula(id);		
		return true;
	}
	
	//public ArrayList<Pelicula>mostrarListaPelicula();{}
	//public boolean modificarPelicula(Pelicula p);{}	
//}
