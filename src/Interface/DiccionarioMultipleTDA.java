package Interface;

/*
Definici�n del TDA Diccionario m�ltiple, las claves y valores almacenados son enteros
Diccionario m�ltiple es una colecci�n de pares asociados (clave, valores), las claves son �nicas. No puede existir clave sin valor asociado. Los valores son �nicos para la misma clave.
Operaciones b�sicas:
InicializarDiccionarioMultiple: permite inicializar el diccionario.
Agregar: agrega un elemento x a una clave, ambos datos son suministrados. El diccionario debe estar inicializado y el valor no debe existir.
Eliminar: elimina una clave suministrada. La clave debe existir.
EliminarValor: elimina un valor dado x asociado a una clave , ambos datos son suministrados. Tanto la clave y como el valor deben existir.
Obtener: devuelve el conjunto de valores asociada a una clave suministrada. No elimina los valores. La clave debe existir.
Claves: devuelve el conjunto de claves del diccionario. No elimina las claves. El diccionario debe estar inicializado.
*/

public interface DiccionarioMultipleTDA {

	public void InicializarDiccionarioMultiple();
	
	public void Agregar(int clave, int valor);
	
	public void Eliminar(int clave);
	
	public void EliminarValor(int clave, int valor);
	
	public int[] Obtener(int clave);
	
	public int[] Claves(int clave);
	
}
