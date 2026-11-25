package Actividades.Actividad4;

public class Pieza {
    // Atributos privados
    private int codigo;
    private String nombre;
    private String color;
    private double precio;
    private Categoria categoria;

    // Constructor por defecto
    public Pieza() {
        this.codigo = 0;
        this.nombre = "Sin nombre";
        this.color = "Sin color";
        this.precio = 0.0;
        this.categoria = new Categoria();
    }

    // Constructor con parámetros
    public Pieza(int codigo, String nombre, String color, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Constructor de copia
    public Pieza(Pieza otraPieza) {
        this.codigo = otraPieza.codigo;
        this.nombre = otraPieza.nombre;
        this.color = otraPieza.color;
        this.precio = otraPieza.precio;
        this.categoria = new Categoria(otraPieza.categoria);
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Pieza [" + codigo + "]: " + nombre + " | Color: " + color + " | Precio: " + precio + " €");
        System.out.print("   -> ");
        categoria.mostrarInformacion();
    }
}
