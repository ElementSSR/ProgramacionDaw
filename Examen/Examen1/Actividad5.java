import java.util.Scanner;

public class Actividad5 {
    class NumeroNegativoException extends Exception {
        public NumeroNegativoException(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creaamos las variables
        int num;
            try {
            do {
                System.out.println("Introduce un número (0 para salir):");
                num = Integer.parseInt(sc.next());

                // Si es negativo, lanzamos nuestra propia excepción
                if (num < 0) {
                    throw new NumeroNegativoException("El programa ha finalizado porque has introducido un número negativo.");
                }

                if (num > 0) {
                    System.out.println("Número positivo detectado: " + num);
                }

            } while (num != 0);

            System.out.println("Programa finalizado correctamente por el usuario (introdujo 0).");

            } catch (NumeroNegativoException e) {
                // Atendemos la excepción mostrando el mensaje indicado
                System.out.println(e.getMessage());
            } finally {
                sc.close();
            }
    }   
}
