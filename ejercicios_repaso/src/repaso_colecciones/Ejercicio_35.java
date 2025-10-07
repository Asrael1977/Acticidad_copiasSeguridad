package repaso_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_35 {

public static void main(String[] args) {
		
		/*Crea una aplicación con un menú de operaciones que nos permita trabajar
		 *  uno de los
		ejercicios anteriores.
		1.- Añadir elemento
		2.- Borrar elemento
		3.- Listar
		4.- Salir*/
		
		ArrayList<String> nombres = new ArrayList<String>();
		//He cogido un ArrayList de  un ejercicio anterior
		nombres.add("Pepe");
		nombres.add("Sandra");
		nombres.add("Pepe");
		nombres.add("Mima");
		nombres.add("Mima");
	/*Como tienen la primera en mayúscula,
	 *  he enredado un poco, para ponerlos todos con las primeras 
	 *  letras en minuscula y no tener problemas a la hora de borrar elementos*/
		for (int i =0; i< nombres.size(); i++) {
			String letra1 = nombres.get(i);
			nombres.set(i, letra1.toLowerCase());
		}
		
		Scanner sc = new Scanner(System.in);
		
	//Variable para la opción del swicth.
		int opcion = 0;
		
		
		
System.out.println("Elige una de las opciones del menú para operar con los datos.\n");
		
		do {
		
			System.out.println("============MENÚ============\n\n"
					           + "1.- Añadir elemento.\n"
					           + "2.- Borrar elemento.\n"
					           + "3.- Listar los elementos.\n"
					           + "4.- Salir del programa.\n\n"
                               + "============================\n");
			//Lo del try-catch aun no lo controlo del todo.
			
			try {
			opcion = Integer.parseInt(sc.nextLine());	
			
		
	
			switch (opcion) {
			
			case 1 : 
				
				System.out.println("Introduce el nombre en la lista : ");
				String nombre = sc.nextLine().toLowerCase();
				nombres.add(nombre);
				System.out.println("El elemento "+nombre+" ha sido añadido.");
			break;

			case 2 : 
				
				System.out.println("Indica el nombre que quieres borrar : ");
			    nombre = sc.nextLine().toLowerCase();
			    //tenía hecho esto con el break...he buscado otro modo controlandolo también.
				/*for (String s : nombres) {
					nombres.remove(nombre);
					break;
				}*/
			    if (nombres.contains(nombre)) {
			    	nombres.remove(nombre);
			    	System.out.println("El elemento "+nombre+" ha sido borrado.\n");
			    }else {
			    
			    	System.out.println("El elemento "+nombre+" no está en la lista.");			    }
				break;
				
			case 3 :
				
				System.out.println("El Listado de elementos es : \n");
				if( nombres.isEmpty()) {
					System.out.println("El listado está vacio, coño.");
				}else {
				for (String s : nombres) {
					
					System.out.println(s);
				}
				}
				break;
				
			case 4: 
				
				System.out.println("Saliendo del programa, hasta pronto...");
			break;
			
			default :
				
				System.out.println("Error, solo acepta valores del 1 al 4.");
			break;
			
			}
			}catch (NumberFormatException e){
				
				System.out.println("Has metido la gamba, sólo acepta valores del 1 al 4. ");
			}
	
		}while (opcion != 4);
		
		sc.close();
	}



}

	
	

