
package view;

/**
 *
 * @author dreis
 */

import negocio.Aluno;
import negocio.Professor;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno objAluno1 = new Aluno("Rubens");
        Aluno objAluno2 = new Aluno("Lara");
        
        System.out.println(objAluno1.retornarSaudacao());
        System.out.println(objAluno2.retornarSaudacao());

        Professor objProfessor1 = new Professor("Rubens Lara");
        Professor objProfessor2 = new Professor("Rubens Lara");

        System.out.println(objProfessor1.retornarSaudacao());
        System.out.println(objProfessor2.retornarSaudacao("Dr."));

    }
    
}
