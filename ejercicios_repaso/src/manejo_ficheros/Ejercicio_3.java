package manejo_ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
	
/*3. Mostrar el contenido de una carpeta cuya ruta 
 * se pide por teclado comprobando que existe y que es una carpeta. 
 * Del contenido se debe mostrar el nombre, si es fichero o carpeta,
 *  y las propiedades rwx.
introduce una ruta carpeta C:\augustobriga\Ficheros
Contenido de C:\augustobriga\Ficheros Nombre:ejemplo1.txt Fichero rwx*/
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce la ruta de la carpeta: ");
	String ruta = sc.nextLine().trim();
	File file = new File(ruta);
	if (file.exists()) {
		if (file.isDirectory()){
		System.out.println("El archivo es un directorio.\n");
		File[] aFile = file.listFiles();
		System.out.println("El listado de la carpeta "+file.getName()+" es :\n");
		  
		for(File f: aFile) {
			System.out.print("El nombre es : ");
			System.out.println(f.getName());
			if(f.isDirectory()) {
				System.out.println("Es un directorio ");
				if(f.canRead()) {
					System.out.print("Los permisos son : ");
					System.out.print("r");
				}else {
					System.out.print("-");
				}
				if(f.canWrite()) {
					System.out.print("w");
				}else {
					System.out.print("-");
				}
				if (f.canExecute()) {
					System.out.println("x");
				}else {
					System.out.println("-");
				}
				System.out.println("Los bytes son : "+f.length()+"\n");
			}else if (f.isFile()) {
				System.out.println("Es un fichero ");
				
				if(f.canRead()) {
					System.out.print("Los permisos son : ");
					System.out.print("r");
				}else {
					System.out.print("-");
				}
				if(f.canWrite()) {
					System.out.print("w");
				}else {
					System.out.print("-");
				}
				if (f.canExecute()) {
					System.out.println("x");
				}else {
					System.out.println("-");
				}
				System.out.println("Los bytes son : "+f.length()+"\n");
			}else {
				System.out.println("No es un fichero, ni un directorio.");
			}
			
		}
		}else if (file.isFile()) {
			System.out.println("El archivo es un fichero.");
			
		}else {
			System.out.println("El archivo no se sabe lo que es, hay algún error");
		}
	}else {
		
		System.out.println("El archivo no existe.");
	}
	
		
	}

}
