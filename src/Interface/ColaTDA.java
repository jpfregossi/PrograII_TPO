package Interface;

/*
Definici�n del TDA Cola de valores enteros
Cola es una estructura que permite almacenar una colecci�n de valores enteros, con la particularidad de que el
elemento que el primer elemento en ingresar es el primer elemento en salir. Tambi�n se la conoce como una
estructura FIFO.  
*/

public interface ColaTDA {
	
	public void InicializarCola();
	
	public void Acolar(int x);
	
	public void Desacolar();
	
	public int Primero();
	
	public Boolean ColaVacia();
	
}
