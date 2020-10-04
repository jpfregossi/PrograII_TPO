package misImplementaciones;

import miApi.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	class Nodo{
		int d;
		Nodo sig;
	}
	private Nodo inicio;

	@Override
	public void inicializarConjunto() {
		inicio = null;

	}

	@Override
	public void agregar(int x) {
		Nodo n = new Nodo();
		n.d = x;
		n.sig = inicio;
		inicio = n;

	}

	@Override
	public void sacar(int x) {
		Nodo anterior,actual;
		actual = inicio;
		anterior = inicio;
		while(actual.d != x) {
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
	public int obtener() {
		return inicio.d;
	}

	@Override
	public boolean conjuntoVacio() {
		return inicio == null;
	}

	@Override
	public boolean pertenece(int x) {
		Nodo actual;
		actual = inicio;
		while(actual != null && actual.d != x ) {
			actual = actual.sig;
		}
		return actual != null;
	}

}
