package implementacion.dinamica;

import Interface.ConjuntoTDA;

public class ConjuntoD implements ConjuntoTDA {

    class Elemento {
        int valor;
        Elemento sig;
    }

    Elemento inicial;

    public void inicializarConjunto(){
        inicial = null;
    }
	
	public void agregar(int x){
        Elemento nuevo = new Elemento();
        nuevo.valor = x;
        nuevo.sig = inicial;
        inicial = nuevo;
    }
	
	public void sacar(int x){
        if ( inicial.valor == x) {
            inicial = inicial.sig;
            return;
        }
        Elemento anterior = null, actual = inicial;
        while ( actual.valor != x ){
            anterior = actual;
            actual = actual.sig;
        }
        anterior.sig = actual.sig;
    }
	
	public int obtener(){
        return inicial.valor;
    }
	
	public Boolean conjuntoVacio(){
        return inicial == null;
    }
	
	public Boolean pertenece(int x){
        Elemento e = inicial;
        while ( e != null && e.valor != x ) {
            e = e.sig;
        }
        return e != null;
    }
}
