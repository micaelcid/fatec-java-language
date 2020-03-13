package model;

public class Divisao extends Calculo{
    public Divisao(float primeiroValor, float segundoValor) {
        super(primeiroValor, segundoValor);
    }

    @Override
    public void calcular() {
        resultado = getPrimeiroValor() / getSegundoValor();
    }
}
