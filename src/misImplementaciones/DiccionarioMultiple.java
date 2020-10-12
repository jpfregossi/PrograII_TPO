package misImplementaciones;
import miApi.ConjuntoTDA;
import miApi.DiccionarioMultipleTDA;
public class DiccionarioMultiple implements DiccionarioMultipleTDA {
	
	class Nodo{
		int c;
		NodoValor primer;
		Nodo sig;
	}
	class NodoValor{
		int x; 
		NodoValor sigValor;
	}
	private Nodo inicio;
	
	private Nodo buscarClave(int c){
		Nodo actual = inicio;
		while(actual != null && actual.c != c) {
			actual = actual.sig;
		}
		return actual;
	}

	@Override
	public void agregar(int c, int x) {
		Nodo actual = buscarClave(c);
		if (actual == null) {
			Nodo n = new Nodo();
			NodoValor v = new NodoValor();
			v.x = x;
			v.sigValor = n.primer;
			n.primer = v;
			n.c = c;
			n.sig = inicio;
			inicio = n;
		} else {
			NodoValor v = new NodoValor();
			v.x = x;
			v.sigValor = actual.primer;
			actual.primer = v;
		}
		
		
	}

	@Override
	public void eliminar(int c) {
		if (inicio.c == c) {
			inicio = inicio.sig;
		} else {
			Nodo actual = inicio, anterior = null;
			while(actual.c != c) {
				anterior = actual;
				actual = actual.sig;
			}
			anterior.sig = actual.sig;	
		}	
	}

	@Override
	public void eliminarValor(int c, int x) {
		Nodo actual = buscarClave(c);
		NodoValor ante = null, actualValor = actual.primer;
		while(actualValor.x != x) {
			ante = actualValor;
			actualValor = actualValor.sigValor;
		}
		if (ante == null) {
			actual.primer = actual.primer.sigValor;
		} else {
			ante.sigValor = actualValor.sigValor;
		}
		if(actual.primer == null) {
			eliminar(c);
		}
		
	}

	@Override
	public ConjuntoTDA obtener(int c) {
		ConjuntoTDA con = new Conjunto();
		con.inicializarConjunto();
		Nodo actual = buscarClave(c);
		NodoValor actualValor = actual.primer;
		while(actualValor != null) {
			con.agregar(actualValor.x);
			actualValor = actualValor.sigValor;
		}
		return con;
	}

	@Override
	public ConjuntoTDA claves() {
		Nodo actual = inicio;
		ConjuntoTDA con = new Conjunto();
		con.inicializarConjunto();
		while(actual!=null) {
			con.agregar(actual.c);
			actual = actual.sig;
		}
		return con;
	}

	@Override
	public void inicializarDiccionarioMultiple() {
		inicio = null;
		
	}

}
