package movieflix.utilidades;
import java.util.Scanner;

public class LeerDatos {

	public LeerDatos() {
		
	}
	
	@SuppressWarnings("resource")
	public static int tecladoInt(){		
		return new Scanner(System.in).nextInt();
	}
	
	@SuppressWarnings("resource")
	public static String tecladoString(){		
		return new Scanner(System.in).nextLine();
	}	
	
	@SuppressWarnings("resource")
	public static boolean tecladoBoolean(){		
		return new Scanner(System.in).nextBoolean();
	}
	
}
