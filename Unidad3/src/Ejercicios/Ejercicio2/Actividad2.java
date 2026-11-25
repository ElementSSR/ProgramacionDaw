package Ejercicios.Ejercicio2;

public class Actividad2 {
    public static void main(String[] args) {
        // Creamos racionales usando constructor y los métodos asignaNumerador / asignaDenominador
        Racional r1 = new Racional();
        r1.asignaNumerador(1);
        r1.asignaDenominador(2);

        Racional r2 = new Racional(3, 4);

        System.out.print("Racional 1: ");
        r1.imprimirRacional();
        System.out.print("Racional 2: ");
        r2.imprimirRacional();

        // Operaciones aritméticas
        Racional resultadoSuma = r1.suma(r2);
        System.out.println(" ");
        System.out.print("Suma: ");
        resultadoSuma.imprimirRacional();

        Racional resultadoResta = r1.resta(r2);
        System.out.print("Resta: ");
        resultadoResta.imprimirRacional();

        Racional resultadoProducto = r1.producto(r2);
        System.out.print("Producto: ");
        resultadoProducto.imprimirRacional();

        Racional resultadoDivision = r1.division(r2);
        System.out.print("División: ");
        resultadoDivision.imprimirRacional();

        // Comprobación de igualdad
        Racional r3 = new Racional(2, 4);
        System.out.println(" ");
        System.out.println("¿Es 1/2 igual a 3/4?: " + r1.esIgual(r2));
        System.out.println("¿Es 1/2 igual a 2/4?: " + r1.esIgual(r3));
    }
}
