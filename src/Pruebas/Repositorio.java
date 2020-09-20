package Pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Repositorio {

    public static void leerMovimientos() {
    	try {
	        String cadena;
	        FileReader archivo = new FileReader("src/resources/Movimientos.txt");
	        BufferedReader b = new BufferedReader(archivo);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("No se encuentra el archivo con los datos.");	
    	} catch (IOException e) {
    		System.out.println("Problemas para leer el archivo.");
    	}
    }
}
