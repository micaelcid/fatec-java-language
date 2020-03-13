
package negocio;

/**
 *
 * @author dreis
 */
public class Professor extends Pessoa{
    
    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String retornarSaudacao() {
        return String.format("Olá, prof. %s, seja bem-vindo!", nome);
    }
    
    public String retornarSaudacao(String tratamento) {
        return String.format("Olá, prof. %s %s, seja bem-vindo!", tratamento, nome);
    }
}
