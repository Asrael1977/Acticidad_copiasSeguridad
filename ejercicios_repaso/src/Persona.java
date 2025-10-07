
public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String telefono;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, String telefono, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
		
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", edad=" + edad
				+ "]";
	}
	
	
}
