package model;

public class Conta {
	public String numero;
	protected double saldo;
	
	public Conta(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
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
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

}
