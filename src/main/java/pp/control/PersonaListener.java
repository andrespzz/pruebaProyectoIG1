package pp.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import pp.bd.PersonaPersistencia;
import pp.model.Persona;
import pp.view.PEliminarPersona;
import pp.view.PModificar;
import pp.view.PNuevaPersona;
import pp.view.PersonaVP;

public class PersonaListener implements ActionListener {
	private PersonaVP pvp = new PersonaVP();
	private PNuevaPersona pnp = new PNuevaPersona();
	private PModificar pmdf = new PModificar();
	private PEliminarPersona pep = new PEliminarPersona();
	private PersonaPersistencia model;

	public PersonaListener(PersonaVP pvp, PNuevaPersona pnp, PModificar pmdf, PEliminarPersona pep) {
		super();
		this.pvp = pvp;
		this.pnp = pnp;
		this.pmdf = pmdf;
		this.pep = pep;
		model = new PersonaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() instanceof JMenuItem) {
			if (ev.getActionCommand().equalsIgnoreCase(PersonaVP.ANADIRPERSONA)) {
				pvp.cargarPanel(pnp);
			} else if (ev.getActionCommand().equalsIgnoreCase(PersonaVP.EDITARPERSONA)) {
				pvp.cargarPanel(pmdf);
			} else if (ev.getActionCommand().equalsIgnoreCase(PersonaVP.ELIMINARPERSONA)) {
				pvp.cargarPanel(pep);
				consultarTablaEliminar();
			} else if (ev.getActionCommand().equalsIgnoreCase(PersonaVP.MNTMSALIR)) {
				pvp.mostrarMsjConfirm();
			}
		} else if (ev.getSource() instanceof JButton) {
			if (ev.getActionCommand().equalsIgnoreCase(PNuevaPersona.BTN_ANADIR)) {
				Persona persona = pnp.getDatos();

				if (persona != null) {
					int per = model.insertPersona(persona);

					if (per == 1) {
						pnp.mostrarMsjInfo("La persona se ha añadido correctamente");
						pnp.limpiarComponentes();
					} else {
						pnp.mostrarMsjInfo("No se ha podido añadir el usuario");
					}
				}
			} else if (ev.getActionCommand().equalsIgnoreCase(PNuevaPersona.BTN_LIMPIAR)) {
				pnp.limpiarComponentes();
			} else if (ev.getSource() instanceof JButton) {
				if (ev.getActionCommand().equalsIgnoreCase(PModificar.BTN_BUSCAR)) {
					String nombre = pmdf.getNomPersona();

					Persona persona = model.selecNomPers(nombre);

					if (nombre.isEmpty()) {
						pmdf.mostrarError("Debe introducir un nombre");
					} else if (persona != null) {
						pmdf.cargarDatos(persona);
					} else {
						pmdf.mostrarMsjInfo("No se han encontrado datos");
					}

				} else if (ev.getActionCommand().equalsIgnoreCase(PModificar.BTN_GUARDAR)) {
					Persona persona = pmdf.getDatos();

					int pers = 0;
					if (persona != null) {
						pers = model.updatePersona(persona);
					}

					if (pers == 1) {
						pmdf.mostrarMsjInfo("Se han modificado los datos");
					} else {
						pmdf.mostrarError("No se han modificado los datos");
					}

				} else if (ev.getActionCommand().equals(PModificar.BTN_CANCELAR)) {
					pmdf.limpiarComponentes();
				} else if (ev.getActionCommand().equals(PEliminarPersona.BTN_ELIMINAR)) {
					String dniPer = pep.getPerSeleccionado();
					
					if (!dniPer.equals("")) {
						int opcion = JOptionPane.showConfirmDialog(pep, "Se va a eliminar el registro "
								+ "seleccionado. ¿Desea continuar?", 
								"Confirmación de borrado", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
						
						if (opcion == JOptionPane.YES_OPTION) {
							int res = model.deletePersonas(dniPer);
		
							if (res == 1) {
								pep.mostrarMsjInfo("Se ha eliminado el restaurante con exito");
								consultarTablaEliminar();
							} else {
								pep.mostrarMsjError("No se ha podido eliminar la persona");
							}
						}
					}
				}
			}
		}
	}
	
	private void consultarTablaEliminar() {
		ArrayList<Persona> listaPersonas;
		
		listaPersonas = model.selectPersonas();
		pep.cargarTabla(listaPersonas);
	}

}
