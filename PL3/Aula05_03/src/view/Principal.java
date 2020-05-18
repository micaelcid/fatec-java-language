package view;

import javax.swing.*;

import model.Adicao;
import model.Calculo;
import model.Divisao;
import model.Multiplicacao;
import model.Subtracao;

public class Principal {
    public static void main(String[] args) {
        Calculo calculo = null;
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão", "Sair"};
        int opcaoEscolhida;
        String input;
        boolean isOnlyNumbers;
        float primeiroValor = 0;
        float segundoValor = 0;

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

            do {
                input = JOptionPane.showInputDialog("Digite o primeiro valor: ");
                isOnlyNumbers = input.matches("^[0-9]+$");
                if(isOnlyNumbers) {
                    primeiroValor = Float.parseFloat(input);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, digite apenas números.");
                }
            } while(!isOnlyNumbers);

            do {
                input = JOptionPane.showInputDialog("Digite o segundo valor: ");
                isOnlyNumbers = input.matches("^[0-9]+$");
                if(isOnlyNumbers) {
                    segundoValor = Float.parseFloat(input);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, digite apenas números.");
                }
            } while(!isOnlyNumbers);

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
