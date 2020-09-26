package implementacion.estatica;

import Interface.ConjuntoTDA;
import Interface.DiccionarioSimpleTDA;
import implementacion.dinamica.ConjuntoD;

public class DiccionarioSimpleE implements DiccionarioSimpleTDA {
	
	public class Elem{
		public int clave;
		public int valor;
	}
	
	private Elem[] vector;
	private int cant;
	
	public void inicializarDiccionarioSimple() {
		vector = new Elem[100];
		cant = 0;
	};
	
	public void agregar(int clave, int valor) {
		int pos = buscarClave(clave);
		if (pos != -1) {
			vector[pos].valor = valor;
		}
		else {
			vector[cant] = new Elem();
			vector[cant].clave = clave;
			vector[cant].valor = valor;
		}
		cant++;
	};
	
	public void eliminar(int clave) {
		int pos = buscarClave(clave);
		cant--;
		vector[pos].clave = vector[cant].clave;
		vector[pos].valor = vector[cant].valor;
	};
	
	public int obtener(int clave) {
		int pos = buscarClave(clave);
		return vector[pos].valor;
	}
	
	public ConjuntoTDA claves() {
		ConjuntoTDA claves = new ConjuntoD();
		for ( int i = 0 ; i < cant ; i++ ) {
			claves.agregar(vector[i].clave);
		}
		return claves;
	}
	
	private int buscarClave(int clave) {
		int pos = -1;
		int cont = 0;
		for (Elem e: vector) {
			if (e != null && e.clave == clave) {
				pos = cont;
				break;
			}
			else cont++;
		}
		return pos;
	}

}
