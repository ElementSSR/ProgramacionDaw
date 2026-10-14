import java.util.Scanner;

import Utilidades.Matematicas;

public class App{
    public static void main(String[] args) {
        //Clase 1

        //double edad;
        //edad=400000000;
        //boolen logico=(7<5);
        //String caracter= "Domingo";
        //
        //System.out.println("Hola Mundo!");
        //System.out.println(edad);
        //System.out.println(logico);
        //System.out.println("HOLA MUNDO" +edad+ "," +logico);
        //int[]b={4,0,-1};
        //System.out.println(b[0] + ", " + b[1] + ", " + b[2]);


        //Clase 2   
        //Scanner sc = new Scanner(System.in);
        //int numero;
        //System.out.println("Introduce un numero entre 5 y 25:");
        //numero = Integer.parseInt(sc.nextLine());
        //System.out.println("Introduce un nombre:");
        //String nombre = sc.nextLine();
        //sc.nextLine(); // Limpiar el buffer del scanner
        //System.out.println("El numero introducido es: " + numero + " y tu nombre es: " + nombre);
        //System.out.println("Introduce tu apellido:");
        //String apellido = sc.nextLine();
        //System.out.println("Tu apellido es:"+ apellido);
        
        


        //LocalDateTime hoy = LocalDateTime.now();
        //System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
        //System.out.println("El día es: " + hoy.getDayOfMonth());
        //System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
        //System.out.println("El año es: " + hoy.getYear());
        //System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        //int max = 15;
        //int min = 1;
        //double aleatorio = (int) (Math.random() * (max - min + 1) + min);
        //System.out.println(aleatorio);

        //Clase 3
        //int x = Matematicas.sumar(5, 3);
        //int y = Matematicas.multiplicar(4, 2);

        //System.out.println("La suma es: " + x);
        //System.out.println("La multiplicación es: " + y);


        //System.out.println("El resto de la división 5/2 es: " + (5 % 2));
        //int variable = Matematicas.aleatorio(1, 10);
        //System.out.println("La variable es: " + variable);
        //variable++;
        //System.out.println("La variable es: " + variable);
        
        //int num1=Matematicas.aleatorio(1, 10);
        //int num2=Matematicas.aleatorio(1, 10);

        //System.out.println("El primer numero es: " + num1);
        //System.out.println("El segundo numero es: " + num2);
        //if(num1>num2){
        //    System.out.println(num1+ " es mayor que " + num2);
        //}
        //else{
        //    System.out.println(num2+ " es mayor que " + num1);
        //}

        //int resultado = (num1>num2) ? (num1-num2) : (num1+num2);
        //System.out.println("El resultado es: " + resultado);
        //System.out.println("SEGUIMOS...");

        //int dia;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Introduce un numero del 1 al 7:");
        //dia = sc.nextInt();
        //sc.close();
        //if(dia==1){
        //    System.out.println("Lunes");
        //}else if(dia==2){
        //    System.out.println("Martes");
        //}else if(dia==3){
        //    System.out.println("Miercoles");
        //}else if(dia==4){
        //    System.out.println("Jueves");  
        //}else if(dia==5){
        //    System.out.println("Viernes");
        //}else if(dia==6){
        //    System.out.println("Sabado");
        //}else if(dia==7){
        //    System.out.println("Domingo");
        //}else{
        //    System.out.println("El numero introducido no es valido");
        //}

        //Clase 5
        //int resto = 0;
        //for (int i=1; i<=4; i++){
        //    if (resto != 0){
        //        for (int j=i; j<=4; j++){
        //            resto = j % 2;
        //        }
        //    }
        //    System.out.println();
        //}
        Fallos.error5();
    }

    public static void Actividad1(){
    }
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public class Fallos{
        
        public static void error1(){
            // Ejemplo 1: Error de índice fuera de rango
            int[] numeros = {10, 20, 30, 40, 50};
            System.out.println("Elemento en posición 2: " + numeros[2]);
            System.out.println("Elemento en posición 5: " + numeros[5]); // Error intencional
        }
        
        public static void error2(){
            // Ejemplo 2: NullPointerException
            String texto = null;
            System.out.println("Longitud del texto: " + texto.length()); // Error intencional
        }
        
        public static void error3(){
            // Ejemplo 3: Error lógico - debería imprimir solo números pares
            System.out.println("Números pares del 1 al 10:");
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) { // Error intencional: debería ser == 0
                    System.out.println(i);
                }
            }
        }
        
        public static void error4(){
            // Ejemplo 4: Error en cálculo de promedio
            int[] calificaciones = {85, 90, 78, 92, 88};
            int suma = 0;
            for (int i = 0; i <= calificaciones.length; i++) { // Error intencional: debería ser <
                suma += calificaciones[i];
            }
            double promedio = suma / calificaciones.length;
            System.out.println("Promedio: " + promedio);
        }

        public static void error5(){
            // Ejemplo 5: Bucle infinito intencional
            int contador = 0;
            while (contador < 5) {
            System.out.println("Contador: " + contador);
            // Falta incrementar el contador - error intencional
            }
        }   
    }
}