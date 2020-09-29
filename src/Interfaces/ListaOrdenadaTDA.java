package Interfaces;

public interface ListaOrdenadaTDA {
	/**@Tarea inicializarLista: inicializa la estructura de la lista */
	void inicializarLista();
	
	/**@Tarea agregar: Agrega el elemento a la lista de forma ascendente.
	 * @Precondicion La lista debe estar inicializada.
	 */
	void agregar(int x);
	
	/**@Tarea eliminarInicio: Elimina el primer elemento de la lista.
	 * @Precondicion La lista debe estar inicializada.
	 */
	void eliminarInicio();
	
	/**@Tarea eliminarFinal: Elimina el ultimo elemento de la lista.
	 * @Precondicion La lista debe estar inicializada.
	 */
	void eliminarFinal();
	
	/**@Tarea eliminar: Elimina un elemento dado de la lista.
	 * @Precondicion La lista debe estar inicializada.
	 */
	void eliminar(int x);
	
	/**@Tarea existe: Devuelve verdadero si el elemento dado existe en la lista.
	 * @Precondicion La lista debe estar inicializada.
	 */
	boolean existe(int x);
	
	/**@Tarea valores: Devuelve todos los elementos de la lista en el orden en que se encuentran.
	 * @Precondicion La lista debe estar inicializada.
	 */
	ColaTDA valores();
	
	/**@Tarea listaVacia: Devuelve verdadero si la lista esta vacia.
	 * @Precondicion La lista debe estar inicializada.
	 */
	boolean listaVacia();
	

}
