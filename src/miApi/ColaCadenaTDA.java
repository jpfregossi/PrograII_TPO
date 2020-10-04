/**
 * 
 */
package miApi;

/**
 * @author Juan Pablo Fregossi
 * ColaCadena
 * Cola es una estructura que permite almacenar una colecci�n de cadenas de caracteres (Strings), de modo
 * tal que el elemento m�s antiguo sea el primer elemento en salir. Tambi�n se la conoce como una
 * estructura FIFO.
 * Operaciones b�sicas:
 * InicializarCola: inicializa la estructura cola.
 * Acolar: agrega una cadena a la cola. La estructura debe estar inicializada.
 * Desacolar: elimina la cadena m�s antigua agregada. La estructura no debe estar vac�a.
 * Primero: obtiene la primera cadena a eliminar (no se elimina). La estructura no debe estar vac�a.
 * ColaVacia: indica si la cola no contiene cadenas. La estructura debe estar inicializada.
 *
 */
public interface ColaCadenaTDA {
	
	/**
	 * @Tarea InicializarCola: Inicializa la estructura de la cola.
	 */
	
	public void inicializarCola();
	
	/**
	 * @Tarea Acolar: Agrega una cadena a la cola.
	 * @Precondicion La estructura debe estar inicializada.
	 */
	
	public void acolar(String x);
	
	/**
	 * @Tarea Desacolar: Elimina la cadena mas antigua agregado.
	 * @Precondicion La estructura no debe estar vacia.
	 */
	
	public void desacolar();
	
	/**
	 * @Tarea Primero: obtiene la primera cadena a eliminar (no se elimina).
	 * @Precondicion La estructura no debe estar vacia.
	 * @return
	 */
	
	public String primero();
	
	/**
	 * @Tarea ColaVacia: Indica si la cola contiene cadenas o no.
	 * @Precondicion La estructura de la cola debe estar inicializada.
	 * @return
	 */
	
	public boolean colaVacia();
	
}
