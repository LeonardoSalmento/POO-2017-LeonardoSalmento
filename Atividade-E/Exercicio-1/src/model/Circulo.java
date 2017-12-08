package model;

public class Circulo {
	
	double raio;
	
	
	public double obterArea(double raio){
		return Math.pow(raio,2)*3.14;
	}
	
	public double obterPerimetro(double raio){
		return 3.14* 2 * raio;
	}
	

}
