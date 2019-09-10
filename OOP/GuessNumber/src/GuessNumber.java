public class GuessNumber {
  int targetNumber;

  public GuessNumber() {
    this.targetNumber = (int) (Math.random() * (99 - 0));
  }

  public boolean isCorrectNumber(int number) {
    return targetNumber == number;
  }
}
