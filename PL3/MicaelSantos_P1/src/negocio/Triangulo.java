package negocio;

public class Triangulo extends Figura {
    float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.setArea((base * altura) / 2);
    }
}
