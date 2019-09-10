public class App {
  public static void main(String[] args) {
    Door door = new Door();
    door.open();
    door.close();
    door.open();
    System.out.println("A porta está " + door.isOpenedToString() + " e foi aberta " + door.getQuantityOpened() + " vezes.");
    door.close();
    door.open();
    door.close();
    door.open();
    door.close();
    System.out.println("A porta está " + door.isOpenedToString() + " e foi aberta " + door.getQuantityOpened() + " vezes.");
  }
}
