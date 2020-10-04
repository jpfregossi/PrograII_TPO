package misImplementaciones;

import miApi.ConjuntoTDA;
import miApi.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
	
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
	
	public ConjuntoTDA claves() {
		ConjuntoTDA claves = new Conjunto();
		Nodo n = inicio;
		while ( n != null ){
			claves.agregar(n.clave);
			n = n.sig;
		}
		return claves;
	}
	
	private void cargarInicio(int clave, int valor, Nodo sig) {
		inicio = new Nodo();
		inicio.clave = clave;
		inicio.valor = valor;
		inicio.sig = sig;
		//System.out.println("cargar inicio: " + inicio.clave + " ; " + inicio.valor);
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
