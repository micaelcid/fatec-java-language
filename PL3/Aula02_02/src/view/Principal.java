package view;

import model.*;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Calculo calculo = null;
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão", "Sair"};
        int opcaoEscolhida;
        float primeiroValor, segundoValor;

        while(true) {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "Por favor, selecione a operação desejada",
                    "Calculadora Oldschool",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]
            );

            if(opcaoEscolhida == 4) {
                JOptionPane.showMessageDialog(null, "Obrigado. Volte sempre.");
                return;
            }

            primeiroValor = Float.parseFloat(
                    JOptionPane.showInputDialog("Digite o primeiro valor: ")
            );
            segundoValor = Float.parseFloat(
                    JOptionPane.showInputDialog("Digite o segundo valor: ")
            );

            switch(opcaoEscolhida) {
                case 0:
                    calculo = new Adicao(primeiroValor, segundoValor);
                    break;
                case 1:
                    calculo = new Subtracao(primeiroValor, segundoValor);
                    break;
                case 2:
                    calculo = new Multiplicacao(primeiroValor, segundoValor);
                    break;
                case 3:
                    calculo = new Divisao(primeiroValor, segundoValor);
                    break;
            }

            calculo.calcular();
            JOptionPane.showMessageDialog(null, "O resultado é " + calculo.getResultado());
        }
    }
}
