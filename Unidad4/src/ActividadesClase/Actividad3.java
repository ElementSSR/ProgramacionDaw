package ActividadesClase;

public class Actividad3 {
    static int[][] a={
        {2, 0, 1},
        {3, 0, 0},
        {5, 1, 1},
    };
    static int[][] b={
        {1, 0, 1},
        {1, 2, 1},
        {1, 1, 0},
    };
    public static void main(String[] args) {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
