package Interface;

/**@author 
 * @Pila es una estructura que permite almacenar una colección de valores, eliminarlos y recuperarlos, con 
 * a particularidad de que el elemento que se recupera o elimina es el último que ingresó. 
 * @Tarea Apilar agrega un elemento. Precondición la pila debe estar inicializada
 * @Tarea TopeSacar devuelve el último elemento agregado a la pila y lo elimina el último elemento.
 * Precondición la pila debe estar inicializada y no vacía.
 * @Tarea pilaVacia indica si la pila contiene elementos o no. Precondición la pila debe estar inicializada.
 * @Tarea InicializarPila inicializa la estructura de la pila 
*/
public interface PilaAlt2TDA {	
	
	public void Apilar(int valor);
	
	public int TopeSacar();
	
	public Boolean pilaVacia();
	
	public void InicializarPila();
	
	public void PrintContent();
	
}

