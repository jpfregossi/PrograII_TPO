package misAplicaciones;

import miApi.*;
import misAlgoritmos.*;
import misImplementaciones.ColaPrioridad;
import misImplementaciones.DiccionarioMultiple;
import misImplementaciones.DiccionarioSimple;

public class Puntos1y2 {
	
	public static void correr() {
		TablaTDA peliculas = LeerArchivos.obtenerPeliculas();
		TablaTDA proveedores = LeerArchivos.obtenerProveedores();

		ColaTDA listado = LeerArchivos.obtenerMovimientos(peliculas, proveedores);
		
		DiezUltimosMovimientos primerPuntoAlgo = new DiezUltimosMovimientos();
		
		MasSolicitadas tercerPuntoAlgo = new MasSolicitadas();
		Ranking cuartoPuntoAlgo = new Ranking();
	
		while ( !listado.colaVacia() ) {
			int elemento = listado.primero();
			primerPuntoAlgo.cargar(elemento);
			
			tercerPuntoAlgo.cargarMovimiento(listado.primero());
			cuartoPuntoAlgo.cargar(elemento);
			
			listado.desacolar();
		}
		
		/* Primer Punto */
		ColaTDA primerPuntoCola = primerPuntoAlgo.getUltimos10Movimientos();
		
		System.out.println("Listado Ultimas Solicitudes");
		System.out.println("----------------------------------------------------------");
		System.out.println("Id | Prov 	     	 | Pelicula");
		System.out.println("----------------------------------------------------------");
		
		while ( !primerPuntoCola.colaVacia() ){
			int mov = primerPuntoCola.primero();
			int usuario = mov / 1000000;
			int proveedor = (mov / 10000) - (usuario * 100) ;
			int pelicula = mov - (usuario * 1000000) - (proveedor * 10000);
			
			//System.out.println(usuario + "  	" + proveedor + " 	   " + pelicula );
			String nombrePe = obtenerNombrePorCodigo(proveedores, proveedor);
			String nombrePr = obtenerNombrePorCodigo(peliculas, pelicula);
			System.out.println(usuario + "  " + nombrePe + ("                    ").substring(0, 20 - nombrePe.length()) + "  " + nombrePr );
			
			primerPuntoCola.desacolar();
		}
		System.out.println("----------------------------------------------------------");
		/* ------------- */
		
		/* Segundo Punto */
		
		/* ------------- */

		/* Tercer Punto */
		System.out.println("\nListado Películas Con Más Solicitudes:\n");
		
		DiccionarioMultipleTDA tercerPuntoDic = tercerPuntoAlgo.procesarMovimientos();
		ConjuntoTDA tercerPuntoClaves = tercerPuntoDic.claves();
		while ( !tercerPuntoClaves.conjuntoVacio() ) {
			int clave = tercerPuntoClaves.obtener();
			ConjuntoTDA provs = tercerPuntoDic.obtener(clave);
			String cadenaProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int p = provs.obtener();
				cadenaProveedores += obtenerNombrePorCodigo(proveedores, p) + ", ";
				//cadenaProveedores += p + ", ";
				provs.sacar(p);
			}
			System.out.println( "( " + clave + " ) " + obtenerNombrePorCodigo(peliculas,clave) + " ( " + cadenaProveedores.substring(0,cadenaProveedores.length() - 2) + " )");
			//System.out.println(clave + " " + cadenaProveedores.substring(0,cadenaProveedores.length() - 2) );
			tercerPuntoClaves.sacar(clave);
		}
		/* ------------- */
		
		/* Cuarto Punto */
		cuartoPuntoAlgo.ordenar();
		ColaPrioridadTDA cuartoPuntoCola = cuartoPuntoAlgo.getTop10Peliculas();
		System.out.println("\nRanking 10 Más Vistas:\n");
		
		while ( !cuartoPuntoCola.colaVacia() ) {
			int peli = cuartoPuntoCola.primero();
			//System.out.println( cuartoPuntoCola.prioridad() + ") " + obtenerNombrePorCodigo(peliculas, peli));
			System.out.println( cuartoPuntoCola.prioridad() + ") " + peli );
			cuartoPuntoCola.desacolar();
		}
		/* ------------ */
	}
	
	private static String obtenerNombrePorCodigo(TablaTDA tabla, int c) {
		ColaCadenaTDA colaTabla = tabla.tabla();	
		String [] elemento = new String[2];
		
		while ( !colaTabla.colaVacia() ) {
			elemento = colaTabla.primero().split("; ");
			int codigo = Integer.valueOf(elemento[0]);
			if ( codigo == c ) break;
			else colaTabla.desacolar();
		}
		
		return elemento[1];
	}
}
