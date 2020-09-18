package Interface;

/**@author 
 * @Pila es una estructura que permite almacenar una colecci�n de valores, eliminarlos y recuperarlos, con 
 * a particularidad de que el elemento que se recupera o elimina es el �ltimo que ingres�. 
 * @Tarea Apilar agrega un elemento. Precondici�n la pila debe estar inicializada
 * @Tarea TopeSacar devuelve el �ltimo elemento agregado a la pila y lo elimina el �ltimo elemento.
 * Precondici�n la pila debe estar inicializada y no vac�a.
 * @Tarea pilaVacia indica si la pila contiene elementos o no. Precondici�n la pila debe estar inicializada.
 * @Tarea InicializarPila inicializa la estructura de la pila 
*/
public interface PilaAlt2TDA {	
	
	public void Apilar(int valor);
	
	public int TopeSacar();
	
	public Boolean pilaVacia();
	
	public void InicializarPila();
	
	public void PrintContent();
	
}

