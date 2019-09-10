public class Bateria {
  private int carga;

  public Bateria() {
    this.carga = 100;
  }

  public void gastarCarga() {
    carga -= 10;
  }

  public void recarregar() {
    carga = 100;
  }

  public boolean isVazia() {
    return carga == 0;
  }

  public void mostrarCarga() {
    System.out.println(carga + "%");
  }
}

