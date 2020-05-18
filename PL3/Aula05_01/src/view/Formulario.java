package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formulario {
	private JFrame form;
	private JLabel lblNome;
	private JTextField txtNome;
	private JButton btnEnviarSaudacao;

	public Formulario() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		form = new JFrame("Meu primeiro JFrame");
		form.setBounds(450, 300, 400, 250);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);
		Container painel = form.getContentPane();

		Font fonteMaior = new Font("Arial", Font.PLAIN, 12);

		lblNome = new JLabel("Nome:");
		lblNome.setBounds(60, 30, 45, 25);
		lblNome.setForeground(Color.BLUE);
		lblNome.setFont(fonteMaior);
		painel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(120, 30, 180, 25);
		txtNome.setFont(fonteMaior);
		painel.add(txtNome);

		btnEnviarSaudacao = new JButton("Saudar!");
		btnEnviarSaudacao.setBounds(100, 80, 200, 30);
		btnEnviarSaudacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saudações, " + txtNome.getText());
			}
		});

		painel.add(btnEnviarSaudacao);
		form.setVisible(true);
	}
}

