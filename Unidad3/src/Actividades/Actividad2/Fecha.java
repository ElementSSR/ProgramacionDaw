package Actividades.Actividad2;

public class Fecha {
    // Atributos privados
    private int dia;
    private int mes;
    private int anio;

    // Constructor por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Constructor de copia
    public Fecha(Fecha otraFecha) {
        this.dia = otraFecha.dia;
        this.mes = otraFecha.mes;
        this.anio = otraFecha.anio;
    }

    // Getters y Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }
}
