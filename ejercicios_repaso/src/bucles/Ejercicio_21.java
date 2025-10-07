package bucles;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		
		/*Escribe un programa que permita al usuario ingresar un número y
		 *  muestre su tabla de multiplicar del 1 al 10. Luego, pregunta si 
		 *  el usuario quiere calcular otra tabla y repite el proceso si responde "sí".*/
		
        Scanner sc = new Scanner(System.in);
        
        int resultado;
        
        boolean repetir = false;
        
        //operador ternario, creo que mal usado, no tengo mucha práctica en ello.
        String otraVez = (repetir) ? "si" : "no";
        
        do {
        	
		System.out.println("Escribe un número para crear su tabla de multiplicar.");
		int numero = Integer.parseInt(sc.nextLine());
		
		for (int i=1; i<11; i++) {
			
			 resultado = numero * i;
			
			
			
			System.out.println(numero+" x "+ (i)+" = "+resultado );
		}
		
		System.out.println("Quieres repetir con otro número, responde si o no.");
		otraVez = sc.nextLine().toLowerCase();
		
		
        }while(otraVez != "si");
        	
        	
		sc.close();
	}

}
