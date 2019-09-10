public class Endereco {
  private String logradouro, cidade, cep;
  private Estado estado;

  public Endereco(String logradouro, String cep, String cidade, Estado estado) {
    this.logradouro = logradouro;
    this.cep = cep;
    this.cidade = cidade;
    this.estado = estado;
  }

  public void mostrarDados() {
    System.out.println("Logradouro: " + logradouro);
    System.out.println("cep: " + cep);
    System.out.println("Cidade: " + cidade);
    System.out.println("Estado: " + estado);
  }
}
