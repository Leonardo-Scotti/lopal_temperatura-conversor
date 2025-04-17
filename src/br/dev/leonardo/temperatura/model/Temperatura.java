package br.dev.leonardo.temperatura.model;

public class Temperatura {
	
	//Declarando Atributos
	private double celsius;
	
	//Métodos
	
	//Métodos Setters e Getters
	public double getCelsius( ) {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	//Métodos para conversão
	public double converterParaKelvin( ) {
		double kelvin = celsius + 273;
		return kelvin;
	}
	
	public double converterParaFahreinheit( ) {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}
}
