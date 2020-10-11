package misAplicaciones;

import miApi.*;
import misAlgoritmos.*;

public class Puntos1y2 {
	
	public static void correr() {
		TablaTDA peliculas = LeerArchivos.obtenerPeliculas();
		TablaTDA proveedores = LeerArchivos.obtenerProveedores();

		ColaTDA listado = LeerArchivos.obtenerMovimientos(peliculas, proveedores);
		
		DiezUltimosMovimientos primerPuntoAlgo = new DiezUltimosMovimientos();
		
		MasSolicitadas tercerPuntoAlgo = new MasSolicitadas();
		Ranking cuartoPuntoAlgo = new Ranking();
		SolicitudesDistintosProveedores quintoPuntoAlgo = new SolicitudesDistintosProveedores();
	
		while ( !listado.colaVacia() ) {
			int elemento = listado.primero();
			primerPuntoAlgo.cargar(elemento);
			
			tercerPuntoAlgo.cargarMovimiento(listado.primero());
			cuartoPuntoAlgo.codigo(elemento);
			quintoPuntoAlgo.codigo(elemento);
			
			listado.desacolar();
		}
		
		/* Primer Punto */
		ColaTDA primerPuntoCola = primerPuntoAlgo.getUltimos10Movimientos();
		
		//imprimirPrimerPunto(primerPuntoCola);
		imprimirPrimerPunto(primerPuntoCola, peliculas, proveedores);
		/* ------------- */
		
		/* Segundo Punto */
		
		/* ------------- */

		/* Tercer Punto */		
		DiccionarioMultipleTDA tercerPuntoDic = tercerPuntoAlgo.procesarMovimientos();
		ConjuntoTDA tercerPuntoClaves = tercerPuntoDic.claves();

		//imprimirTercerPunto(tercerPuntoDic, tercerPuntoClaves);
		imprimirTercerPunto(tercerPuntoDic, tercerPuntoClaves, peliculas, proveedores);
		/* ------------- */
		
		/* Cuarto Punto */
		
		cuartoPuntoAlgo.ordenar();
		ColaPrioridadTDA cuartoPuntoCola = cuartoPuntoAlgo.getTop10Peliculas();
		
		//imprimirCuartoPunto(cuartoPuntoCola);
		imprimirCuartoPunto(cuartoPuntoCola, peliculas);
		/* ------------ */
		
		/* Quinto Punto */
		//quintoPuntoAlgo.ordenar();
		DiccionarioMultipleTDA b = quintoPuntoAlgo.getPeliculasIguales();
		ConjuntoTDA claves = b.claves();
		
		System.out.print("\nSolicitudes de Películas a Distintos Proveederes por Usuario:\n");
		
		while(!claves.conjuntoVacio()) {
			int x = claves.obtener();
			int usuario = x / 10000;
			int pelicula = x % 10000;
			ConjuntoTDA aux2 = b.obtener(x);
			System.out.print( usuario + ":  " + pelicula + "(");
			
			while(!aux2.conjuntoVacio()) {
				int v = aux2.obtener();
				System.out.print(v+",");
				aux2.sacar(v);
			}
			System.out.print(")");
			claves.sacar(x);
			System.out.println();
		}
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
	
	private static void imprimirPrimerPunto(ColaTDA cola) {
		System.out.println("Listado Ultimas Solicitudes");
		System.out.println("-----------------------");
		System.out.println("Id    | Prov | Pelicula");
		System.out.println("-----------------------");
		
		while ( !cola.colaVacia() ){
			int mov = cola.primero();
			int usuario = mov / 1000000;
			int proveedor = (mov / 10000) - (usuario * 100) ;
			int pelicula = mov - (usuario * 1000000) - (proveedor * 10000);
			
			System.out.println(usuario + "  	" + proveedor + " 	   " + pelicula );
			
			cola.desacolar();
		}
		System.out.println("-----------------------");
	}
	
	private static void imprimirPrimerPunto(ColaTDA cola, TablaTDA peliculas, TablaTDA proveedores) {
		System.out.println("Listado Ultimas Solicitudes");
		System.out.println("----------------------------------------------------------");
		System.out.println("Id | Prov 	     	 | Pelicula");
		System.out.println("----------------------------------------------------------");
		
		while ( !cola.colaVacia() ){
			int mov = cola.primero();
			int usuario = mov / 1000000;
			int proveedor = (mov / 10000) - (usuario * 100) ;
			int pelicula = mov - (usuario * 1000000) - (proveedor * 10000);

			String nombrePe = obtenerNombrePorCodigo(proveedores, proveedor);
			String nombrePr = obtenerNombrePorCodigo(peliculas, pelicula);
			System.out.println(usuario + "  " + nombrePe + ("                    ").substring(0, 20 - nombrePe.length()) + "  " + nombrePr );
			
			cola.desacolar();
		}
		System.out.println("----------------------------------------------------------");
	}
	
	private static void imprimirTercerPunto(DiccionarioMultipleTDA d, ConjuntoTDA c) {
		System.out.println("\nListado Películas Con Más Solicitudes:\n");
		
		while ( !c.conjuntoVacio() ) {
			int clave = c.obtener();
			ConjuntoTDA provs = d.obtener(clave);
			String cadenaProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int p = provs.obtener();
				cadenaProveedores += p + ", ";
				provs.sacar(p);
			}
	
			System.out.println(clave + " " + cadenaProveedores.substring(0,cadenaProveedores.length() - 2) );
			
			c.sacar(clave);
		}
	}
	
	private static void imprimirTercerPunto(DiccionarioMultipleTDA d, ConjuntoTDA c, TablaTDA peliculas, TablaTDA proveedores) {
		System.out.println("\nListado Películas Con Más Solicitudes:\n");
		
		while ( !c.conjuntoVacio() ) {
			int clave = c.obtener();
			ConjuntoTDA provs = d.obtener(clave);
			String cadenaProveedores = "";
			while ( !provs.conjuntoVacio() ) {
				int p = provs.obtener();
				cadenaProveedores += obtenerNombrePorCodigo(proveedores, p) + ", ";
				provs.sacar(p);
			}
			System.out.println( "( " + clave + " ) " + obtenerNombrePorCodigo(peliculas,clave) + " ( " + cadenaProveedores.substring(0,cadenaProveedores.length() - 2) + " )");
			c.sacar(clave);
		}
	}
	
	
	private static void imprimirCuartoPunto(ColaPrioridadTDA cola){
		System.out.println("\nRanking 10 Más Vistas:\n");
		while ( !cola.colaVacia() ) {
			int peli = cola.primero();
			System.out.println( cola.prioridad() + ") " + peli );
			cola.desacolar();
		}
	}
	
	private static void imprimirCuartoPunto(ColaPrioridadTDA cola, TablaTDA peliculas){
		System.out.println("\nRanking 10 Más Vistas:\n");
		
		while ( !cola.colaVacia() ) {
			int peli = cola.primero();
			System.out.println( cola.prioridad() + ") " + obtenerNombrePorCodigo(peliculas, peli));
			cola.desacolar();
		}
	}
}
