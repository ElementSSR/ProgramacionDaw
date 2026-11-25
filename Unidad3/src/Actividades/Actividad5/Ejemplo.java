package Actividades.Actividad5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo {
    public void leerDatos(String ruta) {
        int partidasJugador1 = 0, partidasJugador2 = 0;
        try {
            Scanner sc = new Scanner(new File(ruta)); // Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); // Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); // Sobre la línea leída vamos a ver qué partes la componen
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();
                if (jugador.equals("jugador1")) { // Compruebo si he leído jugador1
                    partidasJugador1 = partidas;
                } else if (jugador.equals("jugador2")) {
                    partidasJugador2 = partidas;
                }
                scLinea.close();
            }
            System.out.println(partidasJugador1 + "-" + partidasJugador2);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero.");
        }
    }

    public static void main(String[] args) {
        // try {
        // Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
        // String linea;
        // int suma = 0;
        // double contador = 0;
        // while (leer.hasNextLine()) {
        // int numero=leer.nextInt();
        // contador++;
        // suma += numero;
        // System.out.print(numero+"-");
        // }
        // System.out.println("La media es: " +suma/contador);
        // leer.close();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.leerDatos("./src/FicheroEjemplo.txt");
    }
}
