package implementacion.dinamica;

import java.util.List;
import java.util.ArrayList;
import Interface.ColaTDA;

public class TablaD {

    List<String> tabla = new ArrayList<String>();

    void inicializarTabla(){
        tabla = null;
    }

	void agregar(String s){
        tabla.add(s);
    }

	boolean pertenece(String s){
        Boolean pertenece = false;
        for (String t: tabla){
            if ( t.equals(s) ) pertenece = true;
        }
        return pertenece;
    }

	int codigo(String s){
        int cont = -1;
        for (String t: tabla){
            cont++;
            if ( t.equals(s) ) break;
        }
        return cont;
    }

	ColaTDA tabla(){
        ColaTDA cola = new ColaD();
        /*for (String s: tabla) {
            cola.Acolar()
        }*/
        return cola;
    }

	void ordenarNombres(){}

	void ordenarCodigos(){}

	boolean estaVacia(){
        return false;
    } 
}
