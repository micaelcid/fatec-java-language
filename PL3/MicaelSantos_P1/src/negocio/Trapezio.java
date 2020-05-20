package negocio;

public class Trapezio extends Figura {
    float baseMenor, baseMaior, altura;

    public Trapezio(float baseMenor, float baseMaior, float altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.setArea(((baseMenor + baseMaior) * altura ) / 2);
    }
}
