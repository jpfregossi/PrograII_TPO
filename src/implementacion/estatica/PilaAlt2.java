package implementacion.estatica;

import Interface.PilaAlt2TDA;

public class PilaAlt2 implements PilaAlt2TDA {
	
	private int [] pila;
	private int indice;
	
	public void InicializarPila() {
		this.pila = new int[100];
		this.indice = 0;
	}
	
	public void Apilar(int valor) {
		this.pila[indice] = valor;
		System.out.println("Agreg� elemento " + valor + " en la posici�n " + indice);
		//System.out.println("Tama�o del arreglo: " + pila[4]);
		this.indice++;
	}
	
	public int TopeSacar() {
		return this.pila[--indice];
	}
	
	public Boolean pilaVacia() {
		if(indice == 0) return true;
		else return false;
	}
	
	public void PrintContent() {
		String cadena = "";
		int contador = 0;
		for (int elemento: pila) {
			if(contador < indice) {
				cadena += String.valueOf(elemento) + " - ";
				contador++;
			}
			else break;
		}
		System.out.println("\nContenido de la cadena: " + cadena);
	}

}
