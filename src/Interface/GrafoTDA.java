package Interface;

/*
Definición del TDA Grafo, donde los vértices y el peso de la arista son valores enteros
Grafo es una colección de vértices y aristas tipo dirigido, sin aristas paralelas ni bucles, donde los vértices y los pesos son enteros .
Operaciones básicas:
InicializarGrafo: inicializa el grafo.
AgregarVertice: agrega un vértice. El grafo debe estar inicializado y el vértice no debe existir.
EliminarVertice: elimina un vértice suministrada. El vértice debe existir.
AgregarArista: agrega una arista, identificada por los vértices de origen y destino; y el peso. Los vértices deben existir, pero no debe existir la arista.
EliminarArista: elimina la arista suministrado los vértices de origen y destino. La arista debe existir.
Vertices devuelve el conjunto de vértices de. No elimina los vértices. El diccionario debe estar inicializado
Peso: devuelve el peso de la arista, identificada por los vértices de origen y destino. La arista debe existir
ExisteArista: devuelve verdadero si existe la arista, identificada por los vértices de origen y destino. El grafo debe estar inicializado.
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
