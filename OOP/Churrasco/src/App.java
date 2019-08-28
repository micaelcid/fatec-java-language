public class App {
  public static void main(String[] args) {
    Pessoa convidado1 = new Pessoa(
        "Micael",
        "M",
        21,
        false
    );

    Pessoa convidado2 = new Pessoa(
        "Lucas",
        "M",
        10,
        false
    );

    Pessoa convidado3 = new Pessoa(
        "Lucia",
        "F",
        3,
        false
    );

    Pessoa convidado4 = new Pessoa(
        "Matheus",
        "M",
        29,
        true
    );

    Churrasco churrasco = new Churrasco(20);
    churrasco.verificarConsumo(convidado1);
    churrasco.verificarConsumo(convidado2);
    churrasco.verificarConsumo(convidado3);
    churrasco.verificarConsumo(convidado4);
  }
}
