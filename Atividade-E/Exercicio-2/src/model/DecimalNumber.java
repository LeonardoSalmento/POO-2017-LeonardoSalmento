package model;

public class DecimalNumber {
	double numero;
	
	public DecimalNumber(double numero){
		this.numero = numero;
	}
	
	public int parteInteira(){
		
		return  (int) numero;
	}
	
	public int parteDecimal(){
		int inteiro = (int) numero;
		int decimal = (int)((numero - inteiro)*10);
		return decimal;
	}

}
