package Ejercicios.Ejercicio2;

public class Racional {
    // Atributos privados
    private int numerador;
    private int denominador;

    // Constructor por defecto
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor con parámetros
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("Error: El denominador no puede ser 0. Se asigna 1 por defecto.");
            this.denominador = 1;
        }
    }

    // Getters y Setters
    public void asignaNumerador(int x) {
        this.numerador = x;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void asignaDenominador(int y) {
        if (y != 0) {
            this.denominador = y;
        } else {
            System.out.println("Error: El denominador no puede ser 0.");
        }
    }

    public int getDenominador() {
        return this.denominador;
    }

    // Imprimir el número racional
    public void imprimirRacional() {
        System.out.println(this.numerador + "/" + this.denominador);
    }

    // Suma: (a/b) + (c/d) = (a*d + b*c) / (b*d)
    public Racional suma(Racional b) {
        int num = (this.numerador * b.denominador) + (this.denominador * b.numerador);
        int den = this.denominador * b.denominador;
        return new Racional(num, den);
    }

    // Resta: (a/b) - (c/d) = (a*d - b*c) / (b*d)
    public Racional resta(Racional b) {
        int num = (this.numerador * b.denominador) - (this.denominador * b.numerador);
        int den = this.denominador * b.denominador;
        return new Racional(num, den);
    }

    // Producto: (a/b) * (c/d) = (a*c) / (b*d)
    public Racional producto(Racional b) {
        int num = this.numerador * b.numerador;
        int den = this.denominador * b.denominador;
        return new Racional(num, den);
    }

    // División: (a/b) / (c/d) = (a*d) / (b*c)
    public Racional division(Racional b) {
        if (b.numerador == 0) {
            System.out.println("Error: No se puede dividir entre un racional con numerador 0.");
            return new Racional(0, 1);
        }
        int num = this.numerador * b.denominador;
        int den = this.denominador * b.numerador;
        return new Racional(num, den);
    }

    // Comparación: (a/b) == (c/d) si y solo si a*d == b*c
    public boolean esIgual(Racional b) {
        return (this.numerador * b.denominador) == (this.denominador * b.numerador);
    }
}
