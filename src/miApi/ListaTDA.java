package miApi;



/**
 * 
 * @author acerquone
 * Una lista es una colección de nodos, los cuales se recorren en forma secuencial.
 * La cantidad de nodos está limitada por la capacidad de la memoria.
 * Un nodo es una agrupación de datos y elementos de control. Los datos pueden ser de cualquier tipo, mientras que los elementos de
 * control son referencias al siguiente nodo o al nodo anterior.
 *
 */

public interface ListaTDA {
	
/**
 * @Tarea Inicializar Lista: Inicializa la lista.
 */
	public void inicializarLista();
	
/**
 * @Tarea Agregar inicio: Agrega el elmento al inicio de la lista.
 * @Precondicion La lista debe estar inicializada.
 */
	public void agregarInicio(int x);
	
/**
 * @Tarea Agregar final: Agrega el elemento al final de la lista.
 * @Precondicion La lista debe estar inicializada.
 */
	public void agregarFinal(int x);
	
/**
 * @Tarea Eliminar Inicio: Elimina el primer elemento de la lista.
 * @Precondicion La lista debe estar inicializada.
 */
	public void eliminarInicio();

/**
 * @Tarea Eliminar Final: Elimina el ultimo elemento de la lista.
 * @Precondicion La lista debe estar inicializada.
 */
	public void eliminarFinal();
	
/**
 * @Tarea eliminar: elimina un elemento dado de la lista.
 * @Precondicion La lista debe estar inicializada.
 */
	public void eliminar(int x);
	
/**
 * @Tarea existe: Devuelve verdadero si el elemento se encuentra en la lista.
 * @Precondicion La lista debe estar inicializada.
 * @return
 */
	public boolean existe(int x);

/**
 * @Tarea valores: Devuelve todos los elementos de la lista en el orden en que se encuentran.
 * @Precondicion La lista debe estar inicializada.
 * @return
 */
	public ColaTDA valores();

/**
 * @Tarea lista vacia: Devueleve verdadero si la lista esta vacia.
 * @Precondicion La lista debe estar inicializada.
 * @return
 */
	public boolean listaVacia();

}
