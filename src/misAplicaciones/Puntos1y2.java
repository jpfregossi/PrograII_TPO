package misAplicaciones;

import miApi.*;
import misAlgoritmos.*;

public class Puntos1y2 {
	
	public static void correr() {
		TablaTDA peliculas = LeerArchivos.obtenerPeliculas();
		TablaTDA proveedores = LeerArchivos.obtenerProveedores();

		ColaTDA listado = LeerArchivos.obtenerMovimientos(peliculas, proveedores);
		
		DiezUltimosMovimientos primerPuntoAlgo = new DiezUltimosMovimientos();
	
		while ( !listado.colaVacia() ) {
			primerPuntoAlgo.cargar(listado.primero());
			
			listado.desacolar();
		}
		
		/* Primer Punto */
		ColaTDA primerPuntoCola = primerPuntoAlgo.getUltimos10Movimientos();
		
		System.out.println("Listado Ultimas Solicitudes");
		System.out.println("Id     Prov 	  Pelicula");
		
		while ( !primerPuntoCola.colaVacia() ){
			int mov = primerPuntoCola.primero();
			int usuario = mov / 1000000;
			int proveedor = (mov / 10000) - (usuario * 100) ;
			int pelicula = mov - (usuario * 1000000) - (proveedor * 10000);
			
			System.out.println(usuario + "  	" + proveedor + " 	   " + pelicula );
			
			primerPuntoCola.desacolar();
		}
		/* ----------------------------------------- */
		
		
	}
}
