package pp.view;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

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
		
	}

}
