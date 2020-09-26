package implementacion.dinamica;

import Interface.ColaConPrioridadTDA;

public class ColaConPrioridadD implements ColaConPrioridadTDA{
	
	class Nodo{
		int p, d;
		Nodo sig;
	}
	
	private Nodo inicio;
	
	public void inicializarCola() {
		inicio = null;
	}
	
	public void agregarPrioridad(int x, int p) {
		Nodo n = new Nodo();
		n.d = x;
		n.p = p;
		if (inicio == null || p > inicio.p) {
			n.sig = inicio;
			inicio = n;
		} else {
			Nodo ant = null, act = inicio;
			while ( act != null && p <= act.p ) {
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
	
	public int prioridad() {
		return inicio.p;
	}
	
	public boolean colaVacia() {
		return inicio==null;
	}
}
