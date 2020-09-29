package ImplementacionesEstaticas;

import java.util.Random;

import Interfaces.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	private int[] v;
	private int cant;
	private final int posINF = 0;
	private Random posAzar;
	

	@Override
	public void inicializarConjunto() {
		v = new int [100];
		cant = 0;
		posAzar = new Random(System.currentTimeMillis());
	}

	@Override
	public void agregar(int x) {
		v[cant] = x;
		cant++;

	}

	@Override
	public void sacar(int x) {
		int i = cant - 1;
		while (v[i] != x) {
			i--;
		}
		v[i] = v[cant - 1];
		cant--;
	}

	@Override
	public int obtener() {
		int i = posAzar.nextInt(cant - 1 - posINF + 1) + posINF;
		return v[i];
	}

	@Override
	public boolean conjuntoVacio() {
		return cant == 0;
	}

	@Override
	public boolean pertenece(int x) {
		int i = cant - 1;
		boolean incluido = false;
		while (i >= 0) {
			if(v[i] == x) {
				incluido = true;
			}
			i--;
		}
		return incluido;
	}

}
