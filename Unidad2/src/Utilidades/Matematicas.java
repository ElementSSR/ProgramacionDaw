package Utilidades;
public class Matematicas {
        public static int sumar(int a, int b) {
            return a + b;
        }
        public static int restar(int a, int b) {
            return a - b;
        }
        public static int multiplicar(int a, int b) {
            return a * b;
        }
        public static int dividir(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede dividir entre cero");
            }
            return a / b;
        }
        public static int resto(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede calcular el resto de una división entre cero");
            }
            return a % b;
        }
        public static double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }
        public static double raizCuadrada(double numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
            }
            return Math.sqrt(numero);
        }
        public static double media(double a, double b) {
            return (a + b) / 2;
        }
        public static int aleatorio(int min, int max) {
            return (int) (Math.random() * (max - min + 1) + min);
        }
}
