package Usuario;

public class Convidado extends Usuario {
    public Convidado(String dataAcesso) {
        super(dataAcesso);
    }

    @Override
    public void principal() {
        System.out.println("Página principal com pedido de cadastro");
    }

    @Override
    public void cadastro() {
        System.out.println("Página de cadastro de usuário");
    }
}
