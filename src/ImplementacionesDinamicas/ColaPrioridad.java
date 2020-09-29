package ImplementacionesDinamicas;

import Interfaces.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA {
	class Nodo{
		int p,d;
		Nodo sig;
	}
	private Nodo inicio;

	@Override
	public void inicializarCola() {
		inicio = null;

	}

	@Override
	public void acolarPrioridad(int x, int p) {
		Nodo n = new Nodo();
		n.d = x;
		n.p = p;
		if (inicio == null || p > inicio.p) {
			n.sig = inicio;
			inicio = n;
		}
		else {
			Nodo anterior = null, actual = inicio;
			while(actual != null && p <= actual.p) {
				anterior = actual;
				actual = actual.sig;
			}
			n.sig = actual;
			anterior.sig = n;
		}

	}

	@Override
	public void desacolar() {
		inicio = inicio.sig;

	}

	@Override
	public int primero() {
		return inicio.d;
	}

	@Override
	public int prioridad() {
		return inicio.p;
	}

	@Override
	public boolean colaVacia() {
		return inicio == null;
	}

}
