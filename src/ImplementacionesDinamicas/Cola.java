package ImplementacionesDinamicas;

import Interfaces.ColaTDA;

public class Cola implements ColaTDA {
	class Nodo{
		int d;
		Nodo sig;
	}
	private Nodo inicio, fin;

	@Override
	public void inicializarCola() {
		inicio = fin = null;

	}

	@Override
	public void acolar(int x) {
		Nodo n = new Nodo();
		n.d = x;
		n.sig = null;
		if (inicio == null) {
			inicio = fin = n;
		}
		else {
			fin.sig = n;
			fin = n;
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
		return inicio.d;
	}

	@Override
	public boolean colaVacia() {
		return inicio == null;
	}

}
