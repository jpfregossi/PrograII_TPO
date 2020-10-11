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
	private DiccionarioSimpleTDA primeraAparicion;
	
	
	public SolicitudesDistintosProveedores(){
		peliculasIguales = new DiccionarioMultiple();
		peliculasIguales.inicializarDiccionarioMultiple();
		primeraAparicion = new DiccionarioSimple();
		primeraAparicion.inicializarDiccionarioSimple();
	}
	
	public void codigo(int movimiento) {
		codigoPelicula = movimiento % 10000;
		movimiento= movimiento / 10000;
		codigoProveedor = movimiento % 100;
		movimiento= movimiento / 100;
		codigoCliente = movimiento *  10000 + codigoPelicula;
		cargar();
	}
	
	public void cargar(){
		if ( !primeraAparicion.claves().pertenece(codigoCliente) ) {
			//System.out.println("Ingresó por primera vez: " + codigoCliente);
			primeraAparicion.agregar(codigoCliente, codigoProveedor);
		}
		else if ( !peliculasIguales.claves().pertenece(codigoCliente) ) {
			System.out.println("Ingresó por segunda vez: " + codigoCliente);
			peliculasIguales.agregar(codigoCliente, primeraAparicion.obtener(codigoCliente));
			peliculasIguales.agregar(codigoCliente, codigoProveedor);
		}
		else if ( !peliculasIguales.obtener(codigoCliente).pertenece(codigoProveedor) ) {
			System.out.println("Ingresó más de dos veces: " + codigoCliente);
			peliculasIguales.agregar(codigoCliente, codigoProveedor);
		}
		
	}
	
	public DiccionarioMultipleTDA getPeliculasIguales() {
		return peliculasIguales;
	}
}
