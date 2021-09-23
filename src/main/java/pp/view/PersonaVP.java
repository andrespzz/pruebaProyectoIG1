package pp.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PersonaVP extends JFrame {

	public static final int ANCHO = 800;
	public static final int ALTO = 650;

	public static final String ANADIRPERSONA = "Añadir nueva persona";
	public static final String EDITARPERSONA = "Editar persona";
	public static final String ELIMINARPERSONA = "Eliminar persona";
	public static final String MNTMSALIR = "Salir";

	private JMenuItem mntmAnadirPersona;
	private JMenuItem mntmEditarPersona;
	private JMenuItem mntmEliminarPersona;
	private JMenuItem mntmSalir;

	public PersonaVP() {
		initComponents();
		crearMenu();
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(ANCHO, ALTO);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO, ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

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

}
