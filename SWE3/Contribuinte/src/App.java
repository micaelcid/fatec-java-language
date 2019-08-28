import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {
    Contribuinte contribuinte = new Contribuinte();
    String nome, cpf, cnpj, cartao, mensagem;
    TipoPessoa tipoPessoa;
    int opcao;

    do{
      opcao = Integer.parseInt(
        JOptionPane.showInputDialog("Digite 1 para Pessoa Física e 2 para Pessoa Jurídica")
      );
    } while(opcao != 1 && opcao != 2);

    tipoPessoa = opcao == 1 ? TipoPessoa.FISICA : TipoPessoa.JURIDICA;

    if(tipoPessoa == TipoPessoa.FISICA){
      cpf = JOptionPane.showInputDialog("Digite o CPF:");
      contribuinte.setCpf(cpf);
    }
    else{
      cnpj = JOptionPane.showInputDialog("Digite o CNPJ:");
      contribuinte.setCnpj(cnpj);
    }

    nome = JOptionPane.showInputDialog("Digitar o nome:");
    contribuinte.setNome(nome);

    cartao = JOptionPane.showInputDialog("Digite o cartao:");
    contribuinte.setCartao(cartao);

    mensagem = tipoPessoa == TipoPessoa.FISICA ?
      "CPF: " + contribuinte.getCpf() :
      "CNPJ: " + contribuinte.getCnpj();

    mensagem = "Usuário criado com sucesso. \n" +
      "Nome: "+ contribuinte.getNome() + "\n" +
      mensagem + "\n" +
      "Cartão: "+ contribuinte.getCartao() + "\n";

    JOptionPane.showMessageDialog(null, mensagem);
  }
}
