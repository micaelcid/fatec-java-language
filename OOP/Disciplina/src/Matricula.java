import java.util.ArrayList;
import java.util.HashMap;

public class Matricula {
  private HashMap<Disciplina, ArrayList<Aluno>> disciplinaAluno;
  private HashMap<Aluno, ArrayList<Disciplina>> alunoDisciplina;

  public Matricula() {
    this.disciplinaAluno = new HashMap<Disciplina, ArrayList<Aluno>>();
    this.alunoDisciplina = new HashMap<Aluno, ArrayList<Disciplina>>();
  }

  public void matricularAlunoDisciplina(Aluno aluno, Disciplina disciplina) {
    if(!alunoDisciplina.containsKey(aluno)) {
      alunoDisciplina.put(aluno, new ArrayList<Disciplina>());
    }

    ArrayList<Disciplina> disciplinas = alunoDisciplina.get(aluno);
    if(!disciplinas.contains(disciplina)) {
      disciplinas.add(disciplina);
      alunoDisciplina.put(aluno, disciplinas);
    }
  }

  public void matricularDisciplinaAluno(Disciplina disciplina, Aluno aluno) {
    if(!disciplinaAluno.containsKey(disciplina)) {
      disciplinaAluno.put(disciplina, new ArrayList<Aluno>());
    }

    ArrayList<Aluno> alunos = disciplinaAluno.get(disciplina);
    if(!alunos.contains(aluno)) {
      alunos.add(aluno);
      disciplinaAluno.put(disciplina, alunos);
    }
  }

  public void matricular(Aluno aluno, Disciplina disciplina) {
    matricularAlunoDisciplina(aluno, disciplina);
    matricularDisciplinaAluno(disciplina, aluno);
  }

  public void listarAlunoPorDisciplina(Disciplina disciplina) {
    ArrayList<Aluno> alunos = disciplinaAluno.get(disciplina);
    disciplina.mostrar();
    if(alunos != null) {
      for(Aluno aluno : alunos) {
        aluno.mostrar();
      }
    } else {
      System.out.println("Nenhum aluno matriculado");
    }
  }

  public void listarDisciplinaPorAluno(Aluno aluno) {
    ArrayList<Disciplina> disciplinas = alunoDisciplina.get(aluno);
    aluno.mostrar();
    if(disciplinas != null) {
      for(Disciplina disciplina : disciplinas) {
        disciplina.mostrar();
      }
    } else {
      System.out.println("Nenhuma disciplina matriculada");
    }

  }
}
