package misImplementaciones;

import miApi.ColaTDA;

public class Cola implements ColaTDA {
	class Nodo{
		int x;
		Nodo sig;
	}
	private Nodo inicio,fin;
	
	@Override
	public void inicializarCola() {
		inicio = fin = null;
	}

	@Override
	public void acolar(int x) {
		Nodo n = new Nodo();
		n.x = x;
		n.sig = null;
		if (inicio == null) {
			inicio = fin = n;
		} else {
			fin.sig=n;
			fin=n;
		}

	}

	@Override
	public void desacolar() {
		inicio = inicio.sig;
		if (inicio == null) {
			fin = null;
		}

	}

	@Override
	public int primero() {
		return inicio.x;
	}


	@Override
	public boolean colaVacia() {
		return inicio == null;
	}

}
