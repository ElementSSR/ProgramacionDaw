import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        //empezamos creando las variables
        int positivo=0, negativo=0, num, conttotal=0, sumimp=0, mayor=0, menor=0;
        Scanner sc = new Scanner(System.in);
        do{
            //pedimos por los numero
            System.out.println("Introduce numeros positivos y negativos");
            num = Integer.parseInt(sc.next());
            //sumo a la cantidad total de numeros
            conttotal++;
            //miro si son negativos o positivos y los sumo
            if(num>0){
                positivo++;
                if (num>mayor){
                    mayor = num;
                }
            }else if (num<0){
                negativo++;
            }
            if (num%2 != 0){
                sumimp+=num;
            }
            if (num<menor){
                menor = num;
            }


        }while(num!=0);
        //Ponemos los datos
        System.out.println("Se han introducido "+conttotal+" numeros");
        System.out.println("La suma de los impares es "+sumimp);
        System.out.println("El mayor numero de la pares es "+mayor);
        System.out.println("El menor de los numero negativos es "+menor);
    }
}
