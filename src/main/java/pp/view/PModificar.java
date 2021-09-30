package pp.view;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import pp.control.PersonaListener;
import pp.model.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

/**
 * Clase descendiente de JPanel en la que se representan distintos componentes
 * que permiten mostrar y editar datos de una persona existente en la BBDD.
 * 
 * @author jad
 * @version 1.0
 *
 */
public class PModificar extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * BTN_BUSCAR Variable estática que contiene el texto del botón Buscar.
	 */
	public static final String BTN_BUSCAR = "Buscar persona";
	/**
	 * BTN_GUARDAR Variable estática que contiene el texto del botón Guardar
	 * cambios.
	 */
	public static final String BTN_GUARDAR = "Guardar Cambios";
	/**
	 * BTN_CANCELAR Variable estática que contiene el texto del botón Cancelar.
	 */
	public static final String BTN_CANCELAR = "Cancelar";

	/**
	 * txtApellidos Variable privada de tipo JTextField para la caja de texto
	 * txtApellidos.
	 */
	private JTextField txtApellidos;

	/**
	 * txtNombrePersona Variable privada de tipo JTextField para la caja de texto
	 * txtNombrePersona.
	 */
	private JTextField txtNombrePersona;

	/**
	 * txtDniPersona Variable privada de tipo JTextField para la caja de texto
	 * txtDniPersona.
	 */
	private JTextField txtDniPersona;

	/**
	 * txtFechanac Variable privada de tipo JTextField para la caja de texto
	 * txtFechanac.
	 */
	private JTextField txtFechanac;

	/**
	 * xtTelefono Variable privada de tipo JTextField para la caja de texto
	 * txtTelefono.
	 */
	private JTextField txtTelefono;

	/**
	 * txtDireccion Variable privada de tipo JTextField para la caja de texto
	 * txtDireccion.
	 */
	private JTextField txtDireccion;

	/**
	 * spnEdad Variable privada de tipo JSpinner para introducir la edad.
	 */
	private JSpinner spnEdad;

	/**
	 * btnGuardarCambios Variable privada de tipo JButton para el boton
	 * btnGuardarCambios.
	 */
	private JButton btnGuardarCambios;

	/**
	 * btnCancelar Variable privada de tipo JButton para el boton btnCancelar.
	 */
	private JButton btnCancelar;

	/**
	 * btnBuscar Variable privada de tipo JButton para el boton btnBuscar.
	 */
	private JButton btnBuscar;

	/**
	 * Método para inicializar el método <b>initComponents();</b>.
	 */
	public PModificar() {
		initComponents();
	}

	/**
	 * Método para definir, distribuir e inicializar componentes y características
	 * del panel.
	 */
	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);
		setLayout(null);

		JLabel lblTitulo = new JLabel("MODIFICAR PERSONA");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitulo.setBounds(230, 79, 367, 25);
		add(lblTitulo);

		JLabel lblNombrePersona = new JLabel("Nombre");
		lblNombrePersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNombrePersona.setBounds(88, 130, 85, 28);
		add(lblNombrePersona);

		txtNombrePersona = new JTextField();
		txtNombrePersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtNombrePersona.setColumns(10);
		txtNombrePersona.setBounds(177, 130, 183, 28);
		add(txtNombrePersona);

		JLabel lblApellidosPersona = new JLabel("Apellidos");
		lblApellidosPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblApellidosPersona.setBounds(385, 132, 117, 25);
		add(lblApellidosPersona);

		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(493, 130, 183, 28);
		add(txtApellidos);

		JLabel lblDniPersona = new JLabel("DNI");
		lblDniPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDniPersona.setBounds(88, 173, 61, 20);
		add(lblDniPersona);

		txtDniPersona = new JTextField();
		txtDniPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtDniPersona.setColumns(10);
		txtDniPersona.setBounds(177, 169, 183, 28);
		add(txtDniPersona);

		JLabel lblFechaNac = new JLabel("Fecha nacimiento");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFechaNac.setBounds(385, 171, 172, 25);
		add(lblFechaNac);

		txtFechanac = new JTextField();
		txtFechanac.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtFechanac.setToolTipText("dd/mm/yyyy");
		txtFechanac.setColumns(10);
		txtFechanac.setBounds(547, 171, 129, 25);
		add(txtFechanac);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEdad.setBounds(88, 210, 61, 25);
		add(lblEdad);

		spnEdad = new JSpinner();
		spnEdad.setFont(new Font("Tahoma", Font.PLAIN, 19));
		spnEdad.setBounds(177, 208, 61, 28);
		add(spnEdad);

		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTelefono.setBounds(385, 215, 91, 20);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(471, 213, 140, 25);
		add(txtTelefono);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDireccion.setBounds(88, 249, 129, 25);
		add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(208, 247, 468, 28);
		add(txtDireccion);

		btnGuardarCambios = new JButton(BTN_GUARDAR);
		btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnGuardarCambios.setBounds(197, 335, 202, 36);
		add(btnGuardarCambios);

		btnCancelar = new JButton(BTN_CANCELAR);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCancelar.setBounds(425, 335, 172, 36);
		add(btnCancelar);

		btnBuscar = new JButton(BTN_BUSCAR);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBuscar.setBounds(303, 293, 183, 31);
		add(btnBuscar);

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
		btnBuscar.addActionListener(listener);
		btnGuardarCambios.addActionListener(listener);
		btnCancelar.addActionListener(listener);
	}

	/**
	 * Método para recoger y controlar datos introducidos por el usuario procedentes
	 * de los componentes.
	 * 
	 * @return persona Variable de tipo Persona para almacenar datos introducidos
	 *         por el usuario en los componentes de manera temporal.
	 */
	public Persona getDatos() {
		Persona persIn = null;

		String nombre = txtNombrePersona.getText().trim();

		if (nombre.isEmpty()) {
			mostrarError("Debe introducir el nombre");
		} else {
			String apellidos = txtApellidos.getText();
			String dni = txtDniPersona.getText();

			if (dni.isEmpty()) {
				mostrarError("Debe introducir el dni");
			} else {
				String fechaNac = txtFechanac.getText();
				int edad = (int) spnEdad.getValue();
				String telefono = txtTelefono.getText();
				String direccion = txtDireccion.getText();

				persIn = new Persona(dni, nombre, apellidos, fechaNac, edad, telefono, direccion);
			}

		}
		return persIn;

	}

	/**
	 * Método para mostrar un error de operación.
	 * 
	 * @param msj Variable contenedora del mensaje a mostrar.
	 */
	public void mostrarError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Método para mostrar información de operación.
	 * 
	 * @param msj Variable contenedora del mensaje a mostrar.
	 */
	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Método para recoger el texto de un componente, en este caso, el nombre de la
	 * persona introducida por el usuario.
	 * 
	 * @return nomPers Retorna el contenido del componente (texto).
	 */
	public String getNomPersona() {
		String nomPers = txtNombrePersona.getText();
		return nomPers;
	}

	/**
	 * Método para cargar datos de una persona pasada como parámetro.
	 * 
	 * @param persona Variable de tipo Persona que permite obtener la información de
	 *                cada variable del objeto Persona.
	 */
	public void cargarDatos(Persona persona) {
		txtNombrePersona.setText(persona.getNombre());
		txtApellidos.setText(persona.getApellidos());
		txtDniPersona.setText(persona.getDni());
		txtFechanac.setText(persona.getFechaNac());
		spnEdad.setValue(persona.getEdad());
		txtTelefono.setText(persona.getTelefono());
		txtDireccion.setText(persona.getDireccion());

	}

	/**
	 * Método para limpiar los componentes del panel.
	 */
	public void limpiarComponentes() {
		txtNombrePersona.setText("");
		txtApellidos.setText("");
		txtDniPersona.setText("");
		txtFechanac.setText("");
		txtTelefono.setText("");
		txtDireccion.setText("");
		spnEdad.setValue(1);

	}

}
