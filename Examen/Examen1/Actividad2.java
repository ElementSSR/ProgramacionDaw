import java.util.Scanner;

public class Actividad2 {
    //Creamos la eleccion de piedra, papel o tijera de la maquina
    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        //Creamos las variables
        int victorias=0, respuesta, respuestamaq;
        Scanner sc = new Scanner(System.in);
        //empezamos creando el juego
        do {
            System.out.println("Piedra (1), Papel(2), Tijera(3), Fin(-1)");
            respuesta = Integer.parseInt(sc.next());
            respuestamaq = aleatorio(1,3);
            if(respuesta == respuestamaq){
                //Creamos el empate
                System.out.println("Empate");
            }else if(respuesta == 1){
                //Creaamos las respuesta a piedra
                if (respuestamaq == 2){
                    System.out.println("Gana el ordenador");
                    victorias++;
                }else if(respuestamaq == 3){
                    System.out.println("Ganas tu");
                }
            }else if(respuesta == 2){
                //creamos las respuestas a papel
                if (respuestamaq == 3){
                    System.out.println("Gana el ordenador");
                    victorias++;
                }else if(respuestamaq == 1){
                    System.out.println("Ganas tu");
                }
            }else if(respuesta == 3){
                //creamos las respuestas a tijera
                if (respuestamaq == 1){
                    System.out.println("Gana el ordenador");
                    victorias++;
                }else if(respuestamaq == 2){
                    System.out.println("Ganas tu");
                }
            }else if (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != -1){
                System.out.println("El parametro introducido no es correcto");
            }
        } while (victorias < 5 && respuesta != -1);
        System.out.println("Fin");
        sc.close();
    }
}
