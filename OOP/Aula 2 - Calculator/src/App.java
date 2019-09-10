public class App {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.n1 = 7;
    calculator.n2 = 10;

    System.out.println(calculator.sum());
    System.out.println(calculator.subtract());
    System.out.println(calculator.multiply());
    System.out.println(calculator.divide());
  }
}
