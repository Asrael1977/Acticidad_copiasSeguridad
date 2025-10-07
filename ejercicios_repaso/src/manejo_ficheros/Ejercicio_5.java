package manejo_ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		/*5. Crear un fichero cuyo nombre se pide por teclado en la ruta
		 *  por defecto. Comprobar antes de crear que el fichero no existe.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta para crear un fichero :");
		String ruta = sc.nextLine().trim();
		File fichero = new File(ruta);
		
		if (fichero.exists()) {
			System.out.println("El fichero ya existe.");
		}else {
			try {
				if (fichero.createNewFile()) {
					System.out.println("fichero creado con éxito : "+fichero.getAbsolutePath());
				}else {
					
					System.out.println("No se ha podido crear la carpeta");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
		}
		sc.close();
	}

}
	


