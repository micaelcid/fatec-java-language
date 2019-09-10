public class Curso {
  TipoCurso nome;
  int cargaHoraria;

  public void mostrarFrasesDeOdio(){
    switch (nome){
      case ADS:
        System.out.println("Curso de COBOL");
        break;
      case SI:
        System.out.println("Curso de Designer");
        break;
      case LOG:
        System.out.println("Curso de Container");
        break;
      case GP:
        System.out.println("Curso de Navio");
        break;
      case GE:
        System.out.println("Curso de ADM");
        break;
      default:
        System.out.println("Não é curso");
    }
  }

  public void mostrarCargaHoraria(){
    System.out.println(cargaHoraria);
  }
}
