package implementacion.dinamica;

import Interface.ColaTDA;

public class ColaD implements ColaTDA{
    class Nodo{
		int d;
		Nodo sig;
	}
	
	private Nodo inicio;
	
	public void inicializarCola() {
		inicio = null;
	}
	
	public void acolar(int x) {
		Nodo n = new Nodo();
		n.d = x;
		if (inicio == null) {
			n.sig = inicio;
			inicio = n;
        }
        else {
			Nodo ant = null, act = inicio;
			while ( act != null) {
				ant = act;
				act = act.sig;
			}
			n.sig = act;
			ant.sig = n;
		}
	}
	
	public void desacolar() {
		inicio = inicio.sig;
	}
	
	public int primero() {
		return inicio.d;
	}
	
	public Boolean colaVacia() {
		return inicio==null;
	}
}
