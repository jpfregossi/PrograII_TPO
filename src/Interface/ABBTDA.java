package Interface;

/*
Definición del TDA Árbol binario de búsqueda (ABB). Los valores almacenados son enteros
Árbol de búsqueda binaria es una colección de elementos ordenados en forma jerárquica. Entre dos elementos se define dos roles: padre e hijo. 
Cada elemento tiene sólo un padre, excepto el elemento raíz del árbol que no tiene ningún padre.
Operaciones básicas:
InicializarABB: permite inicializar el árbol.
Raiz: devuelve el valor de la raiz. El elemento no lo elimina. El árbol no puede estar vacío.
HijoIzq: devuelve la referencia al subárbol izquierdo. No elimina los elementos del sub-árbol. El árbol no puede estar vacío.
HijoDer: devuelve la referencia al subárbol derecho. No elimina los elementos del sub-árbol. lEl árbol no puede estar vacío.
Agregar: agrega un valor x suministrado. El árbol debe estar inicializado y no debe existir el valor.
Eliminar: elimina un valor suministrado. El valor debe existir.
ÁrbolVacio: devuelve verdadero o falso si el árbol contiene elementos o no. La estructura debe estar inicializada.
Pertence: devuelve verdadero si el valor suministrado pertenece al árbol. EL árbol debe estar inicializado.
*/

public interface ABBTDA {

	public void InicializarABB();
	
	public int Raiz();
	
	public ABBTDA HijoIzq();
	
	public ABBTDA HijoDer();
	
	public void Agregar(int x);
	
	public void Eliminar(int x);
	
	public Boolean ÁrbolVacio();
	
	public Boolean Pertence(int x);
	
}
