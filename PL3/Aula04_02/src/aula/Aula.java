package aula;

import java.util.ArrayList;

import pessoa.Aluno;
import pessoa.Professor;

public class Aula {
	Professor professor;
	Disciplina disciplina;
	ArrayList<Aluno> alunos;

	public Aula(Professor professor, Disciplina disciplina) {
		this.professor = professor;
		this.disciplina = disciplina;
		this.alunos = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void informarSobre() {
		System.out.println("Essa aula é ministrada por: ");
		professor.informarSobre();

		System.out.println("A disciplina a ser lecionada é:");
		disciplina.informarSobre();

		System.out.println("Os alunos presentes são: ");
		for (Aluno aluno : alunos) {
			aluno.informarSobre();
		}
	}
}
