package model;

public class CalculadoraCientifica extends Calculadora{

	public CalculadoraCientifica(int operando1, int operando2) {
		super(operando1, operando2);
		
	}
	
	public double exponenciar(int base, int expoente){
		return Math.pow(base, expoente);
	}
	
	public double divisao(){
		if(super.divisao()>1){
			return super.divisao();
		}
	return super.divisao();
	}
	
	

}
