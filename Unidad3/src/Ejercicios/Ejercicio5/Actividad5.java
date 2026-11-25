package Ejercicios.Ejercicio5;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad5 {
    public static void mostrarHeroes(String rutaFichero, String letraInicial) {
        File fichero = new File(rutaFichero);

        if (!fichero.exists() || !fichero.isFile()) {
            System.out.println("Error: El fichero " + rutaFichero + " no existe.");
            return;
        }

        try {
            // Lectura del contenido del fichero JSON (exactamente como en tus apuntes)
            Object ob = new JSONParser().parse(new FileReader(fichero));

            JSONArray listaHeroes;
            if (ob instanceof JSONArray) {
                // Si el JSON empieza directamente por [ { ... }, { ... } ]
                listaHeroes = (JSONArray) ob;
            } else {
                // Si el JSON empieza por { "heroes": [ ... ] } como en el ejemplo del PDF
                JSONObject js = (JSONObject) ob;
                // Toma el primer array que encuentre dentro del objeto raíz
                Object claveArray = js.keySet().iterator().next();
                listaHeroes = (JSONArray) js.get(claveArray);
            }

            // Cabecera de la tabla de salida
            System.out.println(
                    "==============================================================================================");
            System.out.printf("%-20s | %-15s | %-22s | %-25s%n", "SUPERHERO", "PUBLISHER", "ALTER EGO",
                    "FIRST APPEARANCE");
            System.out.println(
                    "==============================================================================================");

            // Recorrido del JSONArray extrayendo cada JSONObject y sus claves
            for (int i = 0; i < listaHeroes.size(); i++) {
                JSONObject heroe = (JSONObject) listaHeroes.get(i);

                String superhero = (String) heroe.get("superhero");
                String publisher = (String) heroe.get("publisher");
                String alterEgo = (String) heroe.get("alter_ego");
                String firstAppearance = (String) heroe.get("first_appearance");

                // Filtrado: héroes de DC cuyo superhero empieza por la letra pasada como
                // parámetro
                if (publisher != null && publisher.contains("DC") &&
                        superhero != null && superhero.startsWith(letraInicial)) {

                    System.out.printf("%-20s | %-15s | %-22s | %-25s%n",
                            superhero, publisher, alterEgo, firstAppearance);
                }
            }
            System.out.println(
                    "==============================================================================================");

        } catch (Exception e) {
            System.out.println("Error al leer el JSON: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        mostrarHeroes("./src/Ejercicios/Ejercicio5/heroes.json", "G");
    }
}
