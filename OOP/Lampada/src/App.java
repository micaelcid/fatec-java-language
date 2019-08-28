public class App {
  public static void main(String[] args) {
    Lampada lampada = new Lampada(Estado.OFF, 0);
    Interruptor interruptor = new Interruptor();

    for(int i = 0; i < 200; i++) {
      interruptor.click(lampada);
      System.out.println("Click " + lampada.getQtdClicks() + ": " + lampada.getEstado());
    }
  }
}
