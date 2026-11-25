package Actividades.Actividad1;

public class Actividad1 {
    public static void main(String[] args) {
        // Creamos el objeto Persona
        // Hecho con IA ya que no me funcionaba y viendo el codigo no se parece a nada de lo que me acuerde que hayamos dado en clase, pero bueno, funciona y es lo que importa
        Persona persona1 = new Persona(
            "Spas Rusekov",
            "12345678Z",
            "01/07/2004",
            "Calle Calle 1",
            "Masculino",
            "Soltero"
        );

        // Creamos la CuentaCorriente asociando a esa Persona
        CuentaCorriente cuenta1 = new CuentaCorriente(persona1, "ES91 1111 1111 1111 1111 1111", 1532.58);

        // Mostramos la información inicial
        System.out.println("ESTADO INICIAL:");
        cuenta1.mostrarInformacion();

        // Modificamos atributos usando los métodos set
        persona1.setDireccion("Avenida de la Libertad 45");
        persona1.setEstadoCivil("Casado");
        cuenta1.setSaldo(2350.75);

        // Volvemos a mostrar para verificar los cambios
        System.out.println("\nESTADO TRAS MODIFICACIONES:");
        cuenta1.mostrarInformacion();
    }
}
