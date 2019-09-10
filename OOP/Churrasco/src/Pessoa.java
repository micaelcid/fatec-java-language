public class Pessoa {
  String nome, sexo;
  int idade;
  boolean vegetariana;

  public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
    this.vegetariana = vegetariana;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void atualizarNome(String nome) {
    if(nome.length() > 3){
      this.setNome(nome);
    }
    else{
      System.out.println("O nome deve ter mais que 3 caracteres");
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isVegetariana() {
    return vegetariana;
  }
}
