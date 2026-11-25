package Ejercicios.Ejercicio1;

public class Actividad1 {
    public static void main(String[] args) {
        // Creamos un país usando el constructor con parámetros
        Pais pais1 = new Pais("España", 48000000L, 14000000.0);
        pais1.mostrarInformacion();

        // Creamos otro país usando el constructor por defecto y modificamos con setters
        Pais pais2 = new Pais();
        pais2.setNombre("Portugal");
        pais2.setPoblacion(10300000L);
        pais2.setPib(2500000.0);
        pais2.mostrarInformacion();

        // Uso de getters y del cálculo individual
        System.out.println("El PIB per cápita de " + pais1.getNombre() + " es: " + pais1.calcularPibPerCapita());
    }
}
