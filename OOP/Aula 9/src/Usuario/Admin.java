package Usuario;

public class Admin extends Usuario {
    public Admin(String dataAcesso) {
        super(dataAcesso);
    }

    @Override
    public void painel() {
        System.out.println("Página do painel - 200");
    }

    @Override
    public void cadastro() {
        System.out.println("Redireciona para o Login do Admin");
    }

    public void banir() {
        System.out.println("Banir usuário");
    }
}
