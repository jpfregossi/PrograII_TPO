package miApi;

/**
 * 
 * @author acerquone
 * @Cola con prioridad: Es una estructura que permite almacenar una coleccion de elementos en orden determinado por su prioridad. 
 * El primer elemento en entrar es el primer elemento en salir tomando en cuenta la prioridad.
 *
 */

public interface ColaPrioridadTDA {
	
	/**
	 * @Tarea InicializarCola: Inicializa la estructura de la cola con prioridad.
	 */
	
	public void inicializarCola();
	
	/**
	 * @Tarea AcolarPrioridad: Agrega un elemento x con prioridad p, ambos datos suministrados.
	 * @Precondicion La estructura debe estar inicializada.
	 */
	
	public void acolarPrioridad(int x, int p);
	
	/**
	 * @Tarea Desacolar: Elimina el elemento con mayor prioridad.
	 * @Precondicion: La cola no debe estar vacia.
	 */
	
	public void desacolar();
	
	/**
	 * @Tarea Primero: Obtiene el valor del dato de mayor prioridad.
	 * @Precondicion La cola no debe estar vacia.
	 * @return
	 */
	
	public int primero();
	
	/**
	 * @Tarea Prioridad: Obtiene el valor de prioridad del elemento de mayor prioridad.
	 * @Precondicion La cola no debe estar vacia.
	 * @return
	 */
	
	public int prioridad();
	
	/**
	 * @Tarea ColaVacia: Indica si la cola contiene elementos o no.
	 * @Precondicion: La estructura debe estar inicializada.
	 * @return
	 */
	
	public boolean colaVacia();

}
