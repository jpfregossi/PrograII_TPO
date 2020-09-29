package algoritmoTPO;

import Interfaces.ColaPrioridadTDA;
import Interfaces.ConjuntoTDA;
import Interfaces.DiccionarioSimpleTDA;
import ImplementacionesDinamicas.DiccionarioSimple;
import ImplementacionesEstaticas.ColaPrioridad;

public class Algoritmo4 {
	private int codigoPelicula;
	private DiccionarioSimpleTDA listaCantidadPeliculas;
	private ColaPrioridadTDA top10Peliculas;
	
	public Algoritmo4() {
		codigoPelicula = 0;
		listaCantidadPeliculas = new DiccionarioSimple();
		top10Peliculas = new ColaPrioridad();
		listaCantidadPeliculas.inicializarDiccionarioSimple();
		top10Peliculas.inicializarCola();
	}
	
	public void codigo(int movimiento) {
		this.codigoPelicula = 0;
		for(int i = 0; i < 4; i++) {
			this.codigoPelicula = movimiento % 10;
			movimiento = movimiento / 10;
		}
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
			auxCola.acolarPrioridad(listaCantidadPeliculas.obtener(x),x);
			auxConjunto.sacar(x);
		}
		for(int i = 0; i < 10; i++) {
			this.top10Peliculas.acolarPrioridad(auxCola.primero(), auxCola.prioridad());
			auxCola.desacolar();
		}
	}
	
	public ColaPrioridadTDA getTop10Peliculas() {
		return this.top10Peliculas;
	}
	

}
