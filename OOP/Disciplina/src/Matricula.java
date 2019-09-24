import java.util.ArrayList;
import java.util.HashMap;

public class Matricula {
  private HashMap<Disciplina, ArrayList<Aluno>> disciplinaAluno;
  private HashMap<Aluno, ArrayList<Disciplina>> alunoDisciplina;

  public Matricula() {
    this.disciplinaAluno = new HashMap<Disciplina, ArrayList<Aluno>>();
    this.alunoDisciplina = new HashMap<Aluno, ArrayList<Disciplina>>();
  }

  public void matricular(Disciplina disciplina, Aluno aluno) {
    if(disciplinaAluno.containsKey(disciplina)) {
      ArrayList<Aluno> alunos = disciplinaAluno.get(disciplina);
      alunos.add(aluno);
      disciplinaAluno.put(disciplina, alunos);
    }
    else {
      disciplinaAluno.put(disciplina, new ArrayList<Aluno>());
      matricular(disciplina, aluno);
    }

    if(alunoDisciplina.containsKey((aluno))) {
      ArrayList<Disciplina> disciplinas = alunoDisciplina.get(aluno);
      disciplinas.add(disciplina);
      alunoDisciplina.put(aluno, disciplinas);
    }
    else {
      alunoDisciplina.put(aluno, new ArrayList<Disciplina>());
      matricular(disciplina, aluno);
    }
  }

  public void listarAlunoPorDisciplina(Disciplina disciplina) {
    ArrayList<Aluno> alunos = disciplinaAluno.get(disciplina);
    disciplina.mostrar();
    for(Aluno aluno : alunos) {
      aluno.mostrar();
    }
  }

  public void listarDisciplinaPorAluno(Aluno aluno) {
    ArrayList<Disciplina> disciplinas = alunoDisciplina.get(aluno);
    aluno.mostrar();
    for(Disciplina disciplina : disciplinas) {
      disciplina.mostrar();
    }
  }
}
