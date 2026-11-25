package ActividadesClase;

import java.util.Scanner;

public class Actividad2 {
    static String[][] horario={
        {"Entorno de Desarrollo", "Sistema Informaticos", "Programacion", "Lenguaje de Marcas", "Sistemas Informaticos"},
        {"Lenguaje de Marcas","Digitalizacion","Programacion","Lenguaje de Marcas","Sistemas Informaticos"},
        {"Base de Datos","IPPE","IPPE","Base de Datos","Base de Datos"},
        {"Sistemas Informaticos","Sostenibilidad","Base de Datos","Base de Datos","Entorno de Desarrollo"},
        {"Sistemas Informaticos","Programacion","Base de Datos","Programacion","Entorno de Desarrollo"},
        {"Programacion","Programacion","Programacion","Programacion","IPPE"}
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese la hora: ");
        int hora = sc.nextInt();
        System.out.println("Ese dia y hora tienes: "+horario[hora][dia]);
        sc.close();
    }
}
