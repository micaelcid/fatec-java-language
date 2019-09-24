public class Aluno {
  private String nome, ra;

  public Aluno(String nome, String ra) {
    this.nome = nome;
    this.ra = ra;
  }

  public void mostrar() {
    System.out.println("Nome:" + nome);
    System.out.println("RA: " + ra);
  }
}
