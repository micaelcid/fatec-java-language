package aula;

import java.util.ArrayList;

public class Disciplina {
	private String codigo, ementa;
	private ArrayList<Materia> materias;

	public Disciplina(String codigo, String ementa) {
		this.codigo = codigo;
		this.ementa = ementa;
		this.materias = new ArrayList<Materia>();
	}

	public void adicionarMateria(Materia materia) {
		materias.add(materia);
	}

	public void informarSobre() {
		System.out.println(codigo + " - " + ementa);
		System.out.println();

		if(materias.size() > 0) {
			System.out.println("Essa disciplina tem as seguintes matérias: ");
			for (Materia materia : materias) {
				materia.informarSobre();
			}

			System.out.println();
		}
	}
}
