package ActividadesClase;

import java.util.Scanner;

public class Actividad1 {
    public static void Buscar(int valorBuscar) {
        int[] valor1 = {5, 4, 3, 2, 1, 0};
        boolean encontrado = false;
        for (int i = 0; i < valor1.length; i++) {
            if (valor1[i] == valorBuscar) {
                System.out.println("El valor " + valorBuscar + " se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El valor " + valorBuscar + " no se encuentra en el arreglo.");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor que busca: ");
        int valorBuscar = sc.nextInt();
        sc.close();
        Buscar(valorBuscar);
    }
}