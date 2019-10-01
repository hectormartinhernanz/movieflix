package movieflix.control;

import movieflix.servicios.MovieServ;
import movieflix.utilidades.LeerDatos;


/**
 * *Esta clase muestra las opciones al usuario del programa y gestiona las decisiones del mismo
 * @author 
 */

public class ControlMenu {

	// private IMovieServ = new MovieServ ();

	public static boolean mostrarMenu() {
		System.out.println("__________________________________________________________________");
		System.out.println("__________________                           _____________________");
		System.out.println("__________________  MOVIEFLIX :ADMIN TOOL    _____________________");
		System.out.println("__________________________________________________________________");
		System.out.println("");
		System.out.println("ELIJA UNA OPCIÓN");
		System.out.println("");
		System.out.println("(1) Incluir película en listado general");
		System.out.println("(2) Dar de alta nuevo usuario");
		System.out.println("(3) Dar de baja usuario existente");
		System.out.println("(4) Modificar datos de usuario existente");
		System.out.println("(5) Mostrar datos de usuario existente");
		System.out.println("(6) Mostrar películas suscritas por un usuario");
		System.out.println("(7) Mostrar listado general de películas");
		System.out.println("(8) ??? ");
		System.out.println("(0) SALIR");
		System.out.println("__________________________________________________________________");
		 
		seleccionOpciones();
return true;
	
	}
	
/**
 *  @author Rocio Borrazas
*/
	//METODO PARA LEER EL MENU Y ELEGIR OPCIONES
	
	//public static void procesarOpcion() {
	//	boolean seguir = true;
		//LeerDatos.tecladoInt()
	//	do {
	//		seguir = mostrarMenu();
	//	} while (seguir);
	//	System.out.println("---Fin de la Sesión---");
	// }

public static boolean seleccionOpciones () {
	
    boolean continuar = true;		
	
	try {
		    switch(LeerDatos.tecladoInt()) {
		    		
		    		
		    //INCLUIR PELICULA EN LISTADO GENERAL
			case 1: 
					System.out.println("MovieServ.;1"); 
					break;
		
			//DAR DE ALTA NUEVO USUARIO	
			case 2:
					System.out.println("MovieServ.;2");
					break;
	
			//DA DE BAJA USUARIO EXISTENTE
			case 3:
					System.out.println("MovieServ.;3");
					break;
	
			//MODIFICAR DATOS DE USUARIO EXISTENTE 
			case 4:
					System.out.println("MovieServ.;4");
					break;
	
			//MOSTRAR DATOS DE USUARIO EXISTENTE	
			case 5:
				System.out.println("MovieServ.;5");
				break;	
	
	        //MOSTRAR PELICULAS CREADAS POR UN USUARIO
			case 6:
				System.out.println("MovieServ.;6");
				break;
	
			//MOSTRAR LISTADO GENERAL DE PELICULAS
			case 7:
				System.out.println("MovieServ.;7");
				break;
	
			//PARA HACER PRUEBAS
			case 8:
				System.out.println("MovieServ.;8");
				break;
	

			case 0:
				System.out.println("Hasta Luego!");
				System.exit(0);
				break;
			 }
	
	         }catch (Exception e) {
			System.out.println("error: " + e.toString()  + "    Entrada de teclado errónea" );
			mostrarMenu();
			
	         }
	return continuar;
	

	}

}
