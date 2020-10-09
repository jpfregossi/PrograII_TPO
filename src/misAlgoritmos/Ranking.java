package misAlgoritmos;

import miApi.ColaPrioridadTDA;
import miApi.ConjuntoTDA;
import miApi.DiccionarioSimpleTDA;
import misImplementaciones.ColaPrioridad;
import misImplementaciones.DiccionarioSimple;

public class Ranking {
	private int codigoPelicula;
	private DiccionarioSimpleTDA listaCantidadPeliculas;
	private ColaPrioridadTDA top10Peliculas;
	
	public Ranking() {
		codigoPelicula = 0;
		listaCantidadPeliculas = new DiccionarioSimple();
		top10Peliculas = new ColaPrioridad();
		listaCantidadPeliculas.inicializarDiccionarioSimple();
		top10Peliculas.inicializarCola();
	}
	
	public void codigo(int movimiento) {
		int x = 1;
		for(int i = 0; i < 4; i++) {
			x = x*10;
		}
		this.codigoPelicula = movimiento % x;
	}
	
	public void cargar() {
		if (listaCantidadPeliculas.claves().pertenece(codigoPelicula)) {
			int i = listaCantidadPeliculas.obtener(codigoPelicula);
			i++;
			listaCantidadPeliculas.agregar(i , codigoPelicula);
		} else {
			listaCantidadPeliculas.agregar(1 , codigoPelicula);
		}
	}
	public void ordenar() {
		ColaPrioridadTDA auxCola = new ColaPrioridad();
		auxCola.inicializarCola();
		ConjuntoTDA auxConjunto = listaCantidadPeliculas.claves();
		int x = 0;
		while(!auxConjunto.conjuntoVacio()) {
			x = auxConjunto.obtener();
			auxCola.acolarPrioridad(x,listaCantidadPeliculas.obtener(x));
			auxConjunto.sacar(x);
		}
		int i = 0;
		while(!auxCola.colaVacia() && i < 10) {
			this.top10Peliculas.acolarPrioridad(auxCola.primero(),auxCola.prioridad());
			auxCola.desacolar();
			i++;
		}
	}
	
	public ColaPrioridadTDA getTop10Peliculas() {
		return this.top10Peliculas;
	}
	
}
