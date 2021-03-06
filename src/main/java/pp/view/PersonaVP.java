package pp.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import pp.control.PersonaListener;
import javax.swing.JLabel;

/**
 * Clase descendiente de JFrame para definir las características y/o componentes
 * de la ventana.
 * 
 * @author jad
 * @version 1.0
 *
 */
public class PersonaVP extends JFrame {
	/**
	 * ANCHO Variable estática para representar el ancho de la ventana principal.
	 */
	public static final int ANCHO = 770;
	/**
	 * ALTO Variable estática para representar el alto de la ventana principal.
	 */
	public static final int ALTO = 550;

	/**
	 * ANADIRPERSONA Variable estática que contiene el texto de una opción de menú.
	 */
	public static final String ANADIRPERSONA = "Añadir nueva persona";
	/**
	 * EDITARPERSONA Variable estática que contiene el texto de una opción de menú.
	 */
	public static final String EDITARPERSONA = "Editar persona";
	/**
	 * ELIMINARPERSONA Variable estática que contiene el texto de una opción de
	 * menú.
	 */
	public static final String ELIMINARPERSONA = "Consultar / eliminar persona";
	/**
	 * MNTMSALIR Variable estática que contiene el texto de una opción de menú.
	 */
	public static final String MNTMSALIR = "Salir";

	/**
	 * mntmAnadirPersona Variable privada de tipo JMenuItem para la pestaña del menú
	 * añadir persona.
	 */
	private JMenuItem mntmAnadirPersona;
	/**
	 * mntmEditarPersona Variable privada de tipo JMenuItem para la pestaña del menú
	 * editar persona.
	 */
	private JMenuItem mntmEditarPersona;
	/**
	 * mntmEliminarPersona Variable privada de tipo JMenuItem para la pestaña del
	 * menú eliminar persona.
	 */
	private JMenuItem mntmEliminarPersona;
	/**
	 * mtntmSalir Variable privada de tipo JMenuItem para la pestaña del menú salir.
	 */
	private JMenuItem mntmSalir;
	/**
	 * scrpContenedor Variable privada de tipo JScrollPane para el contenedor de los
	 * paneles.
	 */
	private JScrollPane scrpContenedor;

	/**
	 * Método para inicializar el método <b>initComponents();</b> y crear el menú.
	 */
	public PersonaVP() {
		super("Gestión de personas");
		initComponents();
		crearMenu();
	}

	/**
	 * Método para definir, distribuir e inicializar componentes y características
	 * de la ventana.
	 */
	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(ANCHO, ALTO);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO, ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		getContentPane().setLayout(new BorderLayout(0, 0));

		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);

	}

	/**
	 * Método para crear el menú.
	 */
	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmAnadirPersona = new JMenuItem(ANADIRPERSONA);
		menuBar.add(mntmAnadirPersona);

		mntmEditarPersona = new JMenuItem(EDITARPERSONA);
		menuBar.add(mntmEditarPersona);

		mntmEliminarPersona = new JMenuItem(ELIMINARPERSONA);
		menuBar.add(mntmEliminarPersona);

		mntmSalir = new JMenuItem(MNTMSALIR);
		menuBar.add(mntmSalir);
	}

	/**
	 * Método para hacer visible la ventana.
	 */
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * Método para cargar paneles en la ventana.
	 * 
	 * @param panel Variable de tipo JPanel.
	 */
	public void cargarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}

	/**
	 * Método para asignar escuchadores a los componentes.
	 * 
	 * @param listener Variable que transmite funcionalidad al componente.
	 */
	public void setListener(PersonaListener listener) {
		mntmAnadirPersona.addActionListener(listener);
		mntmEditarPersona.addActionListener(listener);
		mntmEliminarPersona.addActionListener(listener);
		mntmSalir.addActionListener(listener);
	}

	/**
	 * Método para mostrar mensaje de confirmación de salida.
	 */
	public void mostrarMsjConfirm() {
		int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas cerrar la aplicación?",
				"Confirmación de salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (opcion == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}

	}

}
