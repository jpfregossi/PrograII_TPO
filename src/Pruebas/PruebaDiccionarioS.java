package Pruebas;

import java.util.Scanner;

import Interface.DiccionarioSimpleTDA;
import implementacion.dinamica.DiccionarioSimpleD;
import implementacion.estatica.DiccionarioSimpleE;

public class PruebaDiccionarioS {
	private DiccionarioSimpleTDA dse = new DiccionarioSimpleD();
	private Scanner teclado = new Scanner(System.in);
	private int clave, x, opc;
	
	public void startTest() {
		dse.inicializarDiccionarioSimple();
		cargarDS();
		mostrarDS();
	}
	
	private void cargarDS() {
		System.out.println("\nIngrese la clave del elemento (o -1 para finalizar):");
		clave = teclado.nextInt();
		
		while ( clave != (-1) ) {
			System.out.println("Ingrese la valor del elemento '" + clave + "' (o -1 para finalizar):");
			x = teclado.nextInt();
			
			int[] claves = dse.claves();
			boolean pertenece = false;
			
			if ( claves != null ) {
				for ( int c: claves ) {
					if ( clave == c ) {
						pertenece = true;
						break;
					}
				}
			}
			
			if ( !pertenece ) {
				dse.agregar(clave, x);
			}
			else if ( dse.obtener(clave) != x) {
				System.out.println("Desea modificar el valor '" + x + "' del elemento '" + clave + "'? (1: modificar, 0: dejar antiguo valor):");
				int resp = teclado.nextInt();
				
				if ( resp == 1 ) dse.agregar(clave, x);
				else System.out.println("El valor no se modifico.");
			}
			else System.out.println("El elemnto ingresado ya existe dentro del diccionario.");
			
			System.out.println("\nIngrese la clave del elemento (o -1 para finalizar):");
			clave = teclado.nextInt();
		}
		
	}
	
	private void mostrarDS() {
		int [] claves = dse.claves();
		System.out.println("\n---------- Diccionario ----------");
		for (int c: claves) {
			System.out.println("{ clave: '" + c + "', valor: '" + dse.obtener(c) + "'}");
		}
		System.out.println("---------------------------------");
	}
	
}
