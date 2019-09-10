public class App {
  public static void main(String[] args) {
    double delta;
    Eq2Grau eq2grau = new Eq2Grau(
        -2,
        2,
        5
    );
    delta = eq2grau.delta();
    System.out.println(
        "x1: " + eq2grau.raiz1(delta)
    );
    System.out.println(
        "x2: " + eq2grau.raiz2(delta)
    );
  }
}
