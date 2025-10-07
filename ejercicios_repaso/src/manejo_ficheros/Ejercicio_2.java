package manejo_ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*2. Pedir por teclado una ruta de fichero o carpeta 
		 * y mostrar si lo que se ha introducido existe,
		 *  si es un fichero o una carpeta y el tamaño.
            Introduce la ruta de un fichero o carpeta:
           C:\augustobriga\Ficheros\ejemplo1.txt Es un fichero.
           Tamaño: 45 bytes.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del fichero o carpeta");
		String ruta = sc.nextLine();
		File file = new File(ruta);
		
			
			if (file.isFile()) {
			System.out.println("El archivo es un fichero.");
			}else if (file.isDirectory()) {
			System.out.println("El archivo es un Directorio.");
			}else {
			System.out.println("El archivo tiene una extensión o ruta incorrecta.");
			}
			System.out.println("El tamaño del "+file+" es :"+file.length());
		
			
			
		
	
		
		
		
	}

}
