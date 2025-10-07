package manejo_ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		/*6. Pedir por teclado una ruta de fichero y un nuevo nombre
		 *  de fichero. El programa deberá renombrar el fichero original
		 *   con el nuevo nombre en la carpeta original. Comprobar que 
		 *   el fichero original existe y que el nuevo no existe.*/

Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta para crear un fichero :");
		String ruta = sc.nextLine().trim();
		File fichero = new File(ruta);
		
		if (fichero.exists()) {
			System.out.println("Ingresa el nuevo nombre del fichero :");
			File nombreNuevo = new File (sc.nextLine().toLowerCase().trim());
			fichero.renameTo(nombreNuevo);	
			System.out.println("Fichero renombrado con exito "+nombreNuevo.getAbsolutePath());
	}else {
		System.out.println("El fichero no esxite, no se puede renombrar.");
	}
		sc.close();
	}
}
