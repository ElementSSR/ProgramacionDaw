package Entregas;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Tareas1 {
    
    // Ejercicio 1
    public static void ejercicio1() {
    LocalDateTime hoy = LocalDateTime.now();
        if (hoy.getHour() >= 6 && hoy.getHour() <= 12) {
            System.out.println("Buenos días");
        } else if (hoy.getHour() >= 13 && hoy.getHour() < 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
    //Ejercicio 2
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
        int horas = sc.nextInt();
        sc.close();
        if (horas <= 40) {
            System.out.println("El sueldo semanal que le corresponde es de " + (horas * 12) + " euros");
        } else {
            System.out.println("El sueldo semanal que le corresponde es de " + ((40 * 12) + ((horas - 40) * 16)) + " euros");
        }
    }
    //Ejercicio 3 
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento (1-31):");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento (1-12):");
        int mes = sc.nextInt();
        sc.close();
            if(dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
                System.out.println("Tu signo es Aries");
            } else if(dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
                System.out.println("Tu signo es Tauro");
            } else if(dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
                System.out.println("Tu signo es Géminis");
            } else if(dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
                System.out.println("Tu signo es Cáncer");
            } else if(dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
                System.out.println("Tu signo es Leo");
            } else if(dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
                System.out.println("Tu signo es Virgo");
            } else if(dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
                System.out.println("Tu signo es Libra");
            } else if(dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
                System.out.println("Tu signo es Escorpio");
            } else if(dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
                System.out.println("Tu signo es Sagitario");
            } else if(dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
                System.out.println("Tu signo es Capricornio");
            } else if(dia >= 20 && mes == 1 || dia <=18 && mes ==2) {
                System.out.println("Tu signo es Acuario");
            } else if(dia >=19 && mes==2 || dia<=20 && mes==3){
                System.out.println("Tu signo es Piscis");
            } else{
                System.out.println("Los datos introducidos no son correctos");
            }

    }
    //Ejercicio 4
    public static void ejercicio4() {
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota:");
        double nota2 = sc.nextDouble();
        media = ((nota1 + nota2) / 2.0);
        if (media >=5){
            System.out.println("El alumno ha aprobado con una media de " + media);
        } else if (media < 5){
            System.out.println("Cual ha sido el resultado de la recuperación? (Apto=1/No Apto=0)");
            int resultado = sc.nextInt();
            if (resultado == 1){
                System.out.println("El alumno ha aprobado con una media de 5");
            }else if (resultado == 0){
                System.out.println("El alumno ha suspendido con una media de " + media);
            }else{
                System.out.println("Algo ha fallado");
            }
        } else {
            System.out.println("Algo ha fallado");
        }
        sc.close();
    }
    //Ejercicio 5
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce que dia quieres del (1 al 5), elije 6 si quieres ver todo el horario y 7 si quieres salir:"); 
        int dia = sc.nextInt();
        sc.close();
        switch (dia){
            case 1:
                System.out.println("Lunes:");
                System.out.println("---------");
                System.out.println("Entorno de Desarrollo");
                System.out.println("Lenguaje de Marcas");
                System.out.println("Base de Datos");
                System.out.println("Sistemas Informáticos");
                System.out.println("Sistemas Inofrmáticos");
                System.out.println("Programación");
                break;
            case 2:
                System.out.println("Martes:");
                System.out.println("---------");
                System.out.println("Sistemas Informáticos");
                System.out.println("Digitalización");
                System.out.println("IPPE");
                System.out.println("Sostenibilidad");
                System.out.println("Progrmación");
                System.out.println("Programación");
                break;
            case 3:
                System.out.println("Miercoles:");
                System.out.println("---------");
                System.out.println("Programación");
                System.out.println("Programación");
                System.out.println("IPPE");
                System.out.println("Base de Datos");
                System.out.println("Base de Datos");
                System.out.println("Programación");
                break;
            case 4:
                System.out.println("Jueves:");
                System.out.println("---------");
                System.out.println("Lenguaje de Marcas");
                System.out.println("Lenguaje de Marcas");
                System.out.println("Base de Datos");
                System.out.println("Base de Datos");
                System.out.println("Programación");
                System.out.println("Programación");
                break;
            case 5:
                System.out.println("Viernes:");
                System.out.println("---------");
                System.out.println("Sistemas Informáticos");
                System.out.println("Sistemas Informáticos");
                System.out.println("Base de Datos");
                System.out.println("Entornos de Desarrollo");
                System.out.println("Entornos de Desarrollo");
                System.out.println("IPPE");
                break;
            case 6:
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("|Lunes:                |Martes:               |Miercoles:          |Jueves:              |Viernes:              |");
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("|Entorno de Desarrollo |Sistemas Informáticos |Programación        |Lenguaje de Marcas   |Sistemas Informáticos |");
                System.out.println("|Lenguaje de Marcas    |Digitalización        |Programación        |Lenguaje de Marcas   |Sistemas Informáticos |");
                System.out.println("|Base de Datos         |IPPE                  |IPPE                |Base de Datos        |Base de Datos         |");
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("|                                               Descanso                                                        |");
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("|Sistemas Informáticos |Sostenibilidad        |Base de Datos       |Base de Datos        |Entornos de Desarrollo|");
                System.out.println("|Sistemas Inofrmáticos |Programación          |Base de Datos       |Programación         |Entornos de Desarrollo|");
                System.out.println("|Programación          |Programación          |Programación        |Programación         |IPPE                  |");
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("El numero introducido no es valido");
        }
    }
    //Ejercicio 6
    public static void ejercicio6() {
        int sueldo = 0;
        int retencion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu cargo de empleado (1- Prog.Junior, 2- Prog.Senior, 3- Jefe de Proyecto):");
        int cargo = sc.nextInt();
        System.out.println("Introduce cuantos dias has estado de viaje visitando clientes:");
        int dias = sc.nextInt();
        System.out.println("Introduce si eres 1-Soltero o 2-Casado:");
        int estado = sc.nextInt();
        sc.close();
        if (cargo == 1) {
            sueldo = 950;
        }else if(cargo == 2) {
            sueldo = 1200;
        }else if(cargo == 3) {
            sueldo = 1600;
        }else{
            System.out.println("El cargo introducido no es valido");
        }
        int dietas = dias * 30;
        int bruto = sueldo + dietas;
        if (estado == 1){
            retencion = bruto * 25 / 100;
        }else if(estado == 2){
            retencion = bruto * 20 / 100;
        }else{
            System.out.println("El estado civil introducido no es valido");
        }
        System.out.println("-------------------------------");
        System.out.println("|Sueldo base: " + sueldo + " euros");
        System.out.println("|Dietas: " + dietas + " euros");
        System.out.println("-------------------------------");
        System.out.println("|Sueldo bruto: " + bruto + " euros");
        System.out.println("|Retención (IRPF): " + retencion + " euros");
        System.out.println("-------------------------------");
        System.out.println("|Sueldo neto: " + (bruto - retencion) + " euros");
    }
    //Ejercicio 7
    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        int num = 1, contplus = 0,contmin = 0, sieteplus = 0, sietemin = 0;
        while (num != 0){
            System.out.println("Introduce un numero:");
            num = sc.nextInt();
            if (num < 0){
                contmin++;
            }else if(num > 0){
                contplus++;
            }
            if (num == 7){
                sieteplus++;
            }else if(num == -7){
                sietemin++;
            }
        }
        sc.close();
        System.out.println("Has introducido " +contplus+ " numeros positivos");
        System.out.println("Has introducido " +contmin+ " numeros negativos");
        System.out.println("Has introducido " +sieteplus+ " veces el 7");
        System.out.println("Has introducido " +sietemin+ " veces el -7");
    }
    //Ejercicio 8
    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros de fibonacci quieres ver?");
        int cant = sc.nextInt();
        
        int num1 = 0, num2 = 1; 
        
        System.out.print(num1+", "+num2);

        for (int i = 1; i < cant; i++){
            int num3 = num1 + num2;
            System.out.print(", "+num3);

            num1 = num2;
            num2 = num3;
        }
        sc.close();
    }
    //Ejercicio 9
    public static void ejercicio9(){
        for (int n = 1; n <= 100; n++) {
            boolean primo = true;
            if (n <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(n);
            }
        }
    }
    //Ejercicio 10
    public static void ejercicio10(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();

        int pares = 0;
        int impares = 0;

        while (numero > 0){
            int num = numero % 10;

            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
            numero = numero / 10;
        }
        System.out.println("Hay " +pares+ " digitos pares y " +impares+ " digitos impares.");
        sc.close();
    }
    public static void main(String[] args) {
        ejercicio8();
    }
}