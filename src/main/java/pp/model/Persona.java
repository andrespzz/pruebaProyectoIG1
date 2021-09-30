package pp.model;

/**
 * Clase que define la estructura del objeto persona.
 * 
 * @version 1.0
 * @author jad
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private int Edad;
	private String telefono;
	private String direccion;

	/**
	 * Constructor de la clase persona.
	 * 
	 * @param dni       Variable para almacenar DNI de la persona.
	 * @param nombre    Variable para almacenar el nombre de la persona.
	 * @param apellidos Variable para almacenar los apellidos de la persona.
	 * @param fechaNac  Variable para almacenar la fecha de nacimiento de la
	 *                  persona.
	 * @param edad      Variable para almacenar la edad de la persona.
	 * @param telefono  Variable para almacenar el número de teléfono de la persona.
	 * @param direccion Variable para almacenar la dirección de la persona.
	 */
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

	/**
	 * Método para obtener el DNI de la persona.
	 * 
	 * @return Retorna el DNI.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método para obtener el nombre de la persona.
	 * 
	 * @return Retorna el nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para obtener los apellidos de la persona.
	 * 
	 * @return Retorna los apellidos de la persona.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método para obtener la fecha de nacimiento de la persona.
	 * 
	 * @return Retorna la fecha de nacimiento de la persona.
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * Método para obtener la edad de la persona.
	 * 
	 * @return Retorna la edad de la persona.
	 */
	public int getEdad() {
		return Edad;
	}

	/**
	 * Método para obtener el número de teléfono de la persona.
	 * 
	 * @return Retorna el número de teléfono de la persona.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método para obtener la dirección de la persona.
	 * 
	 * @return Retorna la dirección de la persona.
	 */
	public String getDireccion() {
		return direccion;
	}

}
