package implementacion.dinamica;

import Interface.DiccionarioSimpleTDA;

public class DiccionarioSimpleD implements DiccionarioSimpleTDA {
	
	class Nodo {
		int clave;
		int valor;
		Nodo sig;
	}
	
	private Nodo inicio;
	
	public void inicializarDiccionarioSimple() {
		inicio = null;
	}
	
	public void agregar(int clave, int valor) {
		System.out.println("agregando valor.");
		
		if ( inicio == null ) {
			cargarInicio(clave, valor, null);
		}
		
		else {			
			Nodo nodo = inicio;
			while ( nodo.sig != null ) {
				if (nodo.clave == clave) {
					nodo.valor = valor;
					return;
				}
				else { nodo = nodo.sig;	}
			}
			
			Nodo siguiente = new Nodo();
			siguiente.clave = inicio.clave;
			siguiente.valor = inicio.valor;
			siguiente.sig = inicio.sig;
			cargarInicio(clave, valor, siguiente);
		}
	}
	
	public void eliminar(int clave) {
		Nodo nodo = inicio;
		
		if (nodo.clave == clave) {
			inicio = inicio.sig;
			return;
		}
		
		while ( nodo.sig.clave != clave ) {
			if (nodo.clave == clave) {
				nodo.sig = nodo.sig.sig;
				return;
			}
			else { nodo = nodo.sig; }
		}
		return;
	}
	
	public int obtener(int clave) {
		return buscarNodo(clave).valor;
	}
	
	public int[] claves() {
		Nodo nodo = new Nodo();
		nodo.sig = inicio;
		int cont = 0;
		int dimension = 1;
		int [] claves = new int[dimension];
		while ( nodo.sig != null ) {
			if ( cont > dimension-1) { 
				int [] clavesTemp = claves;
				dimension *= 2; 
				claves = new int[dimension];
				for ( int i = 0 ; i < (dimension/2) ; i++ ) {
					claves[i] = clavesTemp[i];
				}
			}
			claves[cont] = nodo.sig.clave;
			nodo = nodo.sig;
			cont++;
		}
		return claves;
	}
	
	private void cargarInicio(int clave, int valor, Nodo sig) {
		inicio = new Nodo();
		inicio.clave = clave;
		inicio.valor = valor;
		inicio.sig = sig;
		System.out.println("cargar inicio: " + inicio.clave + " ; " + inicio.valor);
	}
	
	private Nodo buscarNodo(int clave) {
		Nodo nodo = new Nodo();
		nodo.sig = inicio;
		while ( nodo.sig != null ) {
			if (nodo.clave == clave) { break; } 
			else { nodo = nodo.sig; }
		}
		return nodo;
	}
}
