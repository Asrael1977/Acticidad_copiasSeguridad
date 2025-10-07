package manejo_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		/*13. Muestra en pantalla el contenido de un fichero de texto 
		 * cuya ruta se pasa por consola. Leeremos por carácter.*/
		
		Scanner sc = new Scanner(System.in);
		
		String nombreFichero = "";
		char letra;
		int caracter;
		
		System.out.println("Introduce el nombre del fichero para leerlo :");
	    nombreFichero = sc.nextLine();
		try {
			FileReader fichero = new FileReader(nombreFichero);
			try {
				while((caracter=fichero.read())!=-1) {
					letra =(char) caracter;
					System.out.print(letra);
				}
			} catch (IOException e) {
				try {
					fichero.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
