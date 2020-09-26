import implementacion.dinamica.*;
import implementacion.estatica.*;
import Interface.*;

import Pruebas.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Trabajo Práctico Obligatorio - Programación II\n");

		ConjuntoTDA conjunto = new ConjuntoD();
		PruebasConjunto.test(conjunto);

		DiccionarioSimpleTDA dicE = new DiccionarioSimpleD();
		PruebaDiccionario.test(dicE);

	}

}
