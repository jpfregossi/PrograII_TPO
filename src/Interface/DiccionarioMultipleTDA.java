package Interface;

/*
Definición del TDA Diccionario múltiple, las claves y valores almacenados son enteros
Diccionario múltiple es una colección de pares asociados (clave, valores), las claves son únicas. 
No puede existir clave sin valor asociado. Los valores son únicos para la misma clave.
Operaciones básicas:
- InicializarDiccionarioMultiple: permite inicializar el diccionario.
- Agregar: agrega un elemento x a una clave, ambos datos son suministrados. El diccionario debe estar inicializado y el valor no debe existir.
- Eliminar: elimina una clave suministrada. La clave debe existir.
- EliminarValor: elimina un valor dado x asociado a una clave , ambos datos son suministrados. Tanto la clave y como el valor deben existir.
- Obtener: devuelve el conjunto de valores asociada a una clave suministrada. No elimina los valores. La clave debe existir.
- Claves: devuelve el conjunto de claves del diccionario. No elimina las claves. El diccionario debe estar inicializado.
*/

public interface DiccionarioMultipleTDA {

	public void inicializarDiccionarioMultiple();
	
	public void agregar(int clave, int valor);
	
	public void eliminar(int clave);
	
	public void eliminarValor(int clave, int valor);
	
	public ConjuntoTDA obtener(int clave);
	
	public ConjuntoTDA claves(int clave);
	
}
