import java.util.Scanner;

public class Actividad4 {
    public static void imprimeTablero(boolean valor){
        if(valor == true){
            System.out.println("| | | | | | | |");
            System.out.println("| | | | | | | |");
            System.out.println("| | |x| | | | |");
            System.out.println("| | |o|x| | | |");
            System.out.println("| |x|o|o| | | |");
            System.out.println("|x|o|x|o|x| | |");
            System.out.println("---------------");
            System.out.println(" 0 1 2 3 4 5 6");
        }else if(valor == false){
            System.out.println("|x|o|x|");
            System.out.println("-------");
            System.out.println("| |o| |");
            System.out.println("-------");
            System.out.println("| |x| |");
            System.out.println("-------");
            System.out.println(" 0 1 2 ");
        }
    }
    public static void main(String[] args) {
        imprimeTablero(false);
    }
}
