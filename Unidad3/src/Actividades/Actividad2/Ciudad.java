package Actividades.Actividad2;

public class Ciudad {
    // Atributos privados
    private int codigo;
    private String nombre;
    private int indicativo;

    // Constructor por defecto
    public Ciudad() {
        this.codigo = 0;
        this.nombre = "Sin especificar";
        this.indicativo = 0;
    }

    // Constructor con parámetros
    public Ciudad(int codigo, String nombre, int indicativo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indicativo = indicativo;
    }

    // Constructor de copia
    public Ciudad(Ciudad otraCiudad) {
        this.codigo = otraCiudad.codigo;
        this.nombre = otraCiudad.nombre;
        this.indicativo = otraCiudad.indicativo;
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

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println(nombre + " (Código: " + codigo + ", Indicativo: +" + indicativo + ")");
    }
}
