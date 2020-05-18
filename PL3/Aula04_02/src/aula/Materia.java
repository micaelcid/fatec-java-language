package aula;

public class Materia {
	private String topico, descricao;

	public Materia(String topico, String descricao) {
		this.topico = topico;
		this.descricao = descricao;
	}

	public void informarSobre() {
		System.out.println("- " + topico + ": " + descricao);
	}
}
