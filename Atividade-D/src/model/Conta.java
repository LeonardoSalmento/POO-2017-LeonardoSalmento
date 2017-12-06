package model;

public class Conta {
	
	public Conta(){
		
	}
	
	protected double saldo;
	
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
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
