public class Door {
  boolean isOpened;
  int quantityOpened;

  public boolean getIsOpened() {
    return isOpened;
  }

  public String isOpenedToString() {
    return this.getIsOpened() ? "aberta" : "fechada";
  }

  public void setIsOpened(boolean isOpened) {
    this.isOpened = isOpened;
  }

  public int getQuantityOpened() {
    return quantityOpened;
  }

  public void setQuantityOpened(int quantityOpened) {
    this.quantityOpened = quantityOpened;
  }

  public void open(){
    this.setIsOpened(true);
    this.setQuantityOpened(
        this.getQuantityOpened() + 1
    );
  }

  public void close(){
    this.setIsOpened(false);
  }
}
