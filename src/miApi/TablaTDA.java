package miApi;

/*
 * Tabla es una estructura que permite almacenar una colección de elementos. Cada elemento consta de un
 * nombre asociado a un código (tipo de dato entero).
 */

public interface TablaTDA {
	
	/**
	 * @Tarea: inicializa la tabla.
	 */
	
	public void inicializarTabla();
	
	/**
	 * @Tarea: agrega un elemento nuevo a la tabla. 
	 * @Precond: El nombre no debe existir previamente en la tabla. La tabla debe estar inicializada. Los códigos serán únicos y consecutivos.
	 */
	
	public void agregar(int c, String s);
	
	/**
	 * @Tarea: esta operación permite saber si un nombre ya fue ingresado a la tabla.
	 * @Precond: la tabla debe estar inicializada.
	 * @return
	 */
	
	public boolean pertenece(String s);
	
	/**
	 * @Tarea: indica cuál es el código de un nombre suministrado (no se elimina).
	 * @Precond: El nombre debe existir.
	 * @return
	 */
	
	public int codigo(String s);
	
	/**
	 * @Tarea: devuelve los elementos en una estructura cola, donde cada elemento de la cola corresponde a la concatenación
     *         del código y el nombre separado por el carácter ";", según el orden en que se encuentren guardados.
	 * @Precond: la tabla debe estar inicializada.	
	 * @return
	 */
	
	public ColaCadenaTDA tabla();
	
	/**
	 * @Tarea: ordena los elementos de la tabla, alfabéticamente por los nombres.
	 * @Precond: la tabla debe estar inicializada.
	 */
	
	public void ordenarNombres();
	
	/**
	 * @Tarea: ordena los elementos de la tabla por los códigos, en forma ascendente.
	 * @Precond: la tabla debe estar inicializada.
	 */
	
	public void ordenarCodigos();
	
	/**
	 * @Tarea: informa si la tabla no tiene elementos.
	 * @Precond: la tabla debe estar inicializada.
	 */
	
	public boolean estaVacia();
}
