package vistas.fraccion;

public class Fraccion{
    private final int numerador;
    private final int denominador;

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            denominador = 1;
        }
        
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }

        int mcd = calcularMCD(numerador, denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    private int calcularMCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public Fraccion(int numero) {
        this.numerador = numero;
        this.denominador = 1;
    }

    public Fraccion(Fraccion fraccion) {
        this.numerador = fraccion.numerador;
        this.denominador = fraccion.denominador;
    }

    public Fraccion sumar(Fraccion otra) {
        int numerador = (this.numerador * otra.denominador) + (otra.numerador * this.denominador);
        int denominador = this.denominador * otra.denominador;
        return new Fraccion(numerador, denominador);
    }

    public Fraccion restar(Fraccion otra) {
        int numerador = (this.numerador * otra.denominador) - (otra.numerador * this.denominador);
        int denominador = this.denominador * otra.denominador;
        return new Fraccion(numerador, denominador);
    } 
    public void multiplicar(Fraccion fraccion){} 
    public void dividir(Fraccion fraccion){} 

    public boolean esMayor(Fraccion fraccion){}
    public boolean esMenor(Fraccion fraccion){}

    public boolean equals(Fraccion fraccion){}

    public void mostrar(){}
    public void invertir(){}
    


}