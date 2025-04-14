package br.dev.leonardo.temperatura.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	//Declarando Atributos
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel lopalMensagemErro;
	
	//Método para criar a tela
	public void criarTelaConversor() {
		
		//Criando objeto JFrame
		JFrame tela = new JFrame();
		
		//Definindo o tamanho da tela
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(500, 400);
		
		//Setando tamanho da tela através do Dimension
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		
		//Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(40, 40, 420, 30);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(40, 70, 420, 40);
		
		//Botão Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(40, 120, 200, 40);
		
		//Botão Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(260, 120, 200, 40);
		
		
		
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		
		tela.setVisible(true);
	}
	
}
