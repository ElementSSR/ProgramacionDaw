package Actividades.Actividad6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2 {

    public static void copiarFicheroConFecha() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la ruta del fichero a copiar: ");
        String rutaOrigen = teclado.nextLine();

        File ficheroOrigen = new File(rutaOrigen);

        // Comprobamos si existe y es un fichero antes de procesarlo
        if (!ficheroOrigen.exists() || !ficheroOrigen.isFile()) {
            System.out.println("Error: El fichero indicado no existe o es un directorio.");
            return;
        }

        // Extraemos nombre sin extensión y la propia extensión
        String nombreCompleto = ficheroOrigen.getName();
        int indicePunto = nombreCompleto.lastIndexOf('.');

        String nombreSinExtension;
        String extension;

        if (indicePunto != -1) {
            nombreSinExtension = nombreCompleto.substring(0, indicePunto);
            extension = nombreCompleto.substring(indicePunto); // Incluye el punto
        } else {
            // Control por si el fichero no tiene extensión
            nombreSinExtension = nombreCompleto;
            extension = "";
        }

        // Formateamos LocalDate.now() como yyyy_MM_dd
        String fechaFormateada = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
        String nuevoNombre = nombreSinExtension + "_copia_" + fechaFormateada + extension;

        // Obtenemos la carpeta padre (si es null, está en la raíz del proyecto)
        String directorioPadre = ficheroOrigen.getParent();
        File ficheroDestino;
        if (directorioPadre != null) {
            ficheroDestino = new File(directorioPadre, nuevoNombre);
        } else {
            ficheroDestino = new File(nuevoNombre);
        }

        // Leemos del fichero origen y escribimos en el fichero destino
        try (BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDestino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Copia creada correctamente en: " + ficheroDestino.getPath());

        } catch (IOException e) {
            System.out.println("Error durante la lectura/escritura: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copiarFicheroConFecha();
    }
}
