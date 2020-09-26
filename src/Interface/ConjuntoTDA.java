package Interface;

/*
Definici�n del TDA Conjunto de valores enteros
Conjunto es una estructura que permite almacenar una colecci�n de valores enteros, no repetidos y no necesariamente ordenado.
Operaciones b�sicas:
InicializarConjunto: inicializa el conjunto.
Agregar: agrega un elemento x suministrado. El conjunto debe estar inicializado y el elemento no debe existir.
Sacar: elimina un elemento suministrado x. EL elemento debe pertenecer al conjunto.
Obtener: devuelve un valor cualquiera del conjunto. El elemento no se elimina. El conjunto no debe estar vac�o.
ConjuntoVacio: devuelve verdadero si el conjunto tiene elementos. El conjunto debe estar inicializado.
Pertenece: devuelve verdadero si el valor x recibido como par�metro pertenece al conjunto. El conjunto debe estar inicializado. 
*/

public interface ConjuntoTDA {

	public void inicializarConjunto();
	
	public void agregar(int x);
	
	public void sacar(int x);
	
	public int obtener();
	
	public Boolean conjuntoVacio();
	
	public Boolean pertenece(int x);
	
}
