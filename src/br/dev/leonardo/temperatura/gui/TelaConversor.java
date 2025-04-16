package br.dev.leonardo.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaConversor {

	// Declarando Atributos
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labellMensagemErro;
	private Font fonteTextCelsius;
	private Font fonteLabelCelsius;
	private Font fonteLabelResultado;
	private Font fonteMensagemErro;
	private Color corLabelMensagemErro;

	// Método para criar a tela
	public void criarTelaConversor() {

		// Criando Fontes
		// Fonte do Text Celsius
		fonteTextCelsius = new Font("Arial", 0, 14);

		// Fonte do Label Celsius
		fonteLabelCelsius = new Font("Arial", 1, 14);

		// Fonte Label Resultado
		fonteLabelResultado = new Font("Arial", 1, 18);

		// Criando a Tela Gráfica
		// Criando objeto JFrame
		JFrame tela = new JFrame();

		// Definindo o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(500, 400);

		// Setando tamanho da tela através do Dimension
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// Celsius
		labelCelsius = new JLabel();
		labelCelsius.setFont(fonteLabelCelsius);
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(40, 40, 420, 30);

		textCelsius = new JTextField();
		textCelsius.setFont(fonteTextCelsius);
		textCelsius.setBounds(40, 70, 420, 40);

		// Botão Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(40, 120, 200, 40);

		// Botão Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(260, 120, 200, 40);

		// Resultado
		labelResultado = new JLabel();
		labelResultado.setFont(fonteLabelResultado);
		labelResultado.setText("78,8 FAHREINHEIT!");
		labelResultado.setBounds(40, 170, 420, 40);
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		;

		// Mensagem de erro
		labellMensagemErro = new JLabel();
		labellMensagemErro.setText("Mensagem de Erro!");
		labellMensagemErro.setBounds(40, 220, 200, 40);

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labellMensagemErro);

		tela.setVisible(true);
	}

}
