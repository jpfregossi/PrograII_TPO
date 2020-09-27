import implementacion.dinamica.*;
import implementacion.estatica.*;
import Interface.*;

import Pruebas.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Trabajo Practico Obligatorio - Programacion II\n");

		/*ConjuntoTDA conjunto = new ConjuntoD();
		PruebasConjunto.test(conjunto);

		DiccionarioSimpleTDA dicE = new DiccionarioSimpleD();
		PruebaDiccionario.test(dicE);*/

		Repositorio repo = new Repositorio();

		ColaTDA movimientos = repo.getListado();

		ColaTDA masVistas = new ColaD();
		masVistas.inicializarCola();

		DiccionarioSimpleTDA contadorVistas = new DiccionarioSimpleD();
		contadorVistas.inicializarDiccionarioSimple();

		DiccionarioMultipleTDA peliculaProveedores = new DiccionarioMultipleD();
		peliculaProveedores.inicializarDiccionarioMultiple();

		ColaConPrioridadTDA prioridadVistas = new ColaConPrioridadD();
		prioridadVistas.inicializarCola();

		while ( movimientos.colaVacia() == false ){
			int mov = movimientos.primero();
			int usuario = mov / 1000000;
			int streamer = (mov / 10000) - (usuario * 100) ;
			int pelicula = mov - (usuario * 1000000) - (streamer * 10000);
			
			int cont = 1;
			if ( contadorVistas.claves().pertenece(pelicula) ){
				cont = contadorVistas.obtener(pelicula) + 1;
				contadorVistas.eliminar(pelicula);
			}
			contadorVistas.agregar(pelicula, cont);

			if ( peliculaProveedores.claves().pertenece(pelicula) && !peliculaProveedores.obtener(pelicula).pertenece(streamer) ){
					peliculaProveedores.agregar(pelicula, streamer);
			}
			else { peliculaProveedores.agregar(pelicula, streamer); }
			
			movimientos.desacolar();
		}

		ConjuntoTDA peliculas = contadorVistas.claves();
		while ( !peliculas.conjuntoVacio() ) {
			int p = peliculas.obtener();
			prioridadVistas.agregarPrioridad(p, contadorVistas.obtener(p));
			peliculas.sacar(p);
		}

		DiccionarioMultipleD peliculasMasVistas = new DiccionarioMultipleD();
		int maxVistas = prioridadVistas.prioridad();
		/*while ( prioridadVistas.prioridad() == maxVistas ){
			int peli = prioridadVistas.primero();
			ConjuntoTDA provs = peliculaProveedores.obtener(peli);
			String todosLosProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int prov = provs.obtener();
				peliculasMasVistas.agregar(peli, prov);
				todosLosProveedores += repo.proveedoresPorCodigo.get(prov) + ", ";
				provs.sacar(prov);
			}
			System.out.println(maxVistas + ") " + repo.peliculasPorCodigo.get(peli) + " | " + todosLosProveedores );
			prioridadVistas.desacolar();
		}*/
		while ( !prioridadVistas.colaVacia() ){
			int peli = prioridadVistas.primero();
			ConjuntoTDA provs = peliculaProveedores.obtener(peli);
			String todosLosProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int prov = provs.obtener();
				peliculasMasVistas.agregar(peli, prov);
				todosLosProveedores += repo.proveedoresPorCodigo.get(prov) + ", ";
				provs.sacar(prov);
			}
			System.out.println(prioridadVistas.prioridad() + ") " + repo.peliculasPorCodigo.get(peli) + " | " + todosLosProveedores );
			prioridadVistas.desacolar();
		}
	}

}
