package manejo_ficheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		/*Realiza un programa en java que pida por teclado nombres de ficheros
		 *  que iremos guardando en una lista. Finalizada la lista, 
		 *  para cada uno de esos ficheros devolverá la siguiente información:
			 Si existe
			 Si es un fichero o una carpeta
			 La ruta absoluta
			 Propiedades de lectura, escritura y ejecutar
			 El tamaño*/

		ArrayList<File> archivos = new ArrayList<File>();
		
		Scanner sc = new Scanner(System.in);
		
		String fichero;
		
		System.out.println("Introduce el nombre del fichero "
				+ "que quieras guardar en la lista, escribe \"salir\",\n"
				+ "para terminar el programa y mostar"
				+ " la información de los ficheros. ");
		
		do {
		
			
			fichero = sc.nextLine();
			System.out.print("Nombre del fichero : "+fichero+"\n");
			File nuevoFile = new File(fichero);
			archivos.add(nuevoFile);
			System.out.println("Fichero añadido correctamente.");
			
		}while(!fichero.equals("salir"));
		
		for (File f : archivos) {
			
			if (f.exists()) {
				
				System.out.println("Fichero existe.");
			    System.out.println("Fichero : "+f.isFile()+"  Carpeta :"
			    		+ " "+f.isDirectory());
			    System.out.print("La ruta del fichero es : ");
			    System.out.println(f.getAbsolutePath());
			    System.out.print("los permisos del fichero son : ");
			    if(f.canRead()) {
			    	System.out.print("r");
			    }else{
			    	System.out.print("-");
			    }
			    if(f.canWrite()) {
			    	System.out.print("w");
			    }else{
			    	System.out.print("-");
			    }
			    if(f.canExecute()) {
			        System.out.print("x");
			    }else {
			        System.out.print("-\n");
			    }
			   System.out.print("El tamaño del archivo es : "+f.length()+" bytes.\n"); 
			    
			}else {
				
				System.out.print("El archivo no existe.");
			}
		
			sc.close();
		}
		
	}

}
/*He intentado realizar una salida exacta como la del ejercicio,
pero no he sido capaz, no me fijé en como habias hecho tú el bucle
 cuando lo pusiste en la pizarra difgital, ya me lo explicas a ver si mejoro*/