public class Produto {
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public void darDesconto(double porcentagem) {
    if(porcentagem > 0 && porcentagem < 1) {
      preco = preco * ( 1 - porcentagem );
    }
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }
}
