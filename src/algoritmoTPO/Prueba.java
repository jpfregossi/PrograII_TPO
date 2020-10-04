package algoritmoTPO;

import Interfaces.ColaPrioridadTDA;
import Interfaces.ColaTDA;
import ImplementacionesDinamicas.Cola;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaTDA c = new Cola();
		c.inicializarCola();
		c.acolar(11010001);
		c.acolar(43020002);
		c.acolar(2020003);
		c.acolar(43010002);
		c.acolar(11030001);
		c.acolar(2040004);
		c.acolar(5030005);
		Algoritmo4 m = new Algoritmo4();
		while(!c.colaVacia()) {
			m.codigo(c.primero());
			m.cargar();
			c.desacolar();
		}
		m.ordenar();
		ColaPrioridadTDA b = m.getTop10Peliculas();
		while(!b.colaVacia()) {
			System.out.println(b.primero()+"  "+ b.prioridad());
			b.desacolar();
		}

	}

}
