import implementacion.dinamica.*;
import Interface.*;

import Pruebas.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Trabajo Práctico Obligatorio - Programación II\n");
		
		//Repositorio.leerMovimientos();
		/*PruebaDiccionarioS pruebas = new PruebaDiccionarioS();
		pruebas.startTest();*/
		
		DiccionarioSimpleTDA dic = new DiccionarioSimpleD();
		dic.inicializarDiccionarioSimple();
		dic.agregar(1, 2);
		dic.agregar(2, 4);
		dic.agregar(3, 6);
		dic.agregar(4, 8);
		dic.agregar(5, 10);

		int [] claves = dic.claves();
		System.out.println("\n---------- Diccionario ----------");
		for (int c: claves) {
			System.out.println("{ clave: '" + c + "', valor: '" + dic.obtener(c) + "'}");
		}
		System.out.println("---------------------------------");
	}

}
