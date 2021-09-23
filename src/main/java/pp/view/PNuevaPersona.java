package pp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class PNuevaPersona extends JPanel {
	private JTextField txtApellidos;
	private JTextField txtNombrePersona;
	private JTextField txtDniPersona;
	private JTextField txtFechanac;
	public PNuevaPersona() {
		initComponents();
	}

	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);

		setLayout(null);
		
		JLabel lblAnadirPersona = new JLabel("A\u00F1adir nueva persona");
		lblAnadirPersona.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAnadirPersona.setBounds(39, 65, 217, 25);
		add(lblAnadirPersona);
		
		JLabel lblNombrePersona = new JLabel("Nombre");
		lblNombrePersona.setBounds(39, 106, 46, 14);
		add(lblNombrePersona);
		
		txtNombrePersona = new JTextField();
		txtNombrePersona.setBounds(95, 103, 137, 20);
		add(txtNombrePersona);
		txtNombrePersona.setColumns(10);
		
		JLabel lblApellidosPersona = new JLabel("Apellidos");
		lblApellidosPersona.setBounds(283, 106, 59, 14);
		add(lblApellidosPersona);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(362, 103, 137, 20);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDniPersona = new JLabel("DNI");
		lblDniPersona.setBounds(39, 144, 46, 14);
		add(lblDniPersona);
		
		txtDniPersona = new JTextField();
		txtDniPersona.setBounds(105, 134, 137, 20);
		add(txtDniPersona);
		txtDniPersona.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha nacimiento");
		lblFechaNac.setBounds(283, 144, 99, 14);
		add(lblFechaNac);
		
		txtFechanac = new JTextField();
		txtFechanac.setBounds(391, 141, 108, 20);
		add(txtFechanac);
		txtFechanac.setColumns(10);

	}
}
