package model;

public class Adicao extends Calculo{
    public Adicao(float primeiroValor, float segundoValor) {
        super(primeiroValor, segundoValor);
    }

    @Override
    public void calcular() {
        resultado = getPrimeiroValor() + getSegundoValor();
    }
}
