package ImplementacionesEstaticas;

import Interfaces.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA{
	class Elemento{
		int valor, p;
	}
	private Elemento[] vector;
	private int cant;

	@Override
	public void inicializarCola() {
		vector = new Elemento[100];
		cant = 0;
	}

	@Override
	public void acolarPrioridad(int x, int p) {
		int i = cant - 1;
		while(i >= 0 && p <= vector[i].p) {
			vector[i+1] = vector[i];
			i -=1;
		}
		vector[i+1] = new Elemento();
		vector[i+1].valor = x;
		vector[i+1].p = p;
		cant += 1;
	}
	
	
	@Override
	public void desacolar() {
		int i;
		for (i=0;i<cant;i++) {
			vector[i]=vector[i+1];
		}
		cant -=1;
		
	}

	@Override
	public int primero() {
		return vector[0].valor;
	}

	@Override
	public int prioridad() {
		return vector[0].p;
	}

	@Override
	public boolean colaVacia() {
		return cant == 0;
	}

}
