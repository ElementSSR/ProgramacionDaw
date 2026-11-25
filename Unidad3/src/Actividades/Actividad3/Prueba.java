package Actividades.Actividad3;

public class Prueba {
    public static void main(String[] args) {
        // Creamos una persona por defecto
        Persona persona1 = new Persona();
        System.out.println("PERSONA 1 (Por defecto):");
        persona1.mostrarInformacion();

        // Modificamos sus atributos
        Vehiculo coche1 = new Vehiculo();
        coche1.crearVehiculo("Toyota", "Corolla", 2022, "1234LBC", "Blanco", 20000);
        
        persona1.crearPersona("44556677K", "Lucía", "Fernández", "10/04/1996", 'F', coche1);
        System.out.println(" ");
        System.out.println("PERSONA 1 (Tras modificar atributos):");
        persona1.mostrarInformacion();

        // Creamos otra persona con parámetros
        Vehiculo coche2 = new Vehiculo("Seat", "Ibiza", 2020, "9876KLM", "Rojo", 15000);
        Persona persona2 = new Persona("77889900M", "Javier", "Navarro", "22/09/1994", 'M', coche2);
        
        System.out.println(" ");
        System.out.println("PERSONA 2 (Con parámetros):");
        persona2.mostrarInformacion();

        // Modificamos sus atributos
        persona2.setApellido("Navarro Gil");
        persona2.getVehiculo().cambiarValor(13500);
        persona2.getVehiculo().setColor("Gris");

        System.out.println(" ");
        System.out.println("\nPERSONA 2 (Tras modificar atributos):");
        persona2.mostrarInformacion();
    }
}
