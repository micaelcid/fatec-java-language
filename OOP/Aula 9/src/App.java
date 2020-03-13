import Animal.Animal;
import Animal.Cachorro;
import Animal.Gato;
import Usuario.Comum;
import Usuario.Usuario;
import Usuario.Admin;
import Usuario.Convidado;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Comum("11/11/2019");
        usuario.principal();
        usuario.painel();
        usuario.cadastro();

        // Downcast - Inicio
        // Recupera uma referência a um objeto
        Comum comum = (Comum) usuario;
        comum.perfil();
        // Downcast - Fim

        // Upcast - Inicio
        // Deixa a referencia mais abstrata
        Convidado convidado = new Convidado("05/11/2019");
        Usuario usuario1 = (Usuario) convidado;
        usuario1.cadastro();
        usuario1.painel();
        usuario1.principal();
        // Upcast - Fim

        Usuario usuario2 = new Admin("06/11/2019");

        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.dormir();

        Animal gato = new Gato();
        gato.emitirSom();
        gato.dormir();
    }
}
