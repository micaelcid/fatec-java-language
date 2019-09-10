public class Interruptor {
  public void click(Lampada lampada) {
    Estado estado = lampada.getEstado();
    if(estado == Estado.OFF)
      lampada.setEstado(Estado.ON);
    if(estado == Estado.ON)
      lampada.setEstado(Estado.OFF);
  }
}
