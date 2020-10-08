package misImplementaciones;

import miApi.ColaCadenaTDA;

public class ColaCadena implements ColaCadenaTDA {

	class Nodo{
		String d;
		Nodo sig;
	}
	
	private Nodo inicio, fin;

	@Override
	public void inicializarCola() {
		inicio = fin = null;
	}

	@Override
	public void acolar(String x) {
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
	public String primero() {
		return inicio.d;
	}

	@Override
	public boolean colaVacia() {
		return inicio == null;
	}

}
