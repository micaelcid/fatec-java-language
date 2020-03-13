
package view;

import negocio.Figura;
import negocio.Quadrado;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // ***** UPCASTING ***** 
        // instancia objeto da classe Quadrado
        Quadrado objQuadradoUp = new Quadrado();
        // atribui valor(es) para ser(em) trabalhado(s) no objeto
        objQuadradoUp.setLado(5);
        // ...
        // ...
        // de forma direta, atribui a instância do objeto da sub para um objeto da superclasse
        Figura objFiguraUp = objQuadradoUp;
        System.out.println(
            String.format("[Upcasting] Área da figura: %.2f cm².",
                objFiguraUp.calcularArea()));
        
        // ***** UPCASTING ***** 
        Figura objFiguraDown = new Quadrado();
        // ...
        // ...
        // via casting explícito, atribui objeto da super para a subclasse
        Quadrado objQuadradoDown = (Quadrado)objFiguraDown;
        objQuadradoDown.setLado(7);
        System.out.println(
            String.format("[Downcasting] Área do quadrado: %.2f cm².",
                objQuadradoDown.calcularArea()));
        
    }
    
}
