package ImplementacionesEstaticas;

import Interfaces.ColaPrioridadTDA;

public class ColaPrioridad2 implements ColaPrioridadTDA{
	
	private int[] vectorV;
	private int[] vectorP;
	private int cant;

	@Override
	public void inicializarCola() {
		vectorV = new int[100];
		vectorP = new int[100];
		cant = 0;
	}

	@Override
	public void acolarPrioridad(int x, int p) {
		int i = cant - 1;
		while(i >= 0 && p <= vectorP[i]) {
			vectorV[i+1] = vectorV[i];
			vectorP[i+1] = vectorP[i];
			i -=1;
		}
		vectorV[i+1] = x;
		vectorP[i+1] = p;
		cant += 1;
		
	}

	@Override
	public void desacolar() {
		int i;
		for (i=0;i<cant;i++) {
			vectorV[i]=vectorV[i+1];
			vectorP[i]=vectorP[i+1];
		}
		cant -=1;
		
	}

	@Override
	public int primero() {
		return vectorV[0];
	}

	@Override
	public int prioridad() {
		return vectorP[0];
	}

	@Override
	public boolean colaVacia() {
		return cant == 0;
	}
	
}