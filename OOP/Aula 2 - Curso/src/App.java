public class App {
  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.nome = TipoCurso.ADS;
    curso.cargaHoraria = 2800;
    curso.mostrarFrasesDeOdio();
    curso.mostrarCargaHoraria();
  }
}
