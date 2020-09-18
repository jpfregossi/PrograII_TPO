package Interface;

/*
Definición del TDA Conjunto de valores enteros
Conjunto es una estructura que permite almacenar una colección de valores enteros, no repetidos y no necesariamente ordenado.
Operaciones básicas:
InicializarConjunto: inicializa el conjunto.
Agregar: agrega un elemento x suministrado. El conjunto debe estar inicializado y el elemento no debe existir.
Sacar: elimina un elemento suministrado x. EL elemento debe pertenecer al conjunto.
Obtener: devuelve un valor cualquiera del conjunto. El elemento no se elimina. El conjunto no debe estar vacío.
ConjuntoVacio: devuelve verdadero si el conjunto tiene elementos. El conjunto debe estar inicializado.
Pertenece: devuelve verdadero si el valor x recibido como parámetro pertenece al conjunto. El conjunto debe estar inicializado. 
*/

public interface ConjuntoTDA {

	public void InicializarConjunto();
	
	public void Agregar(int x);
	
	public void Sacar();
	
	public int Obtener();
	
	public Boolean ConjuntoVacio();
	
	public Boolean Pertenece();
	
}
