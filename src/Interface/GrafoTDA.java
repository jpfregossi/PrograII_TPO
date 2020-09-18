package Interface;

/*
Definici�n del TDA Grafo, donde los v�rtices y el peso de la arista son valores enteros
Grafo es una colecci�n de v�rtices y aristas tipo dirigido, sin aristas paralelas ni bucles, donde los v�rtices y los pesos son enteros .
Operaciones b�sicas:
InicializarGrafo: inicializa el grafo.
AgregarVertice: agrega un v�rtice. El grafo debe estar inicializado y el v�rtice no debe existir.
EliminarVertice: elimina un v�rtice suministrada. El v�rtice debe existir.
AgregarArista: agrega una arista, identificada por los v�rtices de origen y destino; y el peso. Los v�rtices deben existir, pero no debe existir la arista.
EliminarArista: elimina la arista suministrado los v�rtices de origen y destino. La arista debe existir.
Vertices devuelve el conjunto de v�rtices de. No elimina los v�rtices. El diccionario debe estar inicializado
Peso: devuelve el peso de la arista, identificada por los v�rtices de origen y destino. La arista debe existir
ExisteArista: devuelve verdadero si existe la arista, identificada por los v�rtices de origen y destino. El grafo debe estar inicializado.
*/

public interface GrafoTDA {

	public void InicializarGrafo();
	
	public void AgregarVertice(int vertice);
	
	public void EliminarVertice(int vertice);
	
	public void AgregarArista(int origen, int destino);
	
	public void EliminarArista(int arista);
	
	public int[] Vertices();
	
	public int Peso(int origen, int destino);
	
	public Boolean ExisteArista(int origen, int destino);
	
}
