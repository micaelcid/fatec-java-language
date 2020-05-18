package pessoa;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String matricula, String email, String nome) {
		super(email, nome);
		this.matricula = matricula;
	}

	public void informarSobre() {
		System.out.println("- " + nome + ", RA " + matricula + ", " + email);
	}
}
