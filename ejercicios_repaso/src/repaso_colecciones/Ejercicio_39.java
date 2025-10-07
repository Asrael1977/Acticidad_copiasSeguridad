package repaso_colecciones;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio_39 {


	public static void main(String[] args) {
		
		
		/*Crea una aplicación con un menú de operaciones
		 *  que nos permita trabajar con el ejercicio
		anterior.*/
		
		/*he escogido la clase persona de uno de los ejercicios anteriores,
		aunque para ahorrar en el tema de datos, he recortado el constructor
		 del objeto persona a nombre, apellidos y edad*/
		 
        Map<Integer, Persona> personas = new LinkedHashMap<Integer, Persona>();
		
	
		/*Aquí había rellenado manualmente el Map con los datos del ejercicio anterior,
        pero el ejercicionom pide eso creo.*/
        
		/*personas.put(1, new Persona("Jose","Marquez","123456789J",45,true));
		personas.put(2, new Persona("Pepa","Minguez","123456789J",35,false));
		personas.put(3, new Persona("Sandra","Martín","123456789J",20,true));
		personas.put(4, new Persona("Miguel","Pérez","123456789J",15,false));
		personas.put(5, new Persona("Pipo","Sancho","123456789J",30,true));*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		
		
		
		
System.out.println("Elige una de las opciones del menú para operar con los datos.\n");
		
		do {
		
			System.out.println("============MENÚ============\n\n"
					           + "1.- Añadir elemento.\n"
					           + "2.- Borrar elemento.\n"
					           + "3.- Listar los elementos.\n"
					           + "4.- Salir del programa.\n\n"
					         + "============================\n");

			try {
			
			opcion = Integer.parseInt(sc.nextLine());	
			
			
			switch (opcion) {
			
			case 1 : 
				
				System.out.println("Intruduce la clave númerica de la persona : ");
				int clave = Integer.parseInt(sc.nextLine());
				if (personas.containsKey(clave)) {
					System.out.println("La clave ya existe en el listado, "
							+ "vuelve a seleccionar una opción del menú");
				}else {
				System.out.println("Intruduce el nombre de la persona : ");
				String nombre = sc.nextLine().toLowerCase();
				System.out.println("Intruduce el apellido de la persona : ");
				String apellido = sc.nextLine().toLowerCase();
				System.out.println("Intruduce la edad de la persona : ");
				int edad = Integer.parseInt(sc.nextLine());
				Persona persona = new Persona(nombre,apellido,edad);
				personas.put(clave,persona);
				}
			break;
			case 2 :
				
				System.out.println("Indica la clave numérica de la persona quieres eliminar de la lista.");
				clave = Integer.parseInt(sc.nextLine());
				if (personas.containsKey(clave)) {
					personas.remove(clave);
					System.out.println("La persona seleccionada ha sido borrada de la lista.");
				}else {
					
					System.out.println("La persona seleccionada no está en la lista.");
				}
				break;
			case 3 :
				
				System.out.println("Listado de personas : ");
				/*El bucle for lo he tenido que mirar por ahí, no habiamos llegado a menjar Maps
				 *  en clase, no dio tiempo.*/
				for (Entry<Integer, Persona > entrada : personas.entrySet()) {
					
					System.out.println(entrada.toString());
				}
				break;
			case 4 :
				
				System.out.println("Saliendo del programa...hasta pronto.");
				break;
			default : 
				
				System.out.println("Introduce valores del 1 al 4, gracias.");
				break;
			}
			
			}catch(NumberFormatException e){
				
				System.out.println("Introduce valores numéricos del 1 al 4, gracias.");
			}
			
		}while (opcion !=4);
		
		sc.close();
	}

	
	
}
