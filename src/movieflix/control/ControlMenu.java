package movieflix.control;

/**
 * *Esta clase muestra las opciones al usuario del programa y gestiona las decisiones del mismo
 * @author Héctor Martín Hernanz 
 * @version 01/10/2019
 */

public class ControlMenu {

	/**
	 * *Este método muestra las opciones que tiene el usuario. Es llamado cuando se ejecuta el programa y cada vez que 
	 *  se ejecuta una opción o bien si hay alguna excepción.
	 */
	
	public static void mostrarMenu() 
	{
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
		
		//Aquí se llama al método que procesa la opción que elige el usuario
		//procesarOpcion();
		
			
		
		
	}
	
}
