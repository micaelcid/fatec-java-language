package negocio;

public class Circulo extends Figura {
    float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.setArea(Math.PI * Math.pow(raio, 2));
    }
}
