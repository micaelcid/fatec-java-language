package Usuario;

public abstract class Usuario {
    private String dataAcesso;

    public Usuario(String dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    public String getDataAcesso() {
        return dataAcesso;
    }

    public void principal() {
        System.out.println("Página principal - " + getDataAcesso());
    }

    public void painel() {
        System.out.println("Página não acessível - 403");
    }

    public abstract void cadastro();
}
