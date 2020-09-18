package Interface;

/*
Definici�n del TDA Diccionario simple, las claves y valores almacenados son enteros
Diccionario simple es una colecci�n de pares asociados (clave, valor), las claves son �nicas. No puede existir clave sin valor asociado.
Operaciones b�sicas:
InicializarDiccionarioSimple: inicializa el diccionario.
Agregar: permite agregar un elemento x a una clave suministrados. El diccionario debe estar inicializado y no debe existir.
Eliminar: permite eliminar una clave suministrada. La clave debe existir.
Obtener: devuelve el valor asociada a una clave suministrada. No elimina el valor. La clave debe existir.
Claves: devuelve el conjunto de claves del diccionario. No elimina las claves. El diccionario debe estar inicializado. 
*/

public interface DiccionarioSimpleTDA {
	
	public void inicializarDiccionarioSimple();
	
	public void agregar(int clave, int valor);
	
	public void eliminar(int clave);
	
	public int obtener(int clave);
	
	public int[] claves();

}
