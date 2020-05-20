package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Circulo;
import negocio.Retangulo;
import negocio.Triangulo;
import negocio.Trapezio;

public class Formulario {

	private JFrame form;
	private JLabel lblRaio, lblBaseRet, lblAlturaRet, lblBaseTri, lblAlturaTri, lblResultado, lblBaseMenorTra, lblBaseMaiorTra, lblAlturaTra;
	private JTextField txtRaio, txtBaseRet, txtAlturaRet, txtBaseTri, txtAlturaTri, txtBaseMenorTra, txtBaseMaiorTra, txtAlturaTra;
	private JButton btnCirculo, btnRetangulo, btnTriangulo, btnTrapezio;

	public Formulario() {
		inicializarComponentes();
	}

	private void selecionarOpcao(boolean eCirculo, boolean eRetangulo, boolean eTriangulo, boolean eTrapezio) {
		lblRaio.setVisible(eCirculo);
		txtRaio.setVisible(eCirculo);
		txtRaio.setText("0");

		lblBaseRet.setVisible(eRetangulo);
		txtBaseRet.setVisible(eRetangulo);
		lblAlturaRet.setVisible(eRetangulo);
		txtAlturaRet.setVisible(eRetangulo);
		txtBaseRet.setText("0");
		txtAlturaRet.setText("0");

		lblBaseTri.setVisible(eTriangulo);
		txtBaseTri.setVisible(eTriangulo);
		lblAlturaTri.setVisible(eTriangulo);
		txtAlturaTri.setVisible(eTriangulo);
		txtBaseTri.setText("0");
		txtAlturaTri.setText("0");

		lblBaseMenorTra.setVisible(eTrapezio);
		txtBaseMenorTra.setVisible(eTrapezio);
		lblBaseMaiorTra.setVisible(eTrapezio);
		txtBaseMaiorTra.setVisible(eTrapezio);
		lblAlturaTra.setVisible(eTrapezio);
		txtAlturaTra.setVisible(eTrapezio);
		txtBaseMenorTra.setText("0");
		txtBaseMaiorTra.setText("0");
		txtAlturaTra.setText("0");

		lblResultado.setText(String.format("A área é: "));
	}

	private void validarPreenchimento(KeyEvent e) {
		if (!Character.isDigit(e.getKeyChar())){
			e.consume();
		}
	}

	private void calcularCirculo() {
		float raio = Float.parseFloat(txtRaio.getText().isEmpty() ? "0" : txtRaio.getText());
		Circulo circulo = new Circulo(raio);
		circulo.calcularArea();
		lblResultado.setText(String.format("A área é: %.2f", circulo.getArea()));
	}

	private void calcularRetangulo() {
		float base = Float.parseFloat(txtBaseRet.getText().isEmpty() ? "0" : txtBaseRet.getText());
		float altura = Float.parseFloat(txtAlturaRet.getText().isEmpty() ? "0" : txtAlturaRet.getText());
		Retangulo retangulo = new Retangulo(base, altura);
		retangulo.calcularArea();
		lblResultado.setText(String.format("A área é: %.2f", retangulo.getArea()));
	}

	private void calcularTriangulo() {
		float base = Float.parseFloat(txtBaseTri.getText().isEmpty() ? "0" : txtBaseTri.getText());
		float altura = Float.parseFloat(txtAlturaTri.getText().isEmpty() ? "0" : txtAlturaTri.getText());
		Triangulo triangulo = new Triangulo(base, altura);
		triangulo.calcularArea();
		lblResultado.setText(String.format("A área é: %.2f", triangulo.getArea()));
	}

	private void calcularTrapezio() {
		float baseMenor = Float.parseFloat(txtBaseMenorTra.getText().isEmpty() ? "0" : txtBaseMenorTra.getText());
		float baseMaior = Float.parseFloat(txtBaseMaiorTra.getText().isEmpty() ? "0" : txtBaseMaiorTra.getText());
		float altura = Float.parseFloat(txtAlturaTra.getText().isEmpty() ? "0" : txtAlturaTra.getText());
		Trapezio trapezio = new Trapezio(baseMenor, baseMaior, altura);
		trapezio.calcularArea();
		lblResultado.setText(String.format("A área é: %.2f", trapezio.getArea()));
	}

