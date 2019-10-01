package movieflix.utilidades;
import java.util.Scanner;

public class LeerDatos {

	public LeerDatos() {
		
	}
	
	public static int tecladoInt(){		
		return new Scanner(System.in).nextInt();
	}
	
	public static String tecladoString(){		
		return new Scanner(System.in).next();
	}	
	
	public static boolean tecladoBoolean(){		
		return new Scanner(System.in).nextBoolean();
	}
}
