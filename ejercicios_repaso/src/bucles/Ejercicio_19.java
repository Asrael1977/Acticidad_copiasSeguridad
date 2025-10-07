package bucles;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		//Pedir al usuario un número positivo. Si el número es negativo, sigue pidiéndolo.

		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			
		System.out.println("Escribe un número : ");
		numero = Integer.parseInt(sc.nextLine());
		
		}while (numero < 0); 
			
		
		sc.close();
	}

}
