public class Gato extends Animal {
    private String raca;

    public Gato(String nome) {
        super(nome);
    }

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(super.nome + ": miau!");
    }

    public void morder() {
        System.out.println(super.nome + " mordeu");
    }
}
