public class TrianguloEquilatero {
  double lado, perimetro, area;

  public TrianguloEquilatero(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public double getArea() {
    return area;
  }

  public void calcularArea(){
    area = lado * (Math.sqrt(3)/2);
  }

  public void calcularPerimetro(){
    perimetro = lado * 3;
  }
}
