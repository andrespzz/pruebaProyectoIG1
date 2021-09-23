package pp.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pp.view.PNuevaPersona;
import pp.view.PersonaVP;

public class PersonaListener implements ActionListener {
	PersonaVP pvp = new PersonaVP();
	PNuevaPersona pnp = new PNuevaPersona();

	public PersonaListener(PersonaVP pvp, PNuevaPersona pnp) {
		super();
		this.pvp = pvp;
		this.pnp = pnp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
