import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    GuessNumber guessNumber = new GuessNumber();
    Scanner scanner = new Scanner(System.in);
    int number, attempt = 0;

    while(true) {
      attempt = attempt + 1;
      System.out.print("Digite o número: ");
      number = Integer.parseInt(scanner.nextLine());
      if(guessNumber.isCorrectNumber(number)){
        System.out.println("O número correto é " + number);
        System.out.println("O número foi adivinhado na tentativa " + attempt);
        break;
      }
      else {
        System.out.println("Errou!");
      }
    }
  }
}
