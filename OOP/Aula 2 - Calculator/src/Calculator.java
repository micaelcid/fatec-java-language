public class Calculator {
  double n1, n2;

  public double sum(){
    return n1 + n2;
  }

  public double subtract(){
    return n1 - n2;
  }

  public double multiply(){
    return n1 * n2;
  }

  public double divide(){
    if(n1 != 0){
      return n1 / n2;
    }
    else{
      System.out.println("Não é possível dividir um número por 0");
      return Double.NaN;
    }
  }
}
