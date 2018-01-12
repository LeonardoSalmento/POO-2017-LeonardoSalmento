package model;

public abstract class Conta {
	
	public Conta(){
		
	}
	
	protected double saldo;
	
	
	public abstract void atualizar(double taxa);
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}