public class App {
  public static void main(String[] args) {
    Disciplina disciplina1 = new Disciplina("Java", "Garcia");
    Disciplina disciplina2 = new Disciplina("Cobol", "Pazetti");

    Aluno aluno1 = new Aluno("Micael", "1123123123213");
    Aluno aluno2 = new Aluno("Paula", "11231231232321");

    Matricula matricula = new Matricula();

    matricula.matricular(disciplina1, aluno1);
    matricula.matricular(disciplina1, aluno2);

    matricula.listarDisciplinaPorAluno(aluno1);
  }
}
