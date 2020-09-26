package Pruebas;

import Interface.ConjuntoTDA;
import implementacion.dinamica.ConjuntoD;

public class PruebasConjunto {

    public static void test(ConjuntoTDA conjunto){
		conjunto.inicializarConjunto();
		conjunto.agregar(1);
		conjunto.agregar(3);
		conjunto.agregar(5);
		conjunto.agregar(7);

		String respuesta = conjunto.conjuntoVacio() ? "" : "no ";
		System.out.println("El conjunto " + respuesta + "está vacío.");
		System.out.println("El método obtener() devuelve: " + conjunto.obtener());
		System.out.println("Contiene a 5 ? " + conjunto.pertenece(5));
		conjunto.sacar(5);
		System.out.println("Y ahora ? " + conjunto.pertenece(5));

		conjunto.sacar(7);
		conjunto.sacar(3);
		conjunto.sacar(1);

		respuesta = conjunto.conjuntoVacio() ? "" : "no ";
		System.out.println("El conjunto " + respuesta + "está vacío.");
    }
}
