package model;

import java.awt.Font;

public abstract class Calculo implements ICalculo {
    private float primeiroValor, segundoValor;
    protected float resultado;

    public Calculo(float primeiroValor, float segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }


    public float getPrimeiroValor() {
        new Font()
        return primeiroValor;
    }

    public float getSegundoValor() {
        return segundoValor;
    }

    public float getResultado() {
        return resultado;
    }
}
