package Actividades.Actividad4;

public class Proveedor {
    // Atributos privados
    private int codigo;
    private String direccion;
    private String ciudad;
    private String provincia;

    // Constructor por defecto
    public Proveedor() {
        this.codigo = 0;
        this.direccion = "Sin dirección";
        this.ciudad = "Sin ciudad";
        this.provincia = "Sin provincia";
    }

    // Constructor con parámetros
    public Proveedor(int codigo, String direccion, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    // Constructor de copia
    public Proveedor(Proveedor otroProveedor) {
        this.codigo = otroProveedor.codigo;
        this.direccion = otroProveedor.direccion;
        this.ciudad = otroProveedor.ciudad;
        this.provincia = otroProveedor.provincia;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Proveedor [" + codigo + "]: " + direccion + " (" + ciudad + ", " + provincia + ")");
    }
}
