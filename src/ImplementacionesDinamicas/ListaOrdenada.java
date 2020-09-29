package ImplementacionesDinamicas;

import ImplementacionesEstaticas.Cola;
import Interfaces.ColaTDA;
import Interfaces.ListaOrdenadaTDA;

public class ListaOrdenada implements ListaOrdenadaTDA {
	class Nodo{
		int x;
		Nodo sig;
	}
	private Nodo inicio;

	@Override
	public void inicializarLista() {
		inicio = null;

	}

	@Override
	public void agregar(int x) {
		Nodo n = new Nodo();
		n.x = x;
		if(inicio == null || x < inicio.x) {
			n.sig = inicio;
			inicio = n;
		}
		else {
			Nodo actual = inicio, anterior = null;
			while(actual != null && x <= actual.x) {
				anterior = actual;
				actual = actual.sig;
			}
			n.sig = actual;
			anterior.sig = n;
		}

	}

	@Override
	public void eliminarInicio() {
		if(inicio != null) {
			inicio = inicio.sig;
		}

	}

	@Override
	public void eliminarFinal() {
		if (inicio != null) {
			if(inicio.sig == null) {
				eliminarInicio();
			}
			else {
				Nodo actual = inicio;
				Nodo anterior = null;
				while(actual.sig != null) {
					anterior = actual;
					actual = actual.sig;
				}
				anterior.sig = null;
			}
		}

	}

	@Override
	public void eliminar(int x) {
		if(inicio != null) {
			if(inicio.x == x) {
				eliminarInicio();
			}
			else {
				Nodo actual = inicio;
				Nodo anterior = null;
				while(actual != null && actual.x != x) {
					anterior = actual;
					actual = actual.sig;
				}
				if(actual != null) {
					anterior.sig = actual.sig;
				}
			}
		}

	}

	@Override
	public boolean existe(int x) {
		Nodo actual= inicio;
		while(actual != null && actual.x != x) {
			actual = actual.sig;
		}
		return actual != null;
	}

	@Override
	public ColaTDA valores() {
		ColaTDA r = new Cola();
		Nodo actual = inicio;
		while(actual != null) {
			r.acolar(actual.x);
			actual = actual.sig;
		}
		return r;
	}

	@Override
	public boolean listaVacia() {
		return inicio == null;
	}

}
