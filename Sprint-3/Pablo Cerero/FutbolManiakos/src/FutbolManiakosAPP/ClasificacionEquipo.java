package FutbolManiakosAPP;

import java.util.ArrayList;

public class ClasificacionEquipo {

	public int PuntosEquipos;
	ArrayList<Equipos> equipos = new ArrayList<Equipos>();

	public ClasificacionEquipo(int numeroEquipos, int puntosEquipos) {
		super();
		PuntosEquipos = puntosEquipos;
	}

	public int getPuntosEquipos() {
		return PuntosEquipos;
	}

	public void setPuntosEquipos(int puntosEquipos) {
		PuntosEquipos = puntosEquipos;
	}

	public void MostrarClasificacion(int puntosEquipos, ArrayList<Equipos> equipos) {

	}

}
