package movieflix.control;

import movieflix.servicios.MovieServ;
import movieflix.utilidades.LeerDatos;

/**
 * *Esta clase muestra las opciones al usuario del programa y gestiona las
 * decisiones del mismo
 * 
 * @author H�ctor Mart�n Hernanz
 * @version 01/10/2019
 */

public class ControlMenu {
	public static void mostrarMenu() {
		System.out.println("__________________________________________________________________");
		System.out.println("__________________                           _____________________");
		System.out.println("__________________  MOVIEFLIX :ADMIN TOOL    _____________________");
		System.out.println("__________________________________________________________________");
		System.out.println("");
		System.out.println("ELIJA UNA OPCION");
		System.out.println("");
		System.out.println("(1) Incluir pelicula en listado general");
		System.out.println("(2) Dar de alta nuevo usuario");
		System.out.println("(3) Dar de baja usuario existente");
		System.out.println("(4) Modificar datos de usuario existente");
		System.out.println("(5) Mostrar datos de usuario existente");
		System.out.println("(6) Mostrar peliculas suscritas por un usuario");
		System.out.println("(7) Mostrar listado general de peliculas");
		System.out.println("(8) Mostrar listado general de usuarios");
		System.out.println("(0) SALIR");
		System.out.println("__________________________________________________________________");
	
		seleccionOpciones();
	}

	/**
	 * @author Rocio Borrazas
	 */
	public static void seleccionOpciones() {

		try {

			switch (LeerDatos.tecladoInt()) {

			// INCLUIR PELICULA EN LISTADO GENERAL
			case 1:
				new MovieServ().altaPelicula();
				System.out.println("Se ha introducido bien la Pelicula");
				break;

			// DAR DE ALTA NUEVO USUARIO
			case 2:
				new MovieServ().altaUsuario();
				System.out.println("Alta de usuario realizada con exito");
				break;

			// DA DE BAJA USUARIO EXISTENTE
			case 3:
				new MovieServ().bajaUsuario();
				System.out.println("Baja de usuario realizada con exito");
				break;

			// MODIFICAR DATOS DE USUARIO EXISTENTE
			case 4:
				System.out.println("OPCION DISPONIBLE PROXIMAMENTE");
				// new MovieServ().modificarUsuario(null);
				System.out.println("Modificacion exitosa");
				break;

			// MOSTRAR DATOS DE USUARIO EXISTENTE
			case 5:
				new MovieServ().mostrarUsuario();
				
				break;	
	
	        //MOSTRAR PELICULAS CONTRATADAS POR UN USUARIO
			case 6:
				new MovieServ().mostrarPeliculasSuscritas();
				System.out.println("OPCION DISPONIBLE PROXIMAMENTE");
				break;

			// MOSTRAR LISTADO GENERAL DE PELICULAS
			case 7:

				new MovieServ().mostrarListaPelicula();
				break;

		
			 case 8:
				 new MovieServ().mostrarListaUsuarios();
			 break;

			case 0:
				System.out.println("Hasta Luego!");
				System.exit(0);
				break;

			}
			mostrarMenu();
		} catch (Exception e) {
			System.out.println("error: " + e.toString() + "    Entrada de teclado erronea");
			mostrarMenu();

		}
	}
}
