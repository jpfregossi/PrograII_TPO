package ImplementacionesDinamicas;

import Interfaces.ColaTDA;

public class ColaPF implements ColaTDA {

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
		n.sig = inicio;
		if (inicio == null) {
			fin = n;
		}
		inicio = n;

	}

	@Override
	public void desacolar() {
		if (inicio.sig == null) {
			inicio = fin = null;
		}
		else {
			Nodo anterior = inicio;
			while(anterior.sig != fin) {
				anterior = anterior.sig;
			}
			anterior.sig = null;
			fin = anterior;
		}

	}

	@Override
	public int primero() {
		return fin.d;
	}

	@Override
	public boolean colaVacia() {
		return inicio == null;
	}

}
