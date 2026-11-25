package Actividades.Actividad3;

public class Vehiculo {
    // Atributos privados
    private String marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;

    // Constructor por defecto
    public Vehiculo() {
        this.marca = "Sin marca";
        this.referencia = "Sin referencia";
        this.modelo = 2000;
        this.placa = "0000AAA";
        this.color = "Sin color";
        this.valor = 0;
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String referencia, int modelo, String placa, String color, int valor) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.valor = valor;
    }

    // Constructor de copia
    public Vehiculo(Vehiculo otroVehiculo) {
        this.marca = otroVehiculo.marca;
        this.referencia = otroVehiculo.referencia;
        this.modelo = otroVehiculo.modelo;
        this.placa = otroVehiculo.placa;
        this.color = otroVehiculo.color;
        this.valor = otroVehiculo.valor;
    }

    // Crear Vehiculo
    public void crearVehiculo(String marcaN, String referenciaN, int modeloN, String placaN, String colorN, int valorN) {
        this.marca = marcaN;
        this.referencia = referenciaN;
        this.modelo = modeloN;
        this.placa = placaN;
        this.color = colorN;
        this.valor = valorN;
    }

    // Cambiar Valor
    public void cambiarValor(int valorNuevo) {
        this.valor = valorNuevo;
    }

    // Calcular Impuesto
    public double calcularImpuesto() {
        // Por ejemplo, un 10% del valor del vehículo
        return this.valor * 0.10;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + marca + " " + referencia + " (" + modelo + ")");
        System.out.println("Placa: " + placa + " | Color: " + color);
        System.out.println("Valor: " + valor + " € | Impuesto (10%): " + calcularImpuesto() + " €");
    }
}
