package Ejercicios.Ejercicio7;

import java.util.Random;

public class Actividad7 {
    public static void main(String[] args) {
        // Creamos los objetos con los valores decididos al crearlos
        Heroe heroe = new Heroe("Arturo", 100, 22);
        Monstruo monstruo = new Monstruo("Dragón", 120, 18);

        System.out.println("=== COMIENZA EL COMBATE ===");
        heroe.mostrarInfo();
        monstruo.mostrarInfo();
        System.out.println("===========================\n");

        // Turno de inicio aleatorio (true = empieza Héroe, false = empieza Monstruo)
        //Tuve que utiliziar ayuda de la IA
        Random aleatorio = new Random();
        boolean turnoHeroe = aleatorio.nextBoolean();

        if (turnoHeroe) {
            System.out.println("¡Empieza atacando el héroe " + heroe.getNombre() + "!");
            System.out.println(" ");
        } else {
            System.out.println("¡Empieza atacando el monstruo " + monstruo.getNombre() + "!");
            System.out.println(" ");
        }

        // Bucle mientras ambos sigan vivos (en cuanto uno llega a 0, hay vencedor y acaba)[cite: 6]
        while (heroe.getVida() > 0 && monstruo.getVida() > 0) {
            if (turnoHeroe) {
                System.out.println(heroe.getNombre() + " ataca a " + monstruo.getNombre() + " (-" + heroe.getAtaque() + " vida)");
                monstruo.recibirDaño(heroe.getAtaque());
                System.out.println("Vida restante de " + monstruo.getNombre() + ": " + monstruo.getVida());
                System.out.println(" ");
                turnoHeroe = false; // Cambiamos el turno
            } else {
                System.out.println(monstruo.getNombre() + " ataca a " + heroe.getNombre() + " (-" + monstruo.getAtaque() + " vida)");
                heroe.recibirDaño(monstruo.getAtaque());
                System.out.println("Vida restante de " + heroe.getNombre() + ": " + heroe.getVida());
                System.out.println(" ");
                turnoHeroe = true; // Cambiamos el turno
            }
        }

        // Comprobamos y mostramos el ganador y su vida restante
        System.out.println("=== FIN DEL COMBATE ===");
        if (heroe.getVida() > 0) {
            System.out.println("Ganador: " + heroe.getNombre() + " | Vida restante: " + heroe.getVida());
        } else {
            System.out.println("Ganador: " + monstruo.getNombre() + " | Vida restante: " + monstruo.getVida());
        }
    }
}
