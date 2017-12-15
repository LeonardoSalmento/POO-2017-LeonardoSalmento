package model;

public abstract class Conta {
	
	public Conta(){
		
	}
	
	protected double saldo;
	
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
	public abstract void depositar(double valor);
	
	public abstract void sacar(double valor);
	
	public double getSaldo(){
		return this.saldo;
	}

}
