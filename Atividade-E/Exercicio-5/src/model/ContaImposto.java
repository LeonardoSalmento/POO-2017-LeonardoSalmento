package model;

public class ContaImposto {
	private double saldo;
	private int numero;
	
	public ContaImposto(double saldo, int numero){
		this.saldo = saldo;
		this.numero = numero;
	}
	
	public void creditar(double valor){
		this.saldo += valor;
	}
	
	
	public void debitar(double valor){
		double aux = retemImposto(valor);
		this.saldo -= aux;
	}
	
	private double retemImposto(double valor){
		return valor -=  valor*0.0038;
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}
