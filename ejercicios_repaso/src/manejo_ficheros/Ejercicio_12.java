package manejo_ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		/*2. Realiza un programa que añada información a un fichero como 
		 * el que se muestra en la imagen. El programa deberá pedir el
		 *  nombre de fichero y los datos de varias personas.
		 *   Si el fichero no existe, se creará. 
		 *   Si existe se añadirán registros.*/

		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String datos = "";
		boolean aniadir = true;
		System.out.println("Introduce el nombre del fichero : ");
		nombre = sc.nextLine();
		File fichero = new File(nombre);
		if (fichero.exists()) {
			
			System.out.println("El fichero ya esiste.");
		}else {
			
			System.out.println("El fichero ha sido creado con éxito.");
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,aniadir));
			System.out.println("Introduce los datos en el fichero : "+nombre);
			datos=sc.nextLine();
			bw.write(datos);
			System.out.println("Fichero escrito con exito.");
			bw.close();
			System.out.println("Fichero cerrado.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close(); 
		
	}

}
