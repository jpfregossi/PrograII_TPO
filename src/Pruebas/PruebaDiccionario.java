package Pruebas;

import java.util.Scanner;

import Interface.ConjuntoTDA;
import Interface.DiccionarioSimpleTDA;
import implementacion.dinamica.DiccionarioSimpleD;
import implementacion.estatica.DiccionarioSimpleE;

public class PruebaDiccionario {
	
	public static void test(DiccionarioSimpleTDA ds) {
		ds.inicializarDiccionarioSimple();
		mostrarDS(cargarDS(ds));
	}
	
	private static DiccionarioSimpleTDA cargarDS(DiccionarioSimpleTDA ds) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nIngrese la clave del elemento (o -1 para finalizar):");
		int clave = teclado.nextInt();
		int x;
		while ( clave != (-1) ) {
			System.out.println("Ingrese la valor del elemento '" + clave + "' (o -1 para finalizar):");
			x = teclado.nextInt();
			
			ConjuntoTDA claves = ds.claves();
			boolean pertenece = false;
			
			if ( claves != null ) {
				claves.pertenece(clave);
			}
			
			if ( !pertenece ) {
				ds.agregar(clave, x);
			}
			else if ( ds.obtener(clave) != x) {
				System.out.println("Desea modificar el valor '" + x + "' del elemento '" + clave + "'? (1: modificar, 0: dejar antiguo valor):");
				int resp = teclado.nextInt();
				
				if ( resp == 1 ) ds.agregar(clave, x);
				else System.out.println("El valor no se modifico.");
			}
			else System.out.println("El elemnto ingresado ya existe dentro del diccionario.");
			
			System.out.println("\nIngrese la clave del elemento (o -1 para finalizar):");
			clave = teclado.nextInt();
		}
		return ds;
		
	}
	
	private static void mostrarDS(DiccionarioSimpleTDA ds) {
		ConjuntoTDA claves = ds.claves();
		System.out.println("\n---------- Diccionario ----------");
		while (!claves.conjuntoVacio()) {
			int c = claves.obtener();
			System.out.println("{ clave: '" + c + "', valor: '" + ds.obtener(c) + "'}");
			claves.sacar(c);
		}
		System.out.println("---------------------------------");
	}
	
}
