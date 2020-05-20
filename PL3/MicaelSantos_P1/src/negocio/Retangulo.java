package negocio;

public class Retangulo extends Figura {
    float base, altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.setArea(base * altura);
    }
}
