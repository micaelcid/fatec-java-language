public class Churrasco {
  double qtdCarneEmKg;

  public Churrasco(double qtdCarneEmKg) {
    this.qtdCarneEmKg = qtdCarneEmKg;
  }

  public void verificarConsumo(Pessoa pessoa) {
    boolean naoConsome = (pessoa.getIdade() >= 0 && pessoa.getIdade() <= 3) || pessoa.isVegetariana();
    if(naoConsome) {
      System.out.println(pessoa.getNome() + " não consome carne.");
    }
    else if(pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12) {
      System.out.println(pessoa.getNome() + " consome 1 kilo de carne.");
    }
    else {
      System.out.println(pessoa.getNome() + " consome 2 kilos de carne.");
    }
  }
}
