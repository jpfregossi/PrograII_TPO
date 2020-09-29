package ImplementacionesEstaticas;

import Interfaces.ConjuntoTDA;

public class DiccionarioSimple implements Interfaces.DiccionarioSimpleTDA {
	
	private class Elem{
		int clave, dato;
	}
	
	private Elem[] vector;
	private int cant;

	@Override
	public void inicializarDiccionarioSimple() {
		vector = new Elem[100];
		cant = 0;
	}

	@Override
	public void agregar(int x, int clave) {
		int i = 0;
		while(i<cant && vector[i].clave != clave) {
			i++;
		}
		vector[i] = new Elem();
		vector[i].clave = clave;
		vector[i].dato = x;
		if(i>=cant) {
			cant++;
		}
	}

	@Override
	public void eliminar(int clave) {
		int i = cant - 1;
		while (vector[i].clave != clave) {
			i--;
		}
		vector[i] = vector[cant - 1];
		cant--;
	}

	@Override
	public int obtener(int clave) {
		int i = 0;
		while(vector[i].clave != clave) {
			i++;
		}
		return vector[i].dato;
	}

	@Override
	public ConjuntoTDA claves() {
		ConjuntoTDA claves = new Conjunto();
		claves.inicializarConjunto();
		int i = 0;
		while(i<cant) {
			claves.agregar(vector[i].clave);
			i++;
		}
		return claves;
	}

}
