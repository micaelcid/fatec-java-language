package Usuario;

public class Comum extends Usuario {
    public Comum(String dataAcesso) {
        super(dataAcesso);
    }

    @Override
    public void cadastro() {
        System.out.println("Redireciona para o Login");
    }

    public void perfil() {
        System.out.println("Página de perfil");
    }
}
