public class Disciplina {
  private String nome;
  private String professor;

  public Disciplina(String nome, String professor) {
    this.nome = nome;
    this.professor = professor;
  }

  public void mostrar() {
    System.out.println("Disciplina:" + nome);
    System.out.println("Professor:" + professor);
  }
}
