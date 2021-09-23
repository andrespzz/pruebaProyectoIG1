package pp.model;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private int Edad;
	private String telefono;
	private String direccion;

	public Persona(String dni, String nombre, String apellidos, String fechaNac, int edad, String telefono,
			String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		Edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public int getEdad() {
		return Edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

}
