package manejo_ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		/* Crear una carpeta cuyo nombre se pide por teclado 
 * en la ruta por defecto. 
 * Comprobar antes de crear comprobar que la carpetano existe.
       Introduce el nombre de la carpeta
C:\augustobriga\Ficheros\ejercicio4
       Carpeta creada con éxito*/
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce la ruta para crear una carpeta :");
		String ruta = sc.nextLine().trim();
		File carpeta = new File(ruta);
		
		if (carpeta.exists()) {
			System.out.println("La carpeta ya existe.");
		}else {
			if (carpeta.mkdir()) {
				System.out.println("Carpeta creada con éxito : "+carpeta.getAbsolutePath());
			}else {
				
				System.out.println("No se ha podido crear la carpeta");
			}
			
				
		}
		sc.close();
	}

}
