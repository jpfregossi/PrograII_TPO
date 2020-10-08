package miApi;


/**
 * 
 * @author acerquone
 * @Pila es una estructura que permite almacenar una colección de valores, eliminarlos y recuperarlos,
 * con la particularidad de que el elemento que se recupera o elimina es el último que ingresó.
 *
 */

public interface PilaTDA {
	
	/**
	 * @Tarea Apilar agrega un elemento
	 * @Precondicion la pila debe estar inicializada
	 */
	void apilar(int x);
	
	/**
	 * @Tarea Desapilar elimina el ultimo elemento ingresado.
	 * @Precondicion la pila debe estar inicializada y no debe estar vacia.
	 */
	void desapilar();
	
	/**
	 * @Tarea Tope obtiene el valor del ultimo elemento ingresado. El elemento no se elimina
	 * @Precondicion la pila debe estar inicializada y no debe estar vacia.
	 * @return
	 */
	int tope();
	
	/**
	 * @Tarea PilaVacia devuelve verdadero si no contiene elementos.
	 * @Precondicion la pila debe estar inicializada.
	 * @return
	 */
	boolean pilaVacia();
	
	/**
	 * @Tarea InicializarPila inicializa la estructura de la pila.
	 */
	void inicializarPila();
}
