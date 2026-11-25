package Actividades.Actividad3;

public class Persona {
    // Atributos privados
    private String docId;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private char genero;
    private Vehiculo vehiculo;

    // Constructor por defecto
    public Persona() {
        this.docId = "00000000X";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.fechaNac = "01/01/2000";
        this.genero = 'N';
        this.vehiculo = new Vehiculo();
    }

    // Constructor con parámetros
    public Persona(String docId, String nombre, String apellido, String fechaNac, char genero, Vehiculo vehiculo) {
        this.docId = docId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.vehiculo = vehiculo;
    }

    // Constructor de copia
    public Persona(Persona otraPersona) {
        this.docId = otraPersona.docId;
        this.nombre = otraPersona.nombre;
        this.apellido = otraPersona.apellido;
        this.fechaNac = otraPersona.fechaNac;
        this.genero = otraPersona.genero;
        this.vehiculo = new Vehiculo(otraPersona.vehiculo);
    }

    // Crear Persona
    public void crearPersona(String docN, String nombreN, String apellidoN, String fechaNacN, char generoN, Vehiculo vehiculo) {
        this.docId = docN;
        this.nombre = nombreN;
        this.apellido = apellidoN;
        this.fechaNac = fechaNacN;
        this.genero = generoN;
        this.vehiculo = vehiculo;
    }

    // Getters y Setters
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("==========================================");
        System.out.println("Documento ID: " + docId);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNac + " | Género: " + genero);
        System.out.println("--- Datos del Vehículo Asociado ---");
        vehiculo.mostrarInformacion();
        System.out.println("==========================================");
    }
}
