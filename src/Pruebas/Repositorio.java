package Pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Interface.ColaTDA;
import implementacion.dinamica.ColaD;

public class Repositorio {

	Map<String, Integer> peliculas = new HashMap<String, Integer>();
	Map<String, Integer> proveedores = new HashMap<String, Integer>();
	public List<String> peliculasPorCodigo = new ArrayList<String>();
	public List<String> proveedoresPorCodigo = new ArrayList<String>();
	ColaTDA mov = new ColaD();
	
	public ColaTDA getListado() {
		
		mov.inicializarCola();

		try {
	        String cadena;
	        FileReader archivo = new FileReader("../src/resources/LISTADO DE PELICULAS.txt");
			BufferedReader b = new BufferedReader(archivo);
			int cont = 0;
	        while((cadena = b.readLine())!=null) {
				peliculas.put(cadena, cont);
				peliculasPorCodigo.add(cadena);
				cont++;
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo del listado.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo del listado.");
		}

		Map<String, Integer> proveedores = new HashMap<String, Integer>();
		try {
	        String cadena;
	        FileReader archivo = new FileReader("../src/resources/StreamCia.txt");
			BufferedReader b = new BufferedReader(archivo);
			int cont = 0;
	        while((cadena = b.readLine())!=null) {
				proveedores.put(cadena, cont);
				proveedoresPorCodigo.add(cadena);
				cont++;
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo del stream.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo del stream.");
		}

		try {
			String cadena;
	        FileReader archivo = new FileReader("../src/resources/Movimientos.txt");
	        BufferedReader b = new BufferedReader(archivo);
	        while((cadena = b.readLine())!=null) {
				String[] datos = cadena.split("; ");
				int encadenado = 0;
				
				int persona =  Integer.valueOf(datos[0]);

				int pelicula = Integer.valueOf(peliculas.get(datos[1]));

				int proveedor = Integer.valueOf(proveedores.get(datos[2]));

				encadenado = persona * 1000000 + proveedor * 10000 + pelicula; 

				mov.acolar(encadenado);

				//System.out.println(encadenado);
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo con los datos.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo.");
    	}
		
		return mov;
	}
}
