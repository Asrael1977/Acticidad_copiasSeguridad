package excepciones_repaso;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_0_a_100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		do {
		
		try {
			
			System.out.println("Introduce un número del 0 al 100.\n");	
			
		 numero = Integer.parseInt(sc.nextLine());
		
		if (numero < 0 || numero > 100) {
			
			System.out.println("Introduce valores enteros positivos entre 0 y 100.");
		}else {
			
			
			System.out.println("El número es : "+numero);
		}
	
		}catch(NumberFormatException e) {
			
			System.out.println("Introduce números enteros, por favor...");
		
	} 
		}while(numero < 0 || numero > 100);
	sc.close();

		}
		}
