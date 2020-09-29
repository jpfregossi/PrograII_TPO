package Interfaces;

/**
 * 
 * @author acerquone
 * @Conjunto Es una estructura que permite almacenar una coleccion de valores enteros, no repetidos y no necesariamente ordenados.
 *
 */

public interface ConjuntoTDA {
	
	/**
	 * @InicializarCOnjunto Inicializa la estructura del conjunto.
	 */
	
	public void inicializarConjunto();
	
	/**
	 * @Agregar Agrega un elemento x suministrado.
	 * @Precondicion El conjunto debe estar inicializado y el valor no debe existir.
	 */
	
	public void agregar(int x);
	
	/**
	 * @Sacar Elimina un elemento suministrado x.
	 * @Precondicion El elemento debe pertenecer al conjunto.
	 */
	
	public void sacar(int x);
	
	/**
	 * @Obtener Devuelve un valor cualquiera perteneciente al conjunto. El valor no se elimina.
	 * @Precondicion EL conjunto no debe estar vacio.
	 */
	
	public int obtener();
	
	/**
	 * @ConjuntoVacio Devuelve verdadero si el conjunto esta vacio.
	 * @Precondicion El conjunto debe estar inicializado.
	 */
	
	public boolean conjuntoVacio();
	
	/**
	 * @Pertenece Devuelve verdadero si el valor x recibido como parametro pertenece al conjunto.
	 * @Precondicion El conjunto debe estar inicializado.
	 */
	
	public boolean pertenece(int x);

}
