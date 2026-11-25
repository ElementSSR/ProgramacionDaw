package Actividades.Actividad2;

public class Prueba {
    public static void main(String[] args) {
        // Creamos con el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("PERSONA 1 (Por defecto):");
        persona1.mostrarInformacion();

        // Modificamos sus atributos
        persona1.setCedula("11223344A");
        persona1.setNombre("Carlos");
        persona1.setApellido("Ruiz");
        persona1.setGenero('M');
        persona1.setFechaNacimiento(new Fecha(12, 8, 1995));
        persona1.setCiudadNacimiento(new Ciudad(41001, "Sevilla", 34));
        persona1.setCiudadResidencia(new Ciudad(28001, "Madrid", 34));
        
        System.out.println(" ");
        System.out.println("PERSONA 1 (Tras modificar datos):");
        persona1.mostrarInformacion();

        // Creamos con el constructor con parámetros
        Fecha fechaNac2 = new Fecha(24, 3, 1999);
        Ciudad ciudadNac2 = new Ciudad(8001, "Barcelona", 34);
        Ciudad ciudadRes2 = new Ciudad(46001, "Valencia", 34);

        Persona persona2 = new Persona("99887766B", "Elena", "Méndez", 'F', fechaNac2, ciudadNac2, ciudadRes2);
        System.out.println(" ");
        System.out.println("PERSONA 2 (Con parámetros):");
        persona2.mostrarInformacion();

        // Modificamos sus atributos
        persona2.setApellido("Méndez Soto");
        persona2.getCiudadResidencia().setNombre("Málaga");
        persona2.getCiudadResidencia().setCodigo(29001);

        System.out.println(" ");
        System.out.println("PERSONA 2 (Tras modificar datos):");
        persona2.mostrarInformacion();
    }
}
