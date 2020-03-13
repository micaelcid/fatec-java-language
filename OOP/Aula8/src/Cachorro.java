public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(super.nome + ": auau!");
    }

    public void morder() {
        System.out.println(super.nome + " mordeu");
    }
}
