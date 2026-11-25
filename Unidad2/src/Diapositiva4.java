import java.util.Scanner;

public class Diapositiva4 {
    //Actividad 1
    public static int Actividad1(int numero) {
        numero = Math.abs(numero);
        if (numero < 10) {
            return 1;
        } else {
            return 1 + Actividad1(numero / 10);
        }
    }

    // Actividad 2
    public static void Actividad2(int num) {
        // Método recursivo
        System.out.println("Suma recursiva: " + sumaRecursiva(num));

        // Método iterativo
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += i;
        }

        System.out.println("Suma iterativa: " + suma);
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumaRecursiva(n - 1);
    }

    //Actividad 3
    public static void Actividad3(int num1, int num2){
        System.out.println("La respuesta es "+potencia(num1, num2));
    }
    
    public static int potencia(int a, int b) {
    if (b == 0) {
        return 1;
    }
    else {
        return a * potencia(a, b - 1);
    }
    }
    //Actividad 4
    public static void Actividad4(){
        
    }

    public static void main(String[] args) {
        // Actividad 1
        // Scanner sc = new Scanner(System.in);
        // int resultado = Actividad1(2354);
        // System.out.println("El numero tiene " +resultado+ " digitos.");
        // sc.close();

        // Actividad 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Escribe un numero:");
        // int respuesta = sc.nextInt();
        // Actividad2(respuesta);
        // sc.close();
        
        //Actividad 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Escribe primero el numero que quieres potenciar:");
        // int num1 = sc.nextInt();
        // System.out.println("Escribe cuantas veces quieres potenciarlo:");
        // int num2 = sc.nextInt();
        // Actividad3(num1,num2);
        // sc.close();

        //Actividad 4
    }
}
