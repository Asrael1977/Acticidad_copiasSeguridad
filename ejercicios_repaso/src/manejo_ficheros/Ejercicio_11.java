package manejo_ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		/*11. Realiza un programa que cree un fichero y añada un texto.
		 *  El programa pedirá el nombre del fichero y el texto*/
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String datos = "";
		System.out.println("Introduce el nombre del fichero : ");
		nombre = sc.nextLine();
		System.out.println("Fichero nombrado con éxito.");
		File fichero = new File(nombre);
		System.out.println("Introduce los datos que desees en el fichero : ");
		datos = sc.nextLine();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
			bw.write(datos);
			bw.close();
			System.out.println("Datos escritos con éxito en el fichero "+nombre);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}

}
