import java.util.Scanner;
import Utilidades.Matematicas;

public class Diapositiva2 {
    //Diapositiva Actividad 1
    public static void Actividad1(){
        int min = 50, max = 200;
        for (min = 50; min <= max; min++) {
            if (min % 2 == 0) {
                if (min % 3 == 0) {
                    System.out.println(min + " es divisible entre 2 y 3");
                }
            }
        }
    }
    //Diapositiva Actividad 2
    public static void Actividad2(){
        int num2;
        int resultado = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        num2 = Integer.parseInt(sc.next());
        sc.close();
        for (int i = num2; i >= 1; i--){
        resultado *= i;
        }
        System.out.println("El factorial de " + num2 + " es: " + resultado);
    }
    //Diapositiva Actividad 3 y 4
    public static void Actividad3y4(){
        int numeros, min=0, max=0;
        int suma = 0, media = 0, cantidad = 0, mayores = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las edades:");
        numeros = Integer.parseInt(sc.next());
        while (numeros != -1) {
        numeros = Integer.parseInt(sc.next());
        cantidad++;
        suma += numeros;
        media = suma / cantidad;
        if (numeros >= 18) {
        mayores++;
        }
        if ((min > numeros) && (numeros != -1)) {
        min = numeros;
        }
        if (max < numeros) {
        max = numeros;
        }

        }
        System.out.println("La edad minima es: " + min);
        System.out.println("La edad maxima es: " + max);
        System.out.println("La suma de las edades es: " + suma);
        System.out.println("La media de las edades es: " + media);
        System.out.println("La cantidad de personas introducidas es: " + cantidad);
        System.out.println("La cantidad de personas mayores de edad es: " + mayores);
        sc.close();
    }
    //Diapositiva Actividad 5
    public static void Actividad5(){
        int sol, min=1, max=100;
        int aleatorio = Matematicas.aleatorio(min, max);
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 y 100:");
        sol = Integer.parseInt(sc.next());
        sc.close();
        if (sol < aleatorio){
        System.out.println("El numero es mayor");
        }
        else if (sol > aleatorio){
        System.out.println("El numero es menor");
        }
        }while(sol != aleatorio);
        System.out.println("¡Correcto! El numero era: " + aleatorio);
       
    }
    //Diapositiva Actividad 6
    public static void Actividad6(){
        int num1, num2, resultado, opcion;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Introduce 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir y -1 para salir:");
        opcion = Integer.parseInt(sc.next());
        if (opcion != -1){
        System.out.println("Introduce el primer numero:");
        num1 = Integer.parseInt(sc.next());
        System.out.println("Introduce el segundo numero:");
        num2 = Integer.parseInt(sc.next());
        switch(opcion){
        case 1:
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
        break;
        case 2:
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        break;
        case 3:
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
        break;
        case 4:
        if (num2 != 0){
        resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
        }
        else{
        System.out.println("No se puede dividir entre 0");
        }
        break;
        default:
        System.out.println("Opcion no valida");
        }
        }
        }while(opcion != -1);
        sc.close();
    }
    //Diapositiva Actividad 7.1
    public static void Actividad7_1(){
        int num1, num2, resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        num1 = Integer.parseInt(sc.next());
        System.out.println("Introduce el segundo numero:");
        num2 = Integer.parseInt(sc.next());
        while (num2 != 0){
        resto = num1 % num2;
        num1 = num2;
        num2 = resto;
        }
        System.out.println("El MCD es: " + num1);
        sc.close();
    }
    //Diapositiva Actividad 7.2
    public static void Actividad7_2(){
        Scanner sc = new Scanner(System.in);
        int num3, num4, mcm, mayor=0;
        System.out.println("Introduce el primer numero:");
        num3 = Integer.parseInt(sc.next());
        System.out.println("Introduce el segundo numero:");
        num4 = Integer.parseInt(sc.next());
        if (num3 > num4){
        mayor = num3;
        }else if (num4 > num3){
        mayor = num4;
        }
        mcm = mayor;
        while (mcm % num3 != 0 || mcm % num4 != 0){
        mcm += mayor;
        }
        System.out.println("El MCM es: " + mcm);
        sc.close();
    }
    public static void main(String[] args) {
        Actividad7_2();
    }
}