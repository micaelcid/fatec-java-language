public class Aparelho {
  Status status;
  int qtQuebra;

  void quebra(){
    if(qtQuebra >= 100) {
      status = Status.QUEBRADO;
    }
  }

  void ligar(){
    if(status == Status.DESLIGADO && status != Status.QUEBRADO){
      status = Status.LIGADO;
      qtQuebra++;
    }
  }

  void desligar(){
    if(status == Status.LIGADO && status != Status.QUEBRADO){
      status = Status.DESLIGADO;
    }
  }

  void mostrarStatus(){
    System.out.println(status);
  }

}
