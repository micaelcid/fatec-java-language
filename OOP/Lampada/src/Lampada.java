public class Lampada {
  int qtdClicks;
  Estado estado;

  public Lampada(Estado estado, int qtdClicks) {
    this.qtdClicks = qtdClicks;
    this.estado = estado;
  }

  public int getQtdClicks() {
    return qtdClicks;
  }

  public void setQtdClicks(int qtdClicks) {
    this.qtdClicks = qtdClicks;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    setQtdClicks(getQtdClicks() + 1);
    if (getQtdClicks() <= 100) {
      {
        this.estado = estado;
      }
    }
  }
}
