package Actividades.Actividad4;

public class Categoria {
    // Atributos privados
    private int codigo;
    private String nombre;

    // Constructor por defecto
    public Categoria() {
        this.codigo = 0;
        this.nombre = "Sin categoría";
    }

    // Constructor con parámetros
    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Constructor de copia
    public Categoria(Categoria otraCategoria) {
        this.codigo = otraCategoria.codigo;
        this.nombre = otraCategoria.nombre;
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

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Categoría [" + codigo + "]: " + nombre);
    }
}
