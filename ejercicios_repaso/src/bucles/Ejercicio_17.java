package bucles;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		//Escribir la tabla de multiplicar de un número dado

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número para crear su tabla de multiplicar.");
		int numero = Integer.parseInt(sc.nextLine());
		
		for (int i=1; i<11; i++) {
			
			int resultado = numero * i;
			
			
			
			System.out.println(numero+" x "+ (i)+" = "+resultado );
		}
		
		sc.close();
	}

}
