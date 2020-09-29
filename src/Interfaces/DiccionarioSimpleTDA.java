package Interfaces;

/**
 * @author acerquone
 * @DiccionarioSimple: Es una coleccion de pares asociados (clave,valor). Las claves son unicas y no puede existir una clave sin valor asociado. 
 */

public interface DiccionarioSimpleTDA {
	
	/**
	 * @Tarea InicializarDiccionarioSimple Inicializa la estructura del diccionario.
	 */
	
	public void inicializarDiccionarioSimple();
	
	/**
	 * @Tarea Agregar permite agregar un valor x a una clave, ambos suministrados como parametros. Si la clave ya existe se reemplaza el valor.
	 * @Precondicion: El diccionario debe estar inicializado.
	 */
	
	public void agregar(int x, int clave);
	
	/**
	 * @Tarea Eliminar permite eliminar una clave suministrada.
	 * @Precondicion La clave debe existir.
	 */
	
	public void eliminar(int clave);
	
	/**
	 * @Tarea Obtener Devuelve el valor asociado a una clave suministrada. No se elimina el valor ni la clave.
	 * @Precondicion La clave debe existir.
	 */
	
	public int obtener(int clave);
	
	/**
	 * @Tarea Claves Devuelve el conjunto de claves del diccionario. No elimina las claves.
	 * @Precondicion El diccionario debe estar inicializado.
	 */
	
	public ConjuntoTDA claves();

}
