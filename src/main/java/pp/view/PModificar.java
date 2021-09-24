package pp.view;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class PModificar extends JPanel {
	private JTextField txtApellidos;
	private JTextField txtNombrePersona;
	private JTextField txtDniPersona;
	private JTextField txtFechanac;
	private JSpinner spnEdad;

	public PModificar() {
		initComponents();
	}

	private void initComponents() {
		setSize(PersonaVP.ANCHO - 70, PersonaVP.ALTO - 30);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar persona");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(36, 22, 217, 25);
		add(lblNewLabel);

	}

	public void hacerVisible() {
		setVisible(true);
	}
}
