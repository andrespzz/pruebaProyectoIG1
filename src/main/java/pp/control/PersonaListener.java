package pp.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import pp.bd.PersonaPersistencia;
import pp.model.Persona;
import pp.view.PNuevaPersona;
import pp.view.PersonaVP;

public class PersonaListener implements ActionListener {
	private PersonaVP pvp = new PersonaVP();
	private PNuevaPersona pnp = new PNuevaPersona();
	private PersonaPersistencia model;
	

	public PersonaListener(PersonaVP pvp, PNuevaPersona pnp) {
		super();
		this.pvp = pvp;
		this.pnp = pnp;
		model = new PersonaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() instanceof JMenuItem) {
			if (ev.getActionCommand().equalsIgnoreCase(PersonaVP.ANADIRPERSONA)) {
				pvp.cargarPanel(pnp);
			}
		} else if (ev.getSource() instanceof JButton) {
			if (ev.getActionCommand().equalsIgnoreCase(PNuevaPersona.BTN_ANADIR)) {
				Persona persona = pnp.getDatos();
				
				if (persona != null) {
					int res = model.insertPersona(persona);
					
					if (res = 1) {
						
					}
				}
			}
			
		}
	}

}
