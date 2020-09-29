package ImplementacionesEstaticas;

import Interfaces.PilaTDA;

public class Pila implements PilaTDA {
	private int[] vector;
	private int cant;
	@Override
	public void apilar(int x) {
		vector[cant] = x;
		cant += 1;
		
	}
	@Override
	public void desapilar() {
		cant -= 1;
		
	}
	@Override
	public int tope() {
		return vector[cant - 1];
	}
	@Override
	public boolean pilaVacia() {
		
		return cant == 0;
	}
	@Override
	public void inicializarPila() {
		vector = new int[100];
		cant = 0;
		
	}
	
	

}