	private void inicializarComponentes() {
		form = new JFrame("Calculadora geométrica");
		form.setBounds(400, 250, 500, 300);
		form.setLayout(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container painelDeConteudo = form.getContentPane();

		Font fonteCustomizada = new Font("Arial", Font.BOLD, 16);

		// Botões

		btnCirculo = new JButton("Área do Circulo");
		btnCirculo.setMargin(new Insets(1, 1, 1, 1));
		btnCirculo.setBounds(20, 20, 200, 40);
		btnCirculo.setFont(fonteCustomizada);
		btnCirculo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selecionarOpcao(true, false, false, false);
			}
		});
		painelDeConteudo.add(btnCirculo);

		btnRetangulo = new JButton("Área do Retângulo");
		btnRetangulo.setBounds(20, 70, 200, 40);
		btnRetangulo.setFont(fonteCustomizada);
		btnRetangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selecionarOpcao(false, true, false, false);
			}
		});
		painelDeConteudo.add(btnRetangulo);

		btnTriangulo = new JButton("Área do Triângulo");
		btnTriangulo.setBounds(20, 120, 200, 40);
		btnTriangulo.setFont(fonteCustomizada);
		btnTriangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selecionarOpcao(false, false, true, false);
			}
		});
		painelDeConteudo.add(btnTriangulo);

		btnTrapezio = new JButton("Área do Trapézio");
		btnTrapezio.setBounds(20, 170, 200, 40);
		btnTrapezio.setFont(fonteCustomizada);
		btnTrapezio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selecionarOpcao(false, false, false, true);
			}
		});
		painelDeConteudo.add(btnTrapezio);

		// Inputs

		lblRaio = new JLabel("Raio:");
		lblRaio.setBounds(250, 30, 100, 25);
		painelDeConteudo.add(lblRaio);

		txtRaio = new JTextField("0");
		txtRaio.setBounds(330, 30, 100, 25);
		txtRaio.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularCirculo();
			}
		});
		painelDeConteudo.add(txtRaio);

		lblBaseRet = new JLabel("Base:");
		lblBaseRet.setBounds(250, 30, 100, 25);
		lblBaseRet.setVisible(false);
		painelDeConteudo.add(lblBaseRet);

		txtBaseRet = new JTextField("0");
		txtBaseRet.setBounds(330, 30, 100, 25);
		txtBaseRet.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularRetangulo();
			}
		});
		txtBaseRet.setVisible(false);
		painelDeConteudo.add(txtBaseRet);

		lblAlturaRet = new JLabel("Altura:");
		lblAlturaRet.setBounds(250, 70, 100, 25);
		lblAlturaRet.setVisible(false);
		painelDeConteudo.add(lblAlturaRet);

		txtAlturaRet = new JTextField("0");
		txtAlturaRet.setBounds(330, 70, 100, 25);
		txtAlturaRet.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularRetangulo();
			}
		});
		txtAlturaRet.setVisible(false);
		painelDeConteudo.add(txtAlturaRet);

		lblBaseTri = new JLabel("Base:");
		lblBaseTri.setBounds(250, 30, 100, 25);
		lblBaseTri.setVisible(false);
		painelDeConteudo.add(lblBaseTri);

		txtBaseTri = new JTextField("0");
		txtBaseTri.setBounds(330, 30, 100, 25);
		txtBaseTri.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				if(!txtBaseTri.getText().isEmpty()) {
					calcularTriangulo();
				} else {
					lblResultado.setText(String.format("A área é: "));
				}
			}
		});
		txtBaseTri.setVisible(false);
		painelDeConteudo.add(txtBaseTri);

		lblAlturaTri = new JLabel("Altura:");
		lblAlturaTri.setBounds(250, 70, 100, 25);
		lblAlturaTri.setVisible(false);
		painelDeConteudo.add(lblAlturaTri);

		txtAlturaTri = new JTextField("0");
		txtAlturaTri.setBounds(330, 70, 100, 25);
		txtAlturaTri.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularTriangulo();
			}
		});
		txtAlturaTri.setVisible(false);
		painelDeConteudo.add(txtAlturaTri);

		lblBaseMenorTra = new JLabel("Base menor:");
		lblBaseMenorTra.setBounds(250, 30, 100, 25);
		lblBaseMenorTra.setVisible(false);
		painelDeConteudo.add(lblBaseMenorTra);

		txtBaseMenorTra = new JTextField("0");
		txtBaseMenorTra.setBounds(330, 30, 100, 25);
		txtBaseMenorTra.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularTrapezio();
			}
		});
		txtBaseMenorTra.setVisible(false);
		painelDeConteudo.add(txtBaseMenorTra);

		lblBaseMaiorTra = new JLabel("Base maior:");
		lblBaseMaiorTra.setBounds(250, 70, 100, 25);
		lblBaseMaiorTra.setVisible(false);
		painelDeConteudo.add(lblBaseMaiorTra);

		txtBaseMaiorTra = new JTextField("0");
		txtBaseMaiorTra.setBounds(330, 70, 100, 25);
		txtBaseMaiorTra.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularTrapezio();
			}
		});
		txtBaseMaiorTra.setVisible(false);
		painelDeConteudo.add(txtBaseMaiorTra);

		lblAlturaTra = new JLabel("Altura:");
		lblAlturaTra.setBounds(250, 110, 100, 25);
		lblAlturaTra.setVisible(false);
		painelDeConteudo.add(lblAlturaTra);

		txtAlturaTra = new JTextField("0");
		txtAlturaTra.setBounds(330, 110, 100, 25);
		txtAlturaTra.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarPreenchimento(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				calcularTrapezio();
			}
		});
		txtAlturaTra.setVisible(false);
		painelDeConteudo.add(txtAlturaTra);

		lblResultado = new JLabel("A área é: ");
		lblResultado.setBounds(20, 250, 400, 25);
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setFont(fonteCustomizada);
		painelDeConteudo.add(lblResultado);

		form.setVisible(true);
	}
}
