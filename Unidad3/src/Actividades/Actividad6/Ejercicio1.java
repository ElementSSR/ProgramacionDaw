package Actividades.Actividad6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    // Tuve que hacer una parte con ayuda de la IA ya que habia fallos que no entiendia y me daba todo el rato soluciones con cosas que no hemos dado, 
    public static void contarPalabra(String rutaFichero) {
        File fichero = new File(rutaFichero);

        // Comprobación si existe y es un fichero antes de procesarlo
        if (!fichero.exists() || !fichero.isFile()) {
            System.out.println("Error: La ruta no existe o no corresponde a un fichero válido.");
            return;
        }

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar: ");
        String palabraBuscada = teclado.next();

        int contador = 0;

        // Apertura del flujo de lectura con BufferedReader para usar readLine()
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Analizamos cada línea con Scanner
                Scanner scLinea = new Scanner(linea);
                scLinea.useDelimiter("\\s+");

                while (scLinea.hasNext()) {
                    String palabraActual = scLinea.next();
                    if (palabraActual.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
                scLinea.close();
            }
            System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces en el texto.");

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        contarPalabra("./src/Actividades/Actividad6/texto.txt");
    }
}
