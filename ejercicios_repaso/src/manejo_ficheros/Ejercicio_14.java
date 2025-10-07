package manejo_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombreFichero,linea;
		
		try {
		System.out.println("Introduce el nombre del fichero para leerlo :");
	    nombreFichero = sc.nextLine();
	
		BufferedReader fichero = new BufferedReader(new FileReader(nombreFichero));
		try {
			while((linea=fichero.readLine())!=null){
			System.out.print(linea);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 sc.close();
	}

}
