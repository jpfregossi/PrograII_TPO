package miApi;
/**
 * @author Luis
 * Diccionario múltiple es una colección de pares asociados (clave, valores), las claves son únicas.
 * No puede existir clave sin valor asociado.
 * Los valores son únicos para la misma clave
 */
public interface DiccionarioMultipleTDA {
	/**
	 * @Tarea Agregar agrega un elemento x a una clave, ambos datos son suministrados.
	 * @Precondicion la estructura debe estar inicializada y tanto la clave como el valor no debe existir.
	 */
	void agregar(int c, int x);
	/**
	 * @Tarea Eliminar elimina una clave suministrada.
	 * @Precondicion la clave debe existir.
	 */
	void eliminar(int c);
	/**
	 * @Tarea EliminarValor elimina un valor x asociado a una clave, ambos datos suministrados.
	 * @Precondicion ambos datos deben existir.
	 */
	void eliminarValor(int x, int c);
	/**
	 * @Tarea Obtener devuelve el conjunto de valores asociados a una clave suministrada.
	 * @Precondicion la clave debe existir.
	 */
	ConjuntoTDA obtener(int c);
	/**
	 * @Tarea Clave devuelve el conjunto de claves que tiene el diccionario.
	 * @Precondicion la estructura debe estar inicializada.
	 */
	ConjuntoTDA claves();
	/**
	 * @Tarea InicializarDiccionarioMultiple inicializa la estrucura
	 */
	void inicializarDiccionarioMultiple();

}
