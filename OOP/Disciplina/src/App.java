public class App {
  public static void main(String[] args) {
    Disciplina disciplina1 = new Disciplina("Java", "Garcia");
    Disciplina disciplina2 = new Disciplina("Cobol", "Pazetti");

    Aluno aluno1 = new Aluno("Micael", "1123123123213");
    Aluno aluno2 = new Aluno("Paula", "11231231232321");

    Matricula matricula = new Matricula();

    matricula.matricular(aluno1, disciplina1);
    matricula.matricular(aluno2, disciplina1);
    matricula.matricular(aluno2, disciplina2);
    matricula.matricular(aluno2, disciplina1);

    matricula.listarDisciplinaPorAluno(aluno2);
  }
}
