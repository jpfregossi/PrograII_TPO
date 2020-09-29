package ImplementacionesEstaticas;

import Interfaces.ColaTDA;

public class ColaAlt implements ColaTDA{
	private int[] vector;
	private int poner;

	@Override
	public void inicializarCola() {
		vector = new int[100];
		poner = 0;
		
	}

	@Override
	public void acolar(int x) {
		vector[poner] = x;
		poner += 1;
		
	}

	@Override
	public void desacolar() {
		int i;
		for (i=0;i<poner;i++) {
			vector[i] = vector[i+1];
		}
		poner -= 1;
	}

	@Override
	public int primero() {
		
		return vector[0];
	}

	@Override
	public boolean colaVacia() {
		return poner == 0;
	}

}
