public class App {
  public static void main(String[] args) {
    Endereco endereco = new Endereco(
        "Avenida Pedro Lessa",
        "11025-003",
        "Santos",
        Estado.SP
    );

    Pessoa pessoa = new Pessoa(
        "Micael",
        endereco
    );

    pessoa.mostrarDados();

    Bateria bateria = new Bateria();
    Celular celular = new Celular(
        "13997469508",
        bateria
    );

    celular.ligar();
  }
}
