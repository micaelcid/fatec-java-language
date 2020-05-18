package model;

public class Subtracao extends Calculo{
    public Subtracao(float primeiroValor, float segundoValor) {
        super(primeiroValor, segundoValor);
    }

    @Override
    public void calcular() {
        resultado = getPrimeiroValor() - getSegundoValor();
    }
}
