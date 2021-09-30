package pp.view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import pp.control.PersonaListener;
import pp.model.Persona;
import java.awt.Font;

/**
 * La clase PEliminarPersona es una clase descendiente de JPanel (es un panel) para representar 2 JLabel 
 * (Etiqueta de texto) y una JTable (Tabla)con los datos de todas las personas de la base de datos, y para 
 * incluir la funcionalidad de eliminar de la base de datos a la persona seleccionada de la tabla con un boton.
 * @author Diego Pozo
 * @version 1.0
 */

public class PEliminarPersona extends JPanel {
	/**
	 * CLM_DNI es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "DNI"
	 */
	public static final String CLM_DNI = "DNI";
	
	/**
	 * CLM_NOMBRE es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "NOMBRE"
	 */
	public static final String CLM_NOMBRE = "NOMBRE";
	
	/**
	 * CLM_APELLIDOS es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "APELLIDOS"
	 */
	public static final String CLM_APELLIDOS = "APELLIDOS";
	
	/**
	 * CLM_FECHA es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "FECHA"
	 */
	public static final String CLM_FECHA = "FECHA";
	
	/**
	 * CLM_EDAD es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "EDAD"
	 */
	public static final String CLM_EDAD = "EDAD";
	
	/**
	 * CLM_DIRECCION es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "DIRECCIÓN"
	 */
	public static final String CLM_DIRECCION = "DIRECCIÓN";
	
	/**
	 * CLM_TELEFONO es una variable estática de String para representar el nombre de una columna en la tabla.
	 * <br>Nombre de la columna: "TELÉFON"
	 */
	public static final String CLM_TELEFONO = "TELÉFONO";
	
	/**
	 * CLM_ELIMINAR es una variable estática de String para representar el nombre de un botón.
	 * <br>Nombre de botón: "Eiminar"
	 */
	public static final String BTN_ELIMINAR = "Eliminar";
	
	/**
	 * Variable  privada de tipo JTable para la tabla tblEliminarPersonas.
	 */
	private JTable tblEliminarPersonas;
	
	/**
	 * Variable de tipo JButton para el boton btnEliminarPersona
	 */
	private JButton btnElimnarPersona;
	
	/**
	 * Variable privada de tipo DefaultTableModel para el modelo de tabla tblMoel que almacena
	 * el modelo de la tabla.
	 */
	private DefaultTableModel tblModel;
	
	/**
	 * Método para inicializar el JPanel con el método initComponents();
	 */
	public PEliminarPersona() {
		initComponents();
		
	}
	
	/**
	 * Método para inicializar el Layout, los componentes con atributos y para establecer el tamaño del panel.
	 * 
	 * <br><br>Componente 1: scrpListaEliminarPersonas, tipo JScrollPane.
	 * <br>Componente 2: tblEliminarPersonas, tipo JTable.
	 * <br>Componente 3: btnEliminarPersona, tipo JButton.
	 * <br>Componente 4: lblInformacionEliminar, tipo JLabel.
	 * <br>Componente 5: lblEliminarPersonas, tipo JLabel.
	 */
	private void initComponents() {
		setLayout(null);
		setSize(PersonaVP.ANCHO - 30, PersonaVP.ALTO - 70);
		
		JScrollPane scrpListaEliminarPersonas = new JScrollPane();
		scrpListaEliminarPersonas.setBounds(48, 163, 674, 273);
		add(scrpListaEliminarPersonas);
		
		tblEliminarPersonas = new JTable();
		tblEliminarPersonas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tblEliminarPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpListaEliminarPersonas.setViewportView(tblEliminarPersonas);
		
		btnElimnarPersona = new JButton(BTN_ELIMINAR);
		btnElimnarPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnElimnarPersona.setBounds(596, 112, 126, 32);
		add(btnElimnarPersona);
		
		JLabel lblInformacionEliminar = new JLabel("Selecciona una persona para eliminar");
		lblInformacionEliminar.setFont(new Font("Dialog", Font.ITALIC, 19));
		lblInformacionEliminar.setBounds(48, 117, 350, 23);
		add(lblInformacionEliminar);
		
		JLabel lblEliminarPersona = new JLabel("CONSULTAR / ELIMINAR PERSONAS");
		lblEliminarPersona.setFont(new Font("Arial", Font.BOLD, 30));
		lblEliminarPersona.setBounds(118, 51, 542, 32);
		add(lblEliminarPersona);
		
		configurarTabla();
	}
	
	/**
	 * Método para configurar el modelo de la tabla en columnas, cantidad y tamaño de las columnas.
	 */
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
	
	/**
	 * Método para cargar la tabla de datos a través del parametro listaPersonas, con un foreach para recorrer
	 * el ArrayList.
	 * @param listaPersonas ArrayList que contiene los objetos Personas.
	 */
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
	
	/**
	 * Método para establecer al btnEliminarPersona el PersonaListener 
	 * @param listener PersonaListener es el listener que contiene las acciones de la aplicación.
	 */
	public void setListener (PersonaListener listener) {
		btnElimnarPersona.addActionListener(listener);
	}
	
	/**
	 * Método para obtener el "dni" de un objeto Persona que esta en la tabla seleccionado
	 * @return El "dni" del objeto persona seleccionado en la tabla.
	 */
	public String getPerSeleccionado() {
		String dniPer = "";
		if (tblEliminarPersonas.getSelectedRow() == -1) {
			mostrarMsjError("Debe selecionar el registro a eliminar");
		} else {
			dniPer = (String) tblModel.getValueAt(tblEliminarPersonas.getSelectedRow(), 0); 
		}
		return dniPer;
	}
	
	/**
	 * Método para mostrar un mensaje de error en la aplicación 
	 * a través de la opcion showMessageDialog de JOptionPane.
	 * @param msj String para mostrar en el mensaje.
	 */
	public void mostrarMsjError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error de selección", JOptionPane.ERROR_MESSAGE);
		
	}
	
	/**
	 * Método para mostrar un mensaje de información en la aplicación 
	 * a través de la opcion showMessageDialog de JOptionPane..
	 * @param msj String para mostrar en el mensaje.
	 */
	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", 
				JOptionPane.INFORMATION_MESSAGE);		
	}
}
