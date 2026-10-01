import java.util.Scanner;

public class Actividades{
    public static void main(String[] args) {
        //Actividad 1
        //Conseguimos los numeros aleatorios
        int max = 10;
        int min = 1;
        double ale1 = (int) (Math.random() * (max - min + 1) + min);
        double ale2 = (int) (Math.random() * (max - min + 1) + min);
        //Realizamos las operaciones
        System.out.println("Los numeros aleatorios son: " + ale1 + " y " + ale2);
        System.out.println("La division es: " + (ale1 / ale2));
        System.out.println("La media es: " + ((ale1 + ale2) / 2));
        System.out.println("La potencia es: " + Math.pow(ale1, ale2));
        System.out.println("La raiz cuadrada del primer numero es: " + Math.sqrt(ale1));
        System.out.println("La raiz cuadrada del segundo numero es: " + Math.sqrt(ale2));

        //Actividad 2
        //Tenemos que ver si un  numero introducido es divisible por 2 y por 3
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        num = sc.nextInt();
        sc.close();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El numero es divisible por 2 y por 3");
        }else if (num % 2 == 0){
            System.out.println("El numero es divisible por 2");
        }else if (num % 3 == 0){
            System.out.println("El numero es divisible por 3");
        }else{
            System.out.println("El numero no es divisible por 2 y por 3");
        }
    }
}