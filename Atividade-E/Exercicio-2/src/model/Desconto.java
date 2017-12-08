package model;

public class Desconto {
	double valor;
	int desconto;
	
	
	
	public double calcula(double valor, double desconto){
		double valor_final = valor * (1 - (desconto/100));
		return valor_final;
		
	}

}
