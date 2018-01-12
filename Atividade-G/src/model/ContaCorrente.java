package model;

public class ContaCorrente extends Conta{
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizar(double taxa){
		super.atualizar(taxa*2) ;
	}
	
	
}