package Interface;

/*
Definici�n del TDA �rbol binario de b�squeda (ABB). Los valores almacenados son enteros
�rbol de b�squeda binaria es una colecci�n de elementos ordenados en forma jer�rquica. Entre dos elementos se define dos roles: padre e hijo. 
Cada elemento tiene s�lo un padre, excepto el elemento ra�z del �rbol que no tiene ning�n padre.
Operaciones b�sicas:
InicializarABB: permite inicializar el �rbol.
Raiz: devuelve el valor de la raiz. El elemento no lo elimina. El �rbol no puede estar vac�o.
HijoIzq: devuelve la referencia al sub�rbol izquierdo. No elimina los elementos del sub-�rbol. El �rbol no puede estar vac�o.
HijoDer: devuelve la referencia al sub�rbol derecho. No elimina los elementos del sub-�rbol. lEl �rbol no puede estar vac�o.
Agregar: agrega un valor x suministrado. El �rbol debe estar inicializado y no debe existir el valor.
Eliminar: elimina un valor suministrado. El valor debe existir.
�rbolVacio: devuelve verdadero o falso si el �rbol contiene elementos o no. La estructura debe estar inicializada.
Pertence: devuelve verdadero si el valor suministrado pertenece al �rbol. EL �rbol debe estar inicializado.
*/

public interface ABBTDA {

	public void InicializarABB();
	
	public int Raiz();
	
	public ABBTDA HijoIzq();
	
	public ABBTDA HijoDer();
	
	public void Agregar(int x);
	
	public void Eliminar(int x);
	
	public Boolean �rbolVacio();
	
	public Boolean Pertence(int x);
	
}
