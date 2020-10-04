package miApi;

/**
 * 
 * @author acerquone
 * @Cola es una estructura que permite almacenar una colección de valores enteros, con la particularidad de que el primer 
 * elemento en ingresar es el primer elemento en salir. 
 * También se la conoce como una estructura FIFO. 
 *
 */

public interface ColaTDA {
	
	/**
	 * @Tarea InicializarCola: Inicializa la estructura de la cola.
	 */
	
	public void inicializarCola();
	
	/**
	 * @Tarea Acolar: Agrega un elemento a la cola.
	 * @Precondicion La estructura debe estar inicializada.
	 */
	
	public void acolar(int x);
	
	/**
	 * @Tarea Desacolar: Elimina el elemento mas antiguo agregado.
	 * @Precondicion La estructura no debe estar vacia.
	 */
	
	public void desacolar();
	
	/**
	 * @Tarea Primero: Obtiene el primer elemento que ingreso y por lo tanto el primero en ser eliminado.
	 * @Precondicion La estructura no debe estar vacia.
	 * @return
	 */
	
	public int primero();
	
	/**
	 * @Tarea ColaVacia: Indica si la cola contiene elementos o no.
	 * @Precondicion La estructura de la cola debe estar inicializada.
	 * @return
	 */
	
	public boolean colaVacia();

}
