package Actividades.Actividad4;

public class Suministra {
    // Atributos privados
    private Proveedor proveedor;
    private Pieza pieza;
    private String fecha;
    private int cantidad;

    // Constructor por defecto
    public Suministra() {
        this.proveedor = new Proveedor();
        this.pieza = new Pieza();
        this.fecha = "01/01/2026";
        this.cantidad = 0;
    }

    // Constructor con parámetros
    public Suministra(Proveedor proveedor, Pieza pieza, String fecha, int cantidad) {
        this.proveedor = proveedor;
        this.pieza = pieza;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    // Constructor de copia
    public Suministra(Suministra otroSuministro) {
        this.proveedor = new Proveedor(otroSuministro.proveedor);
        this.pieza = new Pieza(otroSuministro.pieza);
        this.fecha = otroSuministro.fecha;
        this.cantidad = otroSuministro.cantidad;
    }

    // Getters y Setters
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("==========================================");
        System.out.println("REGISTRO DE SUMINISTRO (" + fecha + ") - Cantidad: " + cantidad + " uds.");
        proveedor.mostrarInformacion();
        pieza.mostrarInformacion();
        System.out.println("==========================================");
    }
}
