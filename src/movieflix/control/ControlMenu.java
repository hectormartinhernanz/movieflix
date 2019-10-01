package movieflix.control;

/**
 * *Esta clase muestra las opciones al usuario del programa y gestiona las decisiones del mismo
 * @author H�ctor Mart�n Hernanz 
 * @version 01/10/2019
 */

public class ControlMenu {

	/**
	 * *Este m�todo muestra las opciones que tiene el usuario. Es llamado cuando se ejecuta el programa y cada vez que 
	 *  se ejecuta una opci�n o bien si hay alguna excepci�n.
	 */
	
	public static void mostrarMenu() 
	{
		System.out.println("__________________________________________________________________");
		System.out.println("__________________                           _____________________");
		System.out.println("__________________  MOVIEFLIX :ADMIN TOOL    _____________________");
		System.out.println("__________________________________________________________________");
		System.out.println("");	
		System.out.println("ELIJA UNA OPCI�N");
		System.out.println("");	
		System.out.println("(01) Incluir pel�cula en listado general");	
		System.out.println("(02) Dar de alta nuevo usuario");	
		System.out.println("(03) Dar de baja usuario existente");
		System.out.println("(04) Modificar datos de usuario existente");
		System.out.println("(05) Mostrar datos de usuario existente");
		System.out.println("(06) Mostrar pel�culas suscritas por un usuario");
		System.out.println("(07) Mostrar listado general de pel�culas");
		System.out.println("(08) ??? ");
		System.out.println("(0) SALIR");
		System.out.println("__________________________________________________________________");
		
		//Aqu� se llama al m�todo que procesa la opci�n que elige el usuario
		//procesarOpcion();
		
			
		
		
	}
	
}
