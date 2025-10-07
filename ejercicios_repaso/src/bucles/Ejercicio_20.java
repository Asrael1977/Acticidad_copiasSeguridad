package bucles;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		/* Escribe un programa que permita al usuario adivinar un número entre 1 y 100.
		 El programa debe guiar al usuario diciéndole si el número es mayor o menor
		 que el que ingresó.*/

		int aleatorio = (int)(Math.random()*100);
		 
		System.out.println("Vamos a jugar al juego de adivina un número del 0 al 100.\n");

		Scanner sc = new Scanner(System.in);
		
		
		int numero =0; ;
		 
		int intentos=0;
		 
		 while (numero != aleatorio) {
			 
			 System.out.println("Introduce un número del 0 al 100 : ");
			 numero = Integer.parseInt(sc.nextLine());
		
			 
			 if (numero < 0 || numero >100) {	 
				 
				 System.out.println("Te he dicho que introduzcas un número del 0 al 100, coño. ");
						 
		     }else {
		    	 
			  if (numero < aleatorio) {
				 
				 System.out.println("El número a adivinar es mayor.");
				 
				 intentos++;
				 
			 }else if (numero > aleatorio) {
				 
                 System.out.println("El número a adivinar es menor.");
				 
				 intentos++;
				 
			 }
			 
		     } 
		 }
		 
		System.out.println("Enhorabuena has adivinado el número "
	                   + ""+aleatorio+" en "+intentos+" intentos"); 
		sc.close();
	}

}
