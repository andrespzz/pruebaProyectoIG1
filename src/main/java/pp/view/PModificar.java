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

public class PModificar extends JPanel {
	private static final long serialVersionUID = 1L;
	
	//BOTONES
	public static final String BTN_BUSCAR = "Buscar persona";
	public static final String BTN_GUARDAR = "Guardar Cambios";
	public static final String BTN_CANCELAR = "Cancelar";

	private JTextField txtApellidos;
	private JTextField txtNombrePersona;
	private JTextField txtDniPersona;
	private JTextField txtFechanac;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JSpinner spnEdad;
	private JButton btnGuardarCambios;
	private JButton btnCancelar;
	private JButton btnBuscar;

	public PModificar() {
		initComponents();
	}

	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);
		setLayout(null);

		JLabel lblTitulo = new JLabel("Modificar persona");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTitulo.setBounds(36, 22, 217, 25);
		add(lblTitulo);

		JLabel lblNombrePersona = new JLabel("Nombre");
		lblNombrePersona.setBounds(36, 75, 46, 14);
		add(lblNombrePersona);

		txtNombrePersona = new JTextField();
		txtNombrePersona.setColumns(10);
		txtNombrePersona.setBounds(92, 72, 137, 20);
		add(txtNombrePersona);

		JLabel lblApellidosPersona = new JLabel("Apellidos");
		lblApellidosPersona.setBounds(280, 75, 59, 14);
		add(lblApellidosPersona);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(359, 72, 137, 20);
		add(txtApellidos);

		JLabel lblDniPersona = new JLabel("DNI");
		lblDniPersona.setBounds(36, 113, 46, 14);
		add(lblDniPersona);

		txtDniPersona = new JTextField();
		txtDniPersona.setColumns(10);
		txtDniPersona.setBounds(92, 110, 137, 20);
		add(txtDniPersona);

		JLabel lblFechaNac = new JLabel("Fecha nacimiento");
		lblFechaNac.setBounds(280, 113, 107, 14);
		add(lblFechaNac);

		txtFechanac = new JTextField();
		txtFechanac.setToolTipText("dd/mm/yyyy");
		txtFechanac.setColumns(10);
		txtFechanac.setBounds(397, 110, 99, 20);
		add(txtFechanac);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(36, 152, 46, 14);
		add(lblEdad);

		spnEdad = new JSpinner();
		spnEdad.setBounds(92, 149, 53, 20);
		add(spnEdad);

		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(280, 152, 69, 14);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(359, 149, 137, 20);
		add(txtTelefono);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(36, 190, 64, 14);
		add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(110, 187, 137, 20);
		add(txtDireccion);

		btnGuardarCambios = new JButton(BTN_GUARDAR);
		btnGuardarCambios.setBounds(135, 218, 172, 23);
		add(btnGuardarCambios);

		btnCancelar = new JButton(BTN_CANCELAR);
		btnCancelar.setBounds(380, 218, 172, 23);
		add(btnCancelar);

		btnBuscar = new JButton(BTN_BUSCAR);
		btnBuscar.setBounds(523, 71, 154, 23);
		add(btnBuscar);

	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void setListener(PersonaListener listener) {
		btnBuscar.addActionListener(listener);
		btnGuardarCambios.addActionListener(listener);
		btnCancelar.addActionListener(listener);
	}

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

	public void mostrarError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);

	}

	public String getNomPersona() {
		String nomPers = txtNombrePersona.getText();
		return nomPers;
	}

	public void cargarDatos(Persona persona) {
		txtNombrePersona.setText(persona.getNombre());
		txtApellidos.setText(persona.getApellidos());
		txtDniPersona.setText(persona.getDni());
		txtFechanac.setText(persona.getFechaNac());
		spnEdad.setValue(persona.getEdad());
		txtTelefono.setText(persona.getTelefono());
		txtDireccion.setText(persona.getDireccion());

	}

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
