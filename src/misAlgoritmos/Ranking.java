package misAlgoritmos;

import miApi.ColaPrioridadTDA;
import miApi.ConjuntoTDA;
import miApi.DiccionarioSimpleTDA;
import misImplementaciones.ColaPrioridad;
import misImplementaciones.DiccionarioSimple;

public class Ranking {
	private DiccionarioSimpleTDA listaCantidadPeliculas;
	private ColaPrioridadTDA top10Peliculas;
	
	public Ranking() {
		listaCantidadPeliculas = new DiccionarioSimple();
		top10Peliculas = new ColaPrioridad();
		listaCantidadPeliculas.inicializarDiccionarioSimple();
		top10Peliculas.inicializarCola();
	}
	
	public void cargar(int mov) {
		int codigoPelicula = mov % 10000;
		if (listaCantidadPeliculas.claves().pertenece(codigoPelicula)) {
			int i = listaCantidadPeliculas.obtener(codigoPelicula);
			i++;
			listaCantidadPeliculas.eliminar(codigoPelicula);
			listaCantidadPeliculas.agregar(codigoPelicula, i);
		} else {
			listaCantidadPeliculas.agregar(codigoPelicula, 1);
		}
	}
	
	public void ordenar() {
		ColaPrioridadTDA auxCola = new ColaPrioridad();
		auxCola.inicializarCola();
		ConjuntoTDA auxConjunto = listaCantidadPeliculas.claves();
		int x = 0;
		while(!auxConjunto.conjuntoVacio()) {
			x = auxConjunto.obtener();
			auxCola.acolarPrioridad(listaCantidadPeliculas.obtener(x),x);
			auxConjunto.sacar(x);
		}
		for(int i = 0; i < 10; i++) {
			this.top10Peliculas.acolarPrioridad(auxCola.prioridad(), auxCola.primero());
			auxCola.desacolar();
		}
	}
	
	public ColaPrioridadTDA getTop10Peliculas() {
		return this.top10Peliculas;
	}
	
}
