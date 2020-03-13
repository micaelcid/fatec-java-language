public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " comeu");
    }

    public void dormir() {
        System.out.println(nome + " dormiu");
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo sons");
    }
}
