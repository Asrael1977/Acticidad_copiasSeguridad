package excepciones_repaso;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Control_Excepciones {
	
	   public static void main(String[] args) {
	
	// 1. Conversión inválida de String a int
		   
	try {	   
    String invalido = "abc";
    int numero = Integer.parseInt(invalido); 
	}catch(NumberFormatException e ) {
		
		System.out.println("Debes introducir solamente números");
	}
    
    
    

    // 2. División por cero
	try {
	
    int resultado = 10 / 0; 
	}catch(ArithmeticException e) {
		
		System.out.println("No se puede dividir entre cero, resultado indefinido.");
	}
    
    
    
    // 3. Operación sobre variable null
	try {
		
	
    String texto = null;
    int longitud = texto.length(); 
	}catch(NullPointerException e) {
		
		System.out.println("Intento de acceso a un valor nulo.");
	}
    
    
    
    // 4. Acceso a índice inválido en lista
	try {
    List<String> lista = new ArrayList<>();
    lista.add("A");
    String valor = lista.get(2); 
	}catch(IndexOutOfBoundsException e) {
		
		System.out.println("El array no tiene ningún elemento en el índice indicado.");
	}
    
    
    
    // 5. Modificación de colección durante iteración
	try {
    List<String> nombres = new ArrayList<>();
    nombres.add("Ana");
    nombres.add("Luis");

    for (String nombre : nombres) {
        if (nombre.equals("Ana")) {
            nombres.remove(nombre); 
        }
    }
	}catch(ConcurrentModificationException e) {
		 
	
		System.out.println("No se puede modificar la coleción durante este tipo de iteración.");
		
	}
}

}

