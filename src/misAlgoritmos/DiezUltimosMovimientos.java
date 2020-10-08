package misAlgoritmos;

import miApi.ColaTDA;
import miApi.PilaTDA;
import misImplementaciones.Cola;
import misImplementaciones.Pila;

public class DiezUltimosMovimientos {
	private PilaTDA p = new Pila();
	private ColaTDA cUltimos10 = new Cola();
	
	public DiezUltimosMovimientos() {
		p.inicializarPila();
		cUltimos10.inicializarCola();
	}
	
	public void cargar(int origen) {
		p.apilar(origen);
	}
	
	public void cargarUltimos10() {
		for (int i = 0; i < 10; i++) {
			cUltimos10.acolar(p.tope());
			p.desapilar();
		}
	}
	public ColaTDA getUltimos10Movimientos() {
		cargarUltimos10();
		return cUltimos10;
	}
	

}