package pp.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pp.control.PersonaListener;
import pp.model.Persona;

import java.awt.Font;
import java.util.ArrayList;

public class PEliminarPersona extends JPanel {
	
	public static final String CLM_DNI = "DNI";
	public static final String CLM_NOMBRE = "NOMBRE";
	public static final String CLM_APELLIDOS = "APELLIDOS";
	public static final String CLM_FECHA = "FECHA";
	public static final String CLM_EDAD = "EDAD";
	public static final String CLM_DIRECCION = "DIRECCIÓN";
	public static final String CLM_TELEFONO = "TELÉFONO";
	public static final String BTN_ELIMINAR = "Eliminar";
	
	private JTable tblEliminarPersonas;
	private JButton btnElimnarPersona;
	private JScrollPane scrpListaEliminarPersonas;
	private DefaultTableModel tblModel;
	
	public PEliminarPersona() {
		initComponent();
		
	}

	private void initComponent() {
		setLayout(null);
		setSize(PersonaVP.ANCHO - 30, PersonaVP.ALTO - 70);
		
		scrpListaEliminarPersonas = new JScrollPane();
		scrpListaEliminarPersonas.setBounds(48, 163, 674, 273);
		add(scrpListaEliminarPersonas);
		
		tblEliminarPersonas = new JTable();
		scrpListaEliminarPersonas.setViewportView(tblEliminarPersonas);
		
		btnElimnarPersona = new JButton(BTN_ELIMINAR);
		btnElimnarPersona.setBounds(556, 117, 118, 23);
		add(btnElimnarPersona);
		
		JLabel lblInformacionEliminar = new JLabel("Selecciona una persona para eliminar");
		lblInformacionEliminar.setBounds(48, 117, 198, 23);
		add(lblInformacionEliminar);
		
		JLabel lblEliminarPersona = new JLabel("Eliminar Persona");
		lblEliminarPersona.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEliminarPersona.setBounds(48, 50, 175, 32);
		add(lblEliminarPersona);
	}
	
	private void configurarTabla() {
		tblModel = new DefaultTableModel() {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tblModel.addColumn(CLM_DNI);
		tblModel.addColumn(CLM_NOMBRE);
		tblModel.addColumn(CLM_APELLIDOS);
		tblModel.addColumn(CLM_FECHA);
		tblModel.addColumn(CLM_EDAD);
		tblModel.addColumn(CLM_TELEFONO);
		tblModel.addColumn(CLM_DIRECCION);
		
		
		tblEliminarPersonas.setModel(tblModel);
		
		tblEliminarPersonas.getColumn(CLM_DNI).setPreferredWidth(100);
		tblEliminarPersonas.getColumn(CLM_NOMBRE).setPreferredWidth(100);
		tblEliminarPersonas.getColumn(CLM_APELLIDOS).setPreferredWidth(100);
		tblEliminarPersonas.getColumn(CLM_FECHA).setPreferredWidth(100);
		tblEliminarPersonas.getColumn(CLM_EDAD).setPreferredWidth(50);
		tblEliminarPersonas.getColumn(CLM_TELEFONO).setPreferredWidth(100);
		tblEliminarPersonas.getColumn(CLM_DIRECCION).setPreferredWidth(200);
		
	}
	
	public void cargarTabla(ArrayList<Persona> listaPersonas) {
		tblModel.setRowCount(0);
		Object[] fila = new Object[7];
		
		for (Persona persona : listaPersonas) {
			fila[0] = persona.getDni();
			fila[1] = persona.getNombre();
			fila[2] = persona.getApellidos();
			fila[3] = persona.getFechaNac();
			fila[4] = persona.getEdad();
			fila[5] = persona.getTelefono();
			fila[6] = persona.getDireccion();
			
			
			tblModel.addRow(fila);
		}
	}
	
	public void setListener (PersonaListener listener) {
		btnElimnarPersona.addActionListener(listener);
	}
}
