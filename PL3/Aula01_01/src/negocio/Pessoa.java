
package negocio;

/**
 *
 * @author dreis
 */
abstract class Pessoa {
    
    private String email;
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String retornarSaudacao(){
        return String.format("Olá, %s, seja bem-vindo!", nome);
    }
}
