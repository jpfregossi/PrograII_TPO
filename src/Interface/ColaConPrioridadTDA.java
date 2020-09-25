package Interface;

/*
InicializarCola: inicializa la estructura cola.
AcolarPrioridad: agrega un elemento ‘x’ con prioridad ‘p’, ambos datos suministrados. La estructura debe
estar inicializada.
Desacolar: elimina el elemento con mayor prioridad. La estructura no debe estar vacía.
Primero: obtiene el valor del dato de mayor prioridad. El valor no se elimina. La estructura no debe estar
vacía.
Prioridad: obtiene la prioridad del dato de mayor prioridad (no se elimina). La estructura no debe estar
vacía.
ColaVacia: indica si la cola no contiene elementos. La estructura debe estar inicializada.
 */

public interface ColaConPrioridadTDA {
	
	void inicializarCola();
	
	void agregarPrioridad(int x, int p);
	
	void desacolar();
	
	int primero();
	
	int prioridad();
	
	boolean colaVacia();
	
}
