package implementacion.dinamica;

import Interface.ConjuntoTDA;
import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleD implements DiccionarioMultipleTDA {

    class Nodo {
		int clave;
		ConjuntoTDA valores;
		Nodo sig;
	}
	
	private Nodo inicio;

    public void inicializarDiccionarioMultiple(){
        inicio = null;
    }
	
	public void agregar(int clave, int valor){
        if ( inicio == null ) {
            insertarNodo(clave, valor);
        }
        else {
            Nodo n = buscarNodo(clave);
            if ( n == null ){
                insertarNodo(clave, valor);
            }
            else {
                n.valores.agregar(valor);
            }
        }
    }
	
	public void eliminar(int clave){
        Nodo nodo = inicio;
		
		if (nodo.clave == clave) {
			inicio = inicio.sig;
			return;
		}
		
		while ( nodo.sig.clave != clave ) {
			if (nodo.clave == clave) {
				nodo.sig = nodo.sig.sig;
				return;
			}
			else { nodo = nodo.sig; }
		}
		return;
    }
	
	public void eliminarValor(int clave, int valor){
        Nodo n = buscarNodo(clave);
        n.valores.sacar(valor);
    }
	
	public ConjuntoTDA obtener(int clave){
        return buscarNodo(clave).valores;
    }
	
    public ConjuntoTDA claves(){
        ConjuntoTDA claves = new ConjuntoD();
		Nodo n = inicio;
		while ( n != null ){
			claves.agregar(n.clave);
			n = n.sig;
		}
		return claves;
    }
    
    private Nodo buscarNodo(int clave){
        Nodo n = inicio;
        while ( n != null && n.clave != clave ){
            n = n.sig;
        }
        return n;
    }

    private void insertarNodo(int clave, int valor){
        Nodo nuevo = new Nodo();
        nuevo.clave = clave;
        ConjuntoTDA valores = new ConjuntoD();
        valores.inicializarConjunto();
        valores.agregar(valor);
        nuevo.valores = valores;
        nuevo.sig = inicio;
        inicio = nuevo;
    }
}
