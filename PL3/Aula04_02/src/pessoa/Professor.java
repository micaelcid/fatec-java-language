package pessoa;

import pessoa.Pessoa;

public class Professor extends Pessoa {
	private String registro;

	public Professor(String registro, String email, String nome) {
		super(email, nome);
		this.registro = registro;
	}

	public void informarSobre() {
		System.out.println(nome + " - RP " + registro + " - " + email);
		System.out.println();
	}
}
