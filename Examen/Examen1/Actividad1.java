import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos las variables para poder asignar los numeros a cada una
        int numper, dia, precio, parejas = 0, preciopar;
        int respuesta;
        int tarjetasi = 10, tarjetano = 0;
        // Empezamos a preguntar por los detalles
        System.out.println("Cuantas personas van a ir?");
        numper = Integer.parseInt(sc.next());
        System.out.println("Que dia van a ir? (1-7)");
        dia = Integer.parseInt(sc.next());
        // preguntar por pareja solo si es jueves
        if (dia == 4) {
            System.out.println("Cuantas parejas vais?");
            parejas = Integer.parseInt(sc.next());
        }
        System.out.println("Tienes tarjeta CineCampa? (0=False,1=True)");
        respuesta = Integer.parseInt(sc.nextLine());
        sc.close();
        // todos los dias excepto miercoles y jueves
        if (dia != 3 || dia != 4) {
            precio = 8;
            if (respuesta == 1) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Individuales" + numper);
                System.out.println("Precio por entrada individual " + precio + " euros");
                System.out.println("Total " + precio * numper);
                System.out.println("Descuento " + ((precio * 100) / tarjetasi));
                System.out.println("A pagar " + (precio - ((precio * 100) / tarjetasi)));
            } else if (respuesta == 0) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Individuales" + numper);
                System.out.println("Precio por entrada individual " + precio + " euros");
                System.out.println("Total " + precio * numper);
                System.out.println("Descuento " + ((precio * 100) / tarjetano));
                System.out.println("A pagar " + (precio - ((precio * 100) / tarjetano)));
            } else {
                System.out.println("La informacion de la tarjeta se ha introducido mal.");
            }
        } // El dia de Miercoles
        else if (dia == 3) {
            precio = 5;
            if (respuesta == 1) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Individuales" + numper);
                System.out.println("Precio por entrada individual " + precio + " euros");
                System.out.println("Total " + precio * numper);
                System.out.println("Descuento " + ((precio * 100) / tarjetasi));
                System.out.println("A pagar " + (precio - ((precio * 100) / tarjetasi)));
            } else if (respuesta == 0) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Individuales" + numper);
                System.out.println("Precio por entrada individual " + precio + " euros");
                System.out.println("Total " + precio * numper);
                System.out.println("Descuento " + ((precio * 100) / tarjetano));
                System.out.println("A pagar " + (precio - ((precio * 100) / tarjetano)));
            } else {
                System.out.println("La informacion de la tarjeta se ha introducido mal.");
            }
        } // El dia de Jueves
        else if (dia == 4) {
            preciopar = 11;
            precio = 8;
            if (respuesta == 1) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Grupales" + parejas);
                System.out.println("Precio por entrada individual " + preciopar + " euros");
                System.out.println("Total " + ((preciopar * (numper / 2)) + (precio * (numper % 2))));
                System.out.println("Descuento " + (((preciopar * (numper / 2)) + (precio * (numper % 2))) / tarjetasi));
                System.out.println("A pagar " + (((preciopar * (numper / 2)) + (precio * (numper % 2)))
                        - ((preciopar * (numper / 2)) + (precio * (numper % 2))) / tarjetasi));
            } else if (respuesta == 0) {
                System.out.println("Numero de entradas: " + numper);
                System.out.println("Si tienes tarjeta CineCampa");
                System.out.println("Entradas Grupales" + parejas);
                System.out.println("Precio por entrada individual " + preciopar + " euros");
                System.out.println("Total " + ((preciopar * (numper / 2)) + (precio * (numper % 2))));
                System.out.println("Descuento " + (((preciopar * (numper / 2)) + (precio * (numper % 2))) / tarjetano));
                System.out.println("A pagar " + (((preciopar * (numper / 2)) + (precio * (numper % 2)))
                        - ((preciopar * (numper / 2)) + (precio * (numper % 2))) / tarjetano));
            } else {
                System.out.println("La informacion de la tarjeta se ha introducido mal.");
            }
        }

    }
}