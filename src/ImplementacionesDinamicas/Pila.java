package ImplementacionesDinamicas;

import Interfaces.PilaTDA;

public class Pila implements PilaTDA {
	class Nodo{
		int d;
		Nodo sig;
	}
	private Nodo inicio;

	@Override
	public void apilar(int x) {
		Nodo n = new Nodo();
		n.d = x;
		n.sig = inicio;
		inicio = n;

	}

	@Override
	public void desapilar() {
		inicio = inicio.sig;

	}

	@Override
	public int tope() {
		return inicio.d;
	}

	@Override
	public boolean pilaVacia() {
		return inicio == null;
	}

	@Override
	public void inicializarPila() {
		inicio = null;

	}

}
