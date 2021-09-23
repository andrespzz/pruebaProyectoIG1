package pp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import pp.model.Persona;

import javax.swing.JButton;

public class PNuevaPersona extends JPanel {
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

	public PNuevaPersona() {
		initComponents();
	}

	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);

		setLayout(null);

		JLabel lblAnadirPersona = new JLabel("A\u00F1adir nueva persona");
		lblAnadirPersona.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAnadirPersona.setBounds(36, 22, 217, 25);
		add(lblAnadirPersona);

		JLabel lblNombrePersona = new JLabel("Nombre");
		lblNombrePersona.setBounds(36, 63, 46, 14);
		add(lblNombrePersona);

		txtNombrePersona = new JTextField();
		txtNombrePersona.setBounds(92, 60, 137, 20);
		add(txtNombrePersona);
		txtNombrePersona.setColumns(10);

		JLabel lblApellidosPersona = new JLabel("Apellidos");
		lblApellidosPersona.setBounds(280, 63, 59, 14);
		add(lblApellidosPersona);

		txtApellidos = new JTextField();
		txtApellidos.setBounds(359, 60, 137, 20);
		add(txtApellidos);
		txtApellidos.setColumns(10);

		JLabel lblDniPersona = new JLabel("DNI");
		lblDniPersona.setBounds(36, 101, 46, 14);
		add(lblDniPersona);

		txtDniPersona = new JTextField();
		txtDniPersona.setBounds(92, 98, 137, 20);
		add(txtDniPersona);
		txtDniPersona.setColumns(10);

		JLabel lblFechaNac = new JLabel("Fecha nacimiento");
		lblFechaNac.setBounds(280, 101, 107, 14);
		add(lblFechaNac);

		txtFechanac = new JTextField();
		txtFechanac.setBounds(397, 98, 99, 20);
		add(txtFechanac);
		txtFechanac.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(36, 140, 46, 14);
		add(lblEdad);

		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(1, 1, 120, 1));
		spnEdad.setBounds(92, 137, 53, 20);
		add(spnEdad);

		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(280, 140, 69, 14);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(359, 137, 137, 20);
		add(txtTelefono);
		txtTelefono.setColumns(10);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(36, 178, 64, 14);
		add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(110, 175, 137, 20);
		add(txtDireccion);
		txtDireccion.setColumns(10);

		btnAnadirPersona = new JButton(BTN_ANADIR);
		btnAnadirPersona.setBounds(135, 206, 128, 23);
		add(btnAnadirPersona);

		JButton btnLimpiarCampoAnadirPersona = new JButton(BTN_LIMPIAR);
		btnLimpiarCampoAnadirPersona.setBounds(280, 206, 128, 23);
		add(btnLimpiarCampoAnadirPersona);

	}

	public void hacerVisible() {
		setVisible(true);
	}

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
							} else {
								String direccion = txtDireccion.getText();
								if (direccion.isBlank()) {
									mostrarMsjError("Debe introducir una dirección");
								}
							}
						}
					}
				}
			}
		}

		return persona;
	}

	private void mostrarMsjError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error de operación", JOptionPane.ERROR_MESSAGE);

	}
}
