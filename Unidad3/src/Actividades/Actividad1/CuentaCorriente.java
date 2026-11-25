package Actividades.Actividad1;

public class CuentaCorriente {
    // Atributos privados
    private Persona titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaCorriente(Persona titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Getters y Setters
    public Persona getTitular() { return titular; }
    public void setTitular(Persona titular) { this.titular = titular; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Mostrar la información de la cuenta y del titular
    public void mostrarInformacion() {
        System.out.println("===============================");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo + " €");
        titular.mostrarInformacion();
        System.out.println("===============================");
    }
}
