public class App {
  public static void main(String[] args) {
    Dog firstDog = new Dog(
      "Bob",
      "Pincher",
      40,
      5
    );
    firstDog.barks();

    Dog secondDog = new Dog(
      "Rex",
      "Golden Retriever",
      40,
      10
    );
    secondDog.barks();

    firstDog.bites(secondDog);
    firstDog.bites(secondDog);
    firstDog.bites(secondDog);

    secondDog.bites(firstDog);

    firstDog.bites(secondDog);

    secondDog.bites(firstDog);
    secondDog.bites(firstDog);
    secondDog.bites(firstDog);
    secondDog.bites(firstDog);

    System.out.println(firstDog.getName() + "'s HP: " + firstDog.getHealthPoints());
    System.out.println(secondDog.getName() + "'s HP: " + secondDog.getHealthPoints());
  }
}
