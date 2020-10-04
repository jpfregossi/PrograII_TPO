package misAlgoritmos;

import miApi.ColaPrioridadTDA;
import miApi.ConjuntoTDA;
import miApi.DiccionarioMultipleTDA;
import miApi.DiccionarioSimpleTDA;
import misImplementaciones.DiccionarioMultiple;
import misImplementaciones.ColaPrioridad;
import misImplementaciones.DiccionarioSimple;

public class MasSolicitadas {
	private DiccionarioSimpleTDA contadorVistas = new DiccionarioSimple();
	private DiccionarioMultipleTDA peliculaProveedores = new DiccionarioMultiple();
	private ColaPrioridadTDA prioridadVistas = new ColaPrioridad();
	
	public MasSolicitadas() {
		contadorVistas.inicializarDiccionarioSimple();
		peliculaProveedores.inicializarDiccionarioMultiple();
		prioridadVistas.inicializarCola();
	}
	
	public void cargarMovimiento(int mov) {
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
	}
	
	public DiccionarioMultiple procesarMovimientos() {
		ConjuntoTDA peliculas = contadorVistas.claves();
		while ( !peliculas.conjuntoVacio() ) {
			int p = peliculas.obtener();
			prioridadVistas.acolarPrioridad(p, contadorVistas.obtener(p));
			peliculas.sacar(p);
		}

		DiccionarioMultiple peliculasMasVistas = new DiccionarioMultiple();
		int maxVistas = prioridadVistas.prioridad();
		while ( !prioridadVistas.colaVacia() && prioridadVistas.prioridad() == maxVistas ){
			int peli = prioridadVistas.primero();
			ConjuntoTDA provs = peliculaProveedores.obtener(peli);
			//String todosLosProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int prov = provs.obtener();
				peliculasMasVistas.agregar(peli, prov);
				//todosLosProveedores += prov + ", ";
				provs.sacar(prov);
			}
			//System.out.println(prioridadVistas.prioridad() + ") " + peli + " | " + todosLosProveedores );
			prioridadVistas.desacolar();
		}
		return peliculasMasVistas;
	}
}
