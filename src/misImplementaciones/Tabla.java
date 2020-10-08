/**
 * 
 */
package misImplementaciones;

import miApi.ColaCadenaTDA;
import miApi.TablaTDA;

/**
 * @author jpfre
 *
 */
public class Tabla implements TablaTDA {
	
	class Elemento {
		int codigo;
		String nombre;
		Elemento sig;
	}
	
	Elemento inicio;

	@Override
	public void inicializarTabla() {
		inicio = null;
	}

	@Override
	public void agregar(int c, String s) {
		Elemento nuevo = new Elemento();
		nuevo.codigo = c;
		nuevo.nombre = s;
		nuevo.sig = null;
		
		if ( inicio == null ) {
			inicio = nuevo;
		}
		else {
			Elemento e = inicio;
			while ( e.sig != null ) {
				e = e.sig;
			}
			e.sig = nuevo;
		}
	}

	@Override
	public boolean pertenece(String s) {
		Elemento e = buscarPorNombre(s);
		if(e != null) {
			return true;
		}
		return false;
	}

	@Override
	public int codigo(String s) {
		Elemento e = buscarPorNombre(s);
		return e.codigo;
	}

	@Override
	public ColaCadenaTDA tabla() {
		ColaCadenaTDA cola = new ColaCadena();
		Elemento e = inicio;
		while (e != null) {
			cola.acolar(e.codigo + "; " + e.nombre);
			e = e.sig;
		}

		return cola;
	}

	@Override
	public void ordenarNombres() {
		
	}

	@Override
	public void ordenarCodigos() {
		
	}

	@Override
	public boolean estaVacia() {
		return inicio == null;
	}
	
	private Elemento buscarPorNombre(String s) {
		Elemento e = inicio;
		while (e != null && !e.nombre.equals(s)) {
			e = e.sig;
		}

		return e;
	}

}
