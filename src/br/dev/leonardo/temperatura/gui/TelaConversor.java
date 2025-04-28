package br.dev.leonardo.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import br.dev.leonardo.temperatura.model.Temperatura;

public class TelaConversor {

	// Declarando Atributos
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labellMensagemErro;
	private MaskFormatter mascaraApenasNumeros;

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

		// Fonte Mensagem Erro
		fonteMensagemErro = new Font("Arial", 1, 14);

		// Definindo Cores
		// Cor do Label Mensagem de Erro
		corLabelMensagemErro = new Color(255, 0, 0);

		// Criando a Tela Gráfica
		// Criando objeto JFrame
		JFrame tela = new JFrame();

		// Definindo o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(505, 400);

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
		labelCelsius.setBounds(40, 60, 420, 30);

		textCelsius = new JTextField();
		textCelsius.setFont(fonteTextCelsius);
		textCelsius.setBounds(40, 90, 420, 30);

		// Botão Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(40, 130, 200, 40);

		// Botão Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(260, 130, 200, 40);

		// Resultado
		labelResultado = new JLabel();
		labelResultado.setFont(fonteLabelResultado);
		labelResultado.setText("Digite um número para começar!");
		labelResultado.setBounds(40, 190, 420, 40);
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		;

		// Mensagem de erro
		labellMensagemErro = new JLabel();
		labellMensagemErro.setFont(fonteMensagemErro);
		labellMensagemErro.setForeground(corLabelMensagemErro);
		labellMensagemErro.setBounds(40, 240, 420, 40);
		labellMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);

		// Adicionando componentes na tela
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labellMensagemErro);

		// Listener
		// Adicionando ao botão Fahreinheit
		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(celsius);

					double fahreinheit = temperatura.converterParaFahreinheit();

					labelResultado.setText(fahreinheit + " FAHREINHEIT!");
					labellMensagemErro.setText(null);
					textCelsius.requestFocus();

				} catch (Exception ex) {
					labellMensagemErro.setText("* Por favor, digite apenas caracteres numéricos (0-9)!");
					textCelsius.setText(null);
					textCelsius.requestFocus();
				}
			}
		});

		// Adicionando ao botão Kelvin
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String valorCelsius = textCelsius.getText();

				try {
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(valorCelsius);
					temperatura.setCelsius(celsius);

					double kelvin = temperatura.converterParaKelvin();

					labelResultado.setText(kelvin + " KELVIN!");

				} catch (NumberFormatException ex) {
					labellMensagemErro.setText("* Por favor, digite apenas caracteres numéricos (0-9)!");
					textCelsius.setText(null);
					textCelsius.requestFocus();
				}

			}
		});

		// "Setando" se a tela será visível
		tela.setVisible(true);
	}

}
