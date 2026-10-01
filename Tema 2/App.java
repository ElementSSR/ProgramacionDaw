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

        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7:");
        dia = sc.nextInt();
        sc.close();
        if(dia==1){
            System.out.println("Lunes");
        }else if(dia==2){
            System.out.println("Martes");
        }else if(dia==3){
            System.out.println("Miercoles");
        }else if(dia==4){
            System.out.println("Jueves");  
        }else if(dia==5){
            System.out.println("Viernes");
        }else if(dia==6){
            System.out.println("Sabado");
        }else if(dia==7){
            System.out.println("Domingo");
        }else{
            System.out.println("El numero introducido no es valido");
        }
    }
}