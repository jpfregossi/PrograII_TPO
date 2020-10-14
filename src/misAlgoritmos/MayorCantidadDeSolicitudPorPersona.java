package misAlgoritmos;
import miApi.ColaPrioridadTDA;
import miApi.ColaTDA;
import miApi.ConjuntoTDA;
import miApi.DiccionarioSimpleTDA;
import misImplementaciones.Cola;
import misImplementaciones.ColaPrioridad;
import misImplementaciones.DiccionarioSimple;

public class MayorCantidadDeSolicitudPorPersona {
	private ColaPrioridadTDA ColaPAux;
	private ColaTDA ColaIDPersonas;
	private DiccionarioSimpleTDA Diccionario;
	private ColaTDA ColaOrdenada;

	
	public MayorCantidadDeSolicitudPorPersona(){
		this.ColaPAux = new ColaPrioridad();
		this.ColaIDPersonas = new Cola();
		this.Diccionario = new DiccionarioSimple();
		this.ColaOrdenada = new Cola();
		
		this.Diccionario.inicializarDiccionarioSimple();
		this.ColaPAux.inicializarCola();
		this.ColaIDPersonas.inicializarCola();	
		this.ColaOrdenada.inicializarCola();
	}
	
	public int codigoPersona(int x) { 
		return (x/1000000);
	}
	
	public void cargarPersona(int x) {
		int persona = codigoPersona(x);
		int valor = 0;
		if(Diccionario.claves().pertenece(persona)) {
			valor = Diccionario.obtener(persona);
			Diccionario.eliminar(persona);
			Diccionario.agregar(persona, valor+1);
		}
		else { 
			Diccionario.agregar(persona, 1);		
		}	
	}
	
	public void cargarColaPrioridad() {
		ConjuntoTDA conAux = this.Diccionario.claves();
		int alquileres = 0;
        int aux = 0;
        while (!conAux.conjuntoVacio()){
            aux = conAux.obtener();
            alquileres = this.Diccionario.obtener(aux);
            this.ColaPAux.acolarPrioridad(aux,alquileres);
            this.Diccionario.eliminar(aux);
            conAux.sacar(aux);
		}	
		
		int mayor;
		mayor = this.ColaPAux.prioridad();
		while(this.ColaPAux.prioridad()==mayor && !ColaPAux.colaVacia()) {
			this.ColaIDPersonas.acolar(this.ColaPAux.primero());
			this.ColaPAux.desacolar();
		}
	}
	
	
	public ColaTDA getIDPersonasOrdenadas() { 
		int aux = 0;
		ColaTDA cAux = new Cola();
		cAux.inicializarCola();
        while (!this.ColaIDPersonas.colaVacia()){
            int menor = this.ColaIDPersonas.primero();
            this.ColaIDPersonas.desacolar();
            while (!this.ColaIDPersonas.colaVacia()){
                if(menor < this.ColaIDPersonas.primero()){
                    cAux.acolar(this.ColaIDPersonas.primero());
                }else{
                    aux = menor;
                    menor = this.ColaIDPersonas.primero();
                    cAux.acolar(aux);
                }
                this.ColaIDPersonas.desacolar();
            }
            while (!cAux.colaVacia()){
            	this.ColaIDPersonas.acolar(cAux.primero());
            	cAux.desacolar();
            }
            this.ColaOrdenada.acolar(menor);
        }
        while (!this.ColaOrdenada.colaVacia()){
        	this.ColaIDPersonas.acolar(ColaOrdenada.primero());
        	this.ColaOrdenada.desacolar();
        }
		return this.ColaIDPersonas;
	}

}
