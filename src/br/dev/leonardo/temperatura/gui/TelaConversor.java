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
		
		
		//Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura");
		
		
		
		
		
		
		tela.setVisible(true);
	}
	
}
