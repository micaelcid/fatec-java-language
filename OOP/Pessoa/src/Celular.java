public class Celular {
  private String numero;
  private Bateria bateria;

  public Celular(String numero, Bateria bateria) {
    this.numero = numero;
    this.bateria = bateria;
  }

  public boolean hasBateria() {
    return bateria != null;
  }

  public void ligar() {
    if(hasBateria()){
      if(bateria.isVazia()) {
        System.out.print("Por favor, recarregue seu celular");
      } else {
        System.out.println("Bem vindo, " + numero);
        bateria.gastarCarga();
        bateria.mostrarCarga();
      }
    }
  }
}
