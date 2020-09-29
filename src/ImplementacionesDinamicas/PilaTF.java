package ImplementacionesDinamicas;

import Interfaces.PilaTDA;

public class PilaTF implements PilaTDA {
	class Nodo{
		int d;
		Nodo sig;
	}
	private Nodo inicio, fin;
	
	@Override
	public void apilar(int x) {
		Nodo n = new Nodo();
		n.d = x;
		n.sig = null;
		if(inicio == null) {
			inicio = fin = n;
		}
		else {
			fin.sig = n;
			fin = n;
		}

	}

	@Override
	public void desapilar() {
		if(inicio == fin) {
			inicio = fin = inicio.sig;
		}
		else {
			Nodo anterior = inicio;
			while(anterior.sig != fin) {
				anterior = anterior.sig;
			}
			fin = anterior;
			fin.sig = null;
		}

	}

	@Override
	public int tope() {
		return fin.d;
	}

	@Override
	public boolean pilaVacia() {
		return inicio == null;
	}

	@Override
	public void inicializarPila() {
		inicio = fin = null;
	}

}
