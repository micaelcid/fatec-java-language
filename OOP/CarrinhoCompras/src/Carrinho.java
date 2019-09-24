import java.util.ArrayList;
import java.util.List;

public class Carrinho {
  private List<Produto> produtos = new ArrayList<Produto>();

  public void adicionarProduto(Produto produto) {
    if (produto != null)
      produtos.add(produtos.size(), produto);
  }

  public Produto removerProduto(Produto produto) {
    if(!produtos.isEmpty() && produto != null) {
      produtos.remove(produto);
    }
    return produto;
  }

  public Produto buscarProdutoPeloNome(String nome) {
    for(Produto produto : produtos) {
      if(produto.getNome() == nome){
        return produto;
      }
    }
    return null;
  }

  public double calcularValorTotal() {
    double soma = 0;
    for(Produto produto : produtos) {
      soma += produto.getPreco();
    }
    return soma;
  }
}
