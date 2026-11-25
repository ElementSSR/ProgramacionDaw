public class Diapositiva3 {
    public static void Actividad1(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            System.out.println("____________________");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j));
                System.out.println();
            }
            System.out.println("____________________");
        }
    }
    //Actividad 2
    public static void Actividad2(double radio, double altura){
        double PI = Math.PI;

        double area = 2 * PI * (altura + radio);
        double volumen = PI * ( 2* radio ) * altura;

        System.out.println("Area del cilindro: "+area);
        System.out.println("Volumen del cilindro: "+volumen);
    }
    //Actividad 3
    public static boolean esPar(int num){ 
        return num % 2 == 0;
    }
    public static boolean div3 (int num){
        return num % 3 == 0;
    }
    public static void Actividad3(){
        for (int i = 1; i <= 20; i++){
            if(esPar(i)&&div3(i)){
                System.out.println(i + " es divisible entre 2 y 3");
            }
        }
    }
    public static void main(String[] args) {
        Actividad2(5,10);
    }
}
