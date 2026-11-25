package Ejercicios.Ejercicio7;

public class Monstruo {
    // Atributos privados
    private String nombre;
    private int vida;
    private int ataque;

    // Constructor por parametros
    public Monstruo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    // Recibir daño (evitando vida negativa)
    public void recibirDaño(int danio) {
        this.vida -= danio;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    // Mostrar la información
    public void mostrarInfo() {
        System.out.println("Monstruo: " + nombre + " | Vida: " + vida + " | Ataque: " + ataque);
    }
}
