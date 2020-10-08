package misAplicaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import miApi.ColaTDA;
import miApi.TablaTDA;
import misImplementaciones.Cola;
import misImplementaciones.Tabla;

public class LeerArchivos {
	
	public static TablaTDA obtenerPeliculas() {
		TablaTDA peliculas = new Tabla();
		peliculas.inicializarTabla();
		try {
	        String cadena;
	        FileReader archivo = new FileReader("src/resources/LISTADO DE PELICULAS.txt");
			BufferedReader b = new BufferedReader(archivo);
			int cont = 0;
	        while((cadena = b.readLine())!=null) {
				peliculas.agregar(cont, cadena);
				cont++;
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo del listado.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo del listado.");
		}
		
		return peliculas;
	}
	
	public static TablaTDA obtenerProveedores() {
		TablaTDA proveedores = new Tabla();
		try {
	        String cadena;
	        FileReader archivo = new FileReader("src/resources/StreamCia.txt");
			BufferedReader b = new BufferedReader(archivo);
			int cont = 0;
	        while((cadena = b.readLine())!=null) {
				proveedores.agregar(cont, cadena);
				cont++;
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo del stream.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo del stream.");
		}
		
		return proveedores;
	}
	
	public static ColaTDA obtenerMovimientos(TablaTDA peliculas, TablaTDA proveedores) {
		ColaTDA mov = new Cola();
		mov.inicializarCola();

		try {
			String cadena;
	        FileReader archivo = new FileReader("src/resources/Movimientos.txt");
	        BufferedReader b = new BufferedReader(archivo);
	        while((cadena = b.readLine())!=null) {
				String[] datos = cadena.split("; ");
				int encadenado = 0;
				
				int persona =  Integer.valueOf(datos[0]);
				
				int pelicula = Integer.valueOf(peliculas.codigo(datos[1]));

				int proveedor = Integer.valueOf(proveedores.codigo(datos[2]));

				encadenado = persona * 1000000 + proveedor * 10000 + pelicula; 

				mov.acolar(encadenado);
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
