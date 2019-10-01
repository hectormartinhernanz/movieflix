package movieflix.control;

import movieflix.utilidades.LeerDatos;
import utilidades.Datos;

/*
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
		System.out.println("(01) Incluir película en listado general");
		System.out.println("(02) Dar de alta nuevo usuario");
		System.out.println("(03) Dar de baja usuario existente");
		System.out.println("(04) Modificar datos de usuario existente");
		System.out.println("(05) Mostrar datos de usuario existente");
		System.out.println("(06) Mostrar películas suscritas por un usuario");
		System.out.println("(07) Mostrar listado general de películas");
		System.out.println("(08) ??? ");
		System.out.println("(0) SALIR");
		System.out.println("__________________________________________________________________");
		// procesarOpcion();

	}
	
	

	public static void procesarOpcion() {
		boolean seguir = true;
		do {
			mostrarMenu();
			seguir = mostrarMenu();
		} while (seguir);
		System.out.println("---Fin de la Sesión---");
	}

public boolean seleccionOpciones () {
	
    boolean continuar = true;		
	
	try {
		    switch(// LeerDatos.LeerInt) {
		    		
		    		
		    //INCLUIR PELICULA EN LISTADO GENERAL
			case 1: 
					MovieServ.;
					break;
		

			//DAR DE ALTA NUEVO USUARIO	
			case 2:
					MovieServ.;
					break;
	
	
			//DA DE BAJA USUARIO EXISTENTE
			case 3:
					MovieServ. ;
					break;
	
			//MODIFICAR DATOS DE USUARIO EXISTENTE 
			case 4:
					MovieServ. ;
					break;
	
			//MOSTRAR DATOS DE USUARIO EXISTENTE	
			case 5:
				MovieServ. ;
				break;	
	
	        //MOSTRAR PELICULAS CREADAS POR UN USUARIO
			case 6:
				MovieServ. ;
				break;
	
			//MOSTRAR LISTADO GENERAL DE PELICULAS
			case 7:
				MovieServ. ;
				break;
	
			//PARA HACER PRUEBAS
			case 8:
				MovieServ. ;
				break;
	

			case 0:
				continuar = salir();
				break;
			}
	
	} 		catch (Exception e) {
			System.out.println("error: " + e.toString());
}
	return continuar;

	}


//private boolean salir() throws Exception {
//String sino = Datos.recogeString("   ¿Está seguro?(S/N)");
//return (sino.toUpperCase().charAt(0) != 'S');
}
