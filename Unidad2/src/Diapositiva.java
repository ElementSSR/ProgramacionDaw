import java.util.Scanner;

public class Diapositiva {  
    //Diapositiva Actividad 1
    public static void Actividad1(){
        int numero1, numero2, numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero:");
        numero3 = sc.nextInt();
        sc.close();
        double resultado= ((numero2*numero2)-4*numero1*numero3);
        if (resultado<0){
            System.out.println("No hay resultado");
        }else if(resultado==0){
            double respuesta1 = (-numero2)/(2*numero1);
            System.out.println("La unica solución es: " + respuesta1);
        }else{
            double resultado2 = (-numero2 + Math.sqrt(resultado))/2*numero1;
            double resultado3 = (-numero2 - Math.sqrt(resultado))/2*numero1;
            System.out.println("La primera solución es: " + resultado2);
            System.out.println("La segunda solución es: " + resultado3);
        }
    }
    //Diapositiva Actividad 2.1
    public static void Actividad2_1(){
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno:");
        nota = Integer.parseInt(sc.next());
        sc.close();
        if (nota < 5){
           System.out.println("El alumno ha suspendido");
        }else if (nota < 7){
           System.out.println("El alumno ha aprobado");
        }else if (nota < 9){
           System.out.println("El alumno ha sacado un notable");
        }else if (nota <= 10){
           System.out.println("El alumno ha sacado un sobresaliente");
        }else{
           System.out.println("La nota introducida no es válida");
        }
    }
    //Diapositiva Actividad 2.2
    public static void Actividad2_2(){
        int nota2;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno:");
        nota2 = Integer.parseInt(sc2.next());
        sc2.close();
        switch (nota2){
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
               System.out.println("El alumno ha suspendido");
               break;
           case 5:
           case 6:
               System.out.println("El alumno ha aprobado");
               break;
           case 7:
           case 8:
               System.out.println("El alumno ha sacado un notable");
               break;
           case 9:
           case 10:
               System.out.println("El alumno ha sacado un sobresaliente");
               break;
           default:
               System.out.println("La nota introducida no es válida");
        }
        sc2.close();
    }
    //Diapositiva Actividad 3
    public static void Actividad3(){
        int dia;
        int mes;
        int anio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia:");
        dia = sc.nextInt();
        System.out.println("Introduce un mes:");
        mes = sc.nextInt();
        System.out.println("Introduce un año:");
        anio = sc.nextInt();
        sc.close();
        if ((dia >=1 && dia <=31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            System.out.println("La fecha es correcta");
        }else if ((dia >=1 && dia <=30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            System.out.println("La fecha es correcta");
        }else if ((dia ==29) && (mes == 2) && ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))){
            System.out.println("La fecha es correcta");
        }else if((dia >=1 && dia <=28) && (mes == 2)){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha no es correcta");
        }
    }
    
    public static void main(String[] args) {
        Actividad3();        
    } 
}
