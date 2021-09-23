package pp.model;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private String fechaNac;
	private int Edad;
	private String telefono;
	private String direccion;

	public Persona(String nombre, String apellidos, String dni, String fechaNac, int edad, String telefono,
			String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNac = fechaNac;
		Edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
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
