package misImplementaciones;

import miApi.DiccionarioSimpleTDA;
import miApi.ConjuntoTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
	class Nodo{
		int clave, x;
		Nodo sig;
	}
	private Nodo inicio;

	@Override
	public void inicializarDiccionarioSimple() {
		inicio = null;

	}

	@Override
	public void agregar(int clave, int x) {
		Nodo n = new Nodo();
		n.x = x;
		n.clave = clave;
		n.sig = null;
		Nodo actual;
		actual = inicio;
		while(actual != null && actual.clave != clave) {
			actual = actual.sig;
		}
		if(actual != null) {
			this.eliminar(clave);
		}
		n.sig = inicio;
		inicio = n;
	}

	@Override
	public void eliminar(int clave) {
		Nodo actual, anterior;
		actual = inicio;
		anterior = null;
		while(actual.clave != clave) {
			anterior = actual;
			actual = actual.sig;
		}
		if(actual == inicio) {
			inicio = inicio.sig;
		}
		else {
			anterior.sig = actual.sig;
		}

	}

	@Override
	public int obtener(int clave) {
		Nodo actual;
		actual = inicio;
		while(actual.clave != clave) {
			actual = actual.sig;
		}
		return actual.x;
	}

	@Override
	public ConjuntoTDA claves() {
		ConjuntoTDA claves = new Conjunto();
		Nodo actual;
		actual = inicio;
		while(actual != null) {
			claves.agregar(actual.x);
			actual = actual.sig;
		}
		return claves;
	}
}
