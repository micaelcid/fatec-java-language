public class App {
  public static void main(String[] args) {
    Aparelho aparelho = new Aparelho();
    aparelho.status = Status.DESLIGADO;

    for(int i = 0; i < 102; i++){
      aparelho.ligar();
      aparelho.mostrarStatus();
      aparelho.desligar();
      aparelho.mostrarStatus();
      aparelho.quebra();
    }
  }
}
