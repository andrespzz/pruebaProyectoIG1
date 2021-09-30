package pp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import pp.control.PersonaListener;
import pp.model.Persona;

import javax.swing.JButton;

/**
 * Clase descendiente de JPanel en la que se representan distintos componentes.
 * En los componentes, el usuario podrá introducir datos que posteriormente
 * serán utilizados y/o almacenados en una BBDD.
 *
 * @author jad
 * @version 1.0
 *
 */
public class PNuevaPersona extends JPanel {
	/**
	 * Variables estáticas de acceso público.
	 * 
	 * @param BTN_ANADIR  Variable estática que contiene el texto del botón Añadir
	 *                    persona.
	 * @param BTN_LIMPIAR Variable estática que contiene el texto del botón Limpiar
	 *                    campos.
	 */
	private static final long serialVersionUID = 1L;
	public static final String BTN_ANADIR = "Añadir persona";
	public static final String BTN_LIMPIAR = "Limpiar campos";

	private JTextField txtApellidos;
	private JTextField txtNombrePersona;
	private JTextField txtDniPersona;
	private JTextField txtFechanac;
	private JSpinner spnEdad;
	private JButton btnAnadirPersona;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnLimpiarCampoAnadirPersona;

	/**
	 * Método para inicializar el método que <b>initComponentes();</b>.
	 */
	public PNuevaPersona() {
		initComponents();
	}

	/**
	 * Método para definir, distribuir e inicializar componentes y características
	 * del panel.
	 */
	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);

		setLayout(null);

		JLabel lblAnadirPersona = new JLabel("AÑADIR NUEVA PERSONA");
		lblAnadirPersona.setFont(new Font("Arial", Font.BOLD, 30));
		lblAnadirPersona.setBounds(188, 70, 421, 36);
		add(lblAnadirPersona);

		JLabel lblNombrePersona = new JLabel("Nombre");
		lblNombrePersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNombrePersona.setBounds(110, 133, 78, 17);
		add(lblNombrePersona);

		txtNombrePersona = new JTextField();
		txtNombrePersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtNombrePersona.setBounds(205, 129, 137, 25);
		add(txtNombrePersona);
		txtNombrePersona.setColumns(10);

		JLabel lblApellidosPersona = new JLabel("Apellidos");
		lblApellidosPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblApellidosPersona.setBounds(367, 133, 95, 25);
		add(lblApellidosPersona);

		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtApellidos.setBounds(472, 133, 171, 25);
		add(txtApellidos);
		txtApellidos.setColumns(10);

		JLabel lblDniPersona = new JLabel("DNI");
		lblDniPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDniPersona.setBounds(110, 167, 59, 21);
		add(lblDniPersona);

		txtDniPersona = new JTextField();
		txtDniPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtDniPersona.setBounds(205, 168, 137, 26);
		add(txtDniPersona);
		txtDniPersona.setColumns(10);

		JLabel lblFechaNac = new JLabel("Fecha nacimiento");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFechaNac.setBounds(367, 169, 168, 22);
		add(lblFechaNac);

		txtFechanac = new JTextField();
		txtFechanac.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtFechanac.setToolTipText("dd/mm/yyyy");
		txtFechanac.setBounds(535, 168, 108, 26);
		add(txtFechanac);
		txtFechanac.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEdad.setBounds(110, 206, 59, 21);
		add(lblEdad);

		spnEdad = new JSpinner();
		spnEdad.setFont(new Font("Tahoma", Font.PLAIN, 19));
		spnEdad.setModel(new SpinnerNumberModel(1, 1, 120, 1));
		spnEdad.setBounds(205, 207, 53, 25);
		add(spnEdad);

		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTelefono.setBounds(367, 209, 95, 25);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtTelefono.setBounds(461, 209, 137, 25);
		add(txtTelefono);
		txtTelefono.setColumns(10);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDireccion.setBounds(110, 244, 103, 21);
		add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtDireccion.setBounds(205, 245, 438, 25);
		add(txtDireccion);
		txtDireccion.setColumns(10);

		btnAnadirPersona = new JButton(BTN_ANADIR);
		btnAnadirPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAnadirPersona.setBounds(194, 285, 171, 31);
		add(btnAnadirPersona);

		btnLimpiarCampoAnadirPersona = new JButton(BTN_LIMPIAR);
		btnLimpiarCampoAnadirPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnLimpiarCampoAnadirPersona.setBounds(393, 285, 171, 31);
		add(btnLimpiarCampoAnadirPersona);

	}

	/**
	 * Método para hacer visible el panel.
	 */
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * Método para asignar escuchadores a los componentes.
	 * 
	 * @param listener Variable que transmite funcionalidad al componente.
	 */
	public void setListener(PersonaListener listener) {
		btnAnadirPersona.addActionListener(listener);
		btnLimpiarCampoAnadirPersona.addActionListener(listener);
	}

	/**
	 * Método para recoger y controlar datos introducidos por el usuario procedentes
	 * de los componentes.
	 * 
	 * @return persona Variable de tipo Persona para almacenar datos introducidos
	 *         por el usuario en los componentes de manera temporal.
	 */
	public Persona getDatos() {
		Persona persona = null;

		String nombre = txtNombrePersona.getText();

		if (nombre.isBlank()) {
			mostrarMsjError("Debe introducir el nombre de la persona a introducir");
		} else {
			String apellidos = txtApellidos.getText();
			if (apellidos.isBlank()) {
				mostrarMsjError("Debe introducir el/los apellidos de la persona");
			} else {
				String dni = txtDniPersona.getText();

				if (dni.isBlank()) {
					mostrarMsjError("Debe introducir el DNI");
				} else if (dni.length() != 9) {
					mostrarMsjError("El DNI debe contener 9 caracteres");
				} else {
					String fechaNac = txtFechanac.getText();
					if (fechaNac.isBlank()) {
						mostrarMsjError("Debe introducir la fecha de nacimiento");
					} else {
						int edad = (int) spnEdad.getValue();
						if (edad < 1 || edad > 120) {
							mostrarMsjError("La edad debe estar comprendida entre 1 y 120");
						} else {
							String telefono = txtTelefono.getText();
							if (telefono.isBlank()) {
								mostrarMsjError("Debe introducir un número de teléfono");
							} else if (telefono.length() != 9) {
								mostrarMsjError("El número de teléfono debe contener 9 caracteres");
							} else {
								String direccion = txtDireccion.getText();
								if (direccion.isBlank()) {
									mostrarMsjError("Debe introducir una dirección");
								} else {
									persona = new Persona(dni, nombre, apellidos, fechaNac, edad, telefono, direccion);
								}
							}
						}
					}
				}
			}
		}

		return persona;
	}

	/**
	 * Método para mostrar un error de operación.
	 * 
	 * @param msj Variable contenedora del mensaje a mostrar.
	 */
	private void mostrarMsjError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error de operación", JOptionPane.ERROR_MESSAGE);

	}

	/**
	 * Método para mostrar información de una operación.
	 * 
	 * @param msj Variable contenedora del mensaje a mostrar.
	 */
	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Método para limpiar los componentes existentes en el panel.
	 */
	public void limpiarComponentes() {
		txtNombrePersona.setText("");
		txtApellidos.setText("");
		txtDniPersona.setText("");
		txtFechanac.setText("");
		spnEdad.setValue(1);
		txtTelefono.setText("");
		txtDireccion.setText("");

	}

}
