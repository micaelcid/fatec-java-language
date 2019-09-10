public class App {
  public static void main(String[] args) {
    TrianguloEquilatero trianguloEqulatero = new TrianguloEquilatero(3);

    trianguloEqulatero.calcularArea();
    trianguloEqulatero.calcularPerimetro();

    System.out.println("Lado: " + trianguloEqulatero.getLado());
    System.out.println("Area: " + trianguloEqulatero.getArea());
    System.out.println("Perimetro: " + trianguloEqulatero.getPerimetro());
  }
}
