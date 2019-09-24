public class App {
  public static void main(String[] args) {
    Produto produto1 = new Produto(
        "Escova",
        12.50
    );

    Produto produto2 = new Produto(
        "Aparelho",
        25.00
    );

    Carrinho carrinho = new Carrinho();

    carrinho.adicionarProduto(produto1);
    System.out.println(carrinho.calcularValorTotal());

    carrinho.adicionarProduto(produto2);
    System.out.println(carrinho.calcularValorTotal());

    System.out.println(carrinho.buscarProdutoPeloNome("Escva"));

    carrinho.removerProduto(produto1);
    System.out.println(carrinho.calcularValorTotal());
  }
}
