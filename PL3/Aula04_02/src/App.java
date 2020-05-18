import pessoa.*;
import aula.*;

public class App {

	public static void main(String[] args) {
		Aula aula;
		Professor professor;
		Disciplina disciplina;
		Materia materia;
		Aluno aluno;

		professor = new Professor("1", "davi@email.com", "Davi");
		disciplina = new Disciplina("ELE2", "Programação em Java");

		materia = new Materia("Orientação a objetos", "Revisão sobre OOP");
		disciplina.adicionarMateria(materia);

		materia = new Materia("Web", "Como construir aplicações web em Java");
		disciplina.adicionarMateria(materia);

		aula = new Aula(professor, disciplina);

		aluno = new Aluno("1", "micael@email.com", "Micael");
		aula.adicionarAluno(aluno);

		aluno = new Aluno("2", "alexandre@email.com", "Alexandre");
		aula.adicionarAluno(aluno);

		aluno = new Aluno("3", "pedro@email.com", "Pedro");
		aula.adicionarAluno(aluno);

		aula.informarSobre();
	}
}
