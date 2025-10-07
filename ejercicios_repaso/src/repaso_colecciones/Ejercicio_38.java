package repaso_colecciones;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ejercicio_38 {

public static void main(String[] args) {
		
		/*Crea una lista de expediente-alumno sin duplicados y ordenados por orden de inserción,
		añade cinco niveles y muestra su contenido.*/
		
		Map<Integer, Persona> personas = new LinkedHashMap<Integer, Persona>();
		
	
		
		personas.put(1, new Persona("Jose","Marquez",45));
		personas.put(2, new Persona("Pepa","Minguez",35));
		personas.put(3, new Persona("Sandra","Martín",20));
		personas.put(4, new Persona("Miguel","Pérez",15));
		personas.put(5, new Persona("Pipo","Sancho",30));
		
		
		for (Map.Entry<Integer, Persona> entry : personas.entrySet()) {
			Integer key = entry.getKey();
			Persona val = entry.getValue();
			System.out.println(val);
			
		}
			
			
		
}
	
	
	
	
	
	
}
