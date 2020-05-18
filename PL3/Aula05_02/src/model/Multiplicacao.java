package model;

public class Multiplicacao extends Calculo {
    public Multiplicacao(float primeiroValor, float segundoValor) {
        super(primeiroValor, segundoValor);
    }

    @Override
    public void calcular() {
        resultado = getPrimeiroValor() * getSegundoValor();
    }
}
