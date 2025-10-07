package ejercicios_repaso;

import java.util.Scanner;

public class Electrodomesticos_Interes {
	
	public static double financiacionElectrodomestico (double precioElectrodomestico) {
		
		double cuota = precioElectrodomestico/3;
		
	double plazo1 = cuota + ((cuota*2.5)/100);
	
	System.out.println("El primer pago del electrodoméstico es : "+plazo1);
	
	double plazo2 = plazo1 + ((plazo1*5)/100);
		
	System.out.println("El segundo pago del electrodoméstico es : "+plazo2);

	double plazo3 = plazo2 + ((plazo2*10)/100);
	
	System.out.println("El tercer plazo del elctrodoméstico es : "+plazo3);
	
	double precioFinal = plazo1+plazo2+plazo3;
	
	System.out.print("El precio final del electrodomestico es : ");
	
	return precioFinal;
		
		
	}
	
	public static void main(String[] args) {
		/* Imagina que tenemos una tienda de electrodomésticos y 
		 * sacamos una nueva campaña para financiar la compra de 
		 * electrodomésticos en 3 meses a un 2,5 % de interés creciente doble.
		 *  Se solicita al usuario el precio del electrodoméstico y 
		 *  queremos saber el pago de cada cuota mensual y el total a pagar.*/

		Scanner sc = new Scanner(System.in);
		
		double cantidad = 0;
		
		System.out.println("Introduce la cantidad a financiar : ");
		cantidad = Double.parseDouble(sc.nextLine());
		
		System.out.println(financiacionElectrodomestico(cantidad));
		
	}

}
