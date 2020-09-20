package Interface;

/*
Tabla es una estructura que permite almacenar una colecci�n de elementos. Cada elemento consta de un
nombre asociado a un c�digo (tipo de dato entero).

- Inicializartabla: inicializa la tabla.
- Agregar: esta operaci�n agrega un elemento nuevo a la tabla, donde el c�digo corresponde a la cantidad
  de elementos de la tabla antes de ingresar un nuevo nombre. El nombre no debe existir previamente en
  la tabla. La tabla debe estar inicializada. Al no existir las operaciones eliminarElemento ni
  actualizarElemento, los c�digos ser�n �nicos y consecutivos.
- Pertenece: esta operaci�n permite saber si un nombre ya fue ingresado a la tabla. La tabla debe estar
  inicializada.
- Codigo: indica cu�l es el c�digo de un nombre suministrado (no se elimina). El nombre debe existir.
- Tabla: devuelve los elementos en una estructura cola, donde cada elemento de la cola corresponde a la
  concatenaci�n del c�digo y el nombre separado por el car�cter �;�, seg�n el orden en que se encuentren
  guardados. La tabla debe estar inicializada.
- OrdenarNombres: ordena los elementos de la tabla, alfab�ticamente por los nombres. La tabla debe estar
  inicializada.
- OrdenarCodigos: ordena los elementos de la tabla por los c�digos, en forma ascendente. La tabla debe
  estar inicializada.
- EstaVacia: informa si la tabla no tiene elementos. La tabla debe estar inicializada.
*/

public interface TablaTDA {
	/*
	 * @Tarea: inicializa la tabla.
	 */
	void inicializarTabla();
	/*
	 * @Tarea: agrega un elemento nuevo a la tabla. 
	 * @Precond: El nombre no debe existir previamente en la tabla. La tabla debe estar inicializada. Los c�digos ser�n �nicos y consecutivos.
	 */
	void agregar();
	/*
	 * @Tarea: esta operaci�n permite saber si un nombre ya fue ingresado a la tabla.
	 * @Precond: la tabla debe estar inicializada.
	 * @return
	 */
	boolean pertenece();
	/*
	 * @Tarea: indica cu�l es el c�digo de un nombre suministrado (no se elimina).
	 * @Precond: El nombre debe existir.
	 * @return
	 */
	int codigo();
	/*
	 * @Tarea: devuelve los elementos en una estructura cola, donde cada elemento de la cola corresponde a la concatenaci�n
     *         del c�digo y el nombre separado por el car�cter �;�, seg�n el orden en que se encuentren guardados.
	 * @Precond: la tabla debe estar inicializada.	
	 * @return
	 */
	ColaTDA tabla();
	/*
	 * @Tarea: ordena los elementos de la tabla, alfab�ticamente por los nombres.
	 * @Precond: la tabla debe estar inicializada.
	 */
	void ordenarNombres();
	/*
	 * @Tarea: ordena los elementos de la tabla por los c�digos, en forma ascendente.
	 * @Precond: La tabla debe estar inicializada.
	 */
	void ordenarCodigos();
	/*
	 * @Tarea: informa si la tabla no tiene elementos.
	 * @Precond: la tabla debe estar inicializada.
	 */
	boolean estaVacia();
}
