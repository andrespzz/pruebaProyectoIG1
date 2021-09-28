package pp.main;

import java.awt.EventQueue;

import pp.control.PersonaListener;
import pp.view.PEliminarPersona;
import pp.view.PModificar;
import pp.view.PNuevaPersona;
import pp.view.PersonaVP;

public class InicioPersona {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				PersonaVP vp = new PersonaVP();
				PNuevaPersona pnp = new PNuevaPersona();
				PModificar pmdf = new PModificar();
				PEliminarPersona pep = new PEliminarPersona();

				PersonaListener l = new PersonaListener(vp, pnp, pmdf, pep);

				vp.setListener(l);
				pnp.setListener(l);
				pmdf.setListener(l);

				vp.hacerVisible();

			}
		});

	}

}
