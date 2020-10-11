package misAlgoritmos;

import miApi.ConjuntoTDA;
import miApi.DiccionarioMultipleTDA;
import miApi.DiccionarioSimpleTDA;
import misImplementaciones.DiccionarioMultiple;
import misImplementaciones.DiccionarioSimple;

public class SolicitudesDistintosProveedores {
	private int codigoPelicula;
	private int codigoProveedor;
	private int codigoCliente;
	private DiccionarioMultipleTDA peliculasIguales;
	
	
	public SolicitudesDistintosProveedores(){
		peliculasIguales = new DiccionarioMultiple();
		peliculasIguales.inicializarDiccionarioMultiple();
	}
	
	public void codigo(int movimiento) {
		codigoPelicula = movimiento % 10000;
		movimiento= movimiento/10000;
		codigoProveedor = movimiento%100;
		movimiento= movimiento/100;
		codigoCliente = movimiento*10000 + codigoPelicula;
		cargar();
	}
	
	public void cargar(){
		if (peliculasIguales.claves().pertenece(codigoCliente) && !peliculasIguales.obtener(codigoCliente).pertenece(codigoProveedor)) {
			peliculasIguales.agregar(codigoCliente, codigoProveedor);
		} else if (!peliculasIguales.claves().pertenece(codigoCliente)) {
			peliculasIguales.agregar(codigoCliente, codigoProveedor);
		}
	}
	
	public void ordenar(){
		int cant = 0;
		ConjuntoTDA aux1 = peliculasIguales.claves();
		while(!aux1.conjuntoVacio()) {
			int c = aux1.obtener();
			ConjuntoTDA aux2 = peliculasIguales.obtener(c);
			while(!aux2.conjuntoVacio()) {
				int x = aux2.obtener();
				aux2.sacar(x);
				cant++;
			}
			aux1.sacar(c);
			if (cant==1) {
				peliculasIguales.eliminar(c);
			}
			cant = 0;
		}
	}
	public DiccionarioMultipleTDA getPeliculasIguales() {
		return peliculasIguales;
	}
}
