package pp.main;

import java.awt.EventQueue;

import pp.control.PersonaListener;
import pp.view.PNuevaPersona;
import pp.view.PersonaVP;

public class InicioPersona {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				PersonaVP vp = new PersonaVP();
				PNuevaPersona pnp = new PNuevaPersona();

				PersonaListener l = new PersonaListener(vp, pnp);

				vp.setListener(l);
				pnp.setListener(l);

				vp.hacerVisible();

			}
		});

	}

}
