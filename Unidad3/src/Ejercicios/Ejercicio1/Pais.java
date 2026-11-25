package Ejercicios.Ejercicio1;

public class Pais {
    // Atributos privados
    private String nombre;
    private long poblacion;
    private double pib;

    // Constructor por defecto
    public Pais() {
        this.nombre = "Sin especificar";
        this.poblacion = 1;
        this.pib = 0.0;
    }

    // Constructor con parámetros
    public Pais(String nombre, long poblacion, double pib) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pib = pib;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    // Método para calcular el PIB per cápita: (PIB * 100000) / población
    public double calcularPibPerCapita() {
        if (this.poblacion == 0) {
            return 0.0;
        }
        return (this.pib * 100000.0) / this.poblacion;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("País: " + nombre);
        System.out.println("Población: " + poblacion + " habitantes");
        System.out.println("PIB: " + pib);
        System.out.println("PIB per cápita: " + calcularPibPerCapita());
        System.out.println("-----------------------------------");
    }
}
