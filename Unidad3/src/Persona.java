public class Persona {

    String Nombre;
    int Edad;
    double Estatura;
    final String DNI = "11111111A";

    public Persona(String Nombre, int Edad, Double Estatura){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estatura = Estatura;
    }

    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void saludar(){
        System.out.println("Hola a todos, soy "+Nombre+ ", tengo "+Edad+" y mido "+Estatura);
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public int setEdad(){
        return this.Edad;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Spas", 22, 1.80);
        persona1.saludar();
        
    }
}
