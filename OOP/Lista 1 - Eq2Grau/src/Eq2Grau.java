public class Eq2Grau {
  double a, b, c, delta, raiz1, raiz2;

  public Eq2Grau(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double delta() {
    return (b * b) - 4 * a * c;
  }

  public double raiz1(double delta) {
    if(delta >= 0) {
      return ( - b + Math.sqrt(b) ) / 2 * a;
    }
    return Double.NaN;
  }

  public double raiz2(double delta) {
    if(delta >= 0) {
      return ( - b - Math.sqrt(b) ) / 2 * a;
    }
    return Double.NaN;
  }
}
