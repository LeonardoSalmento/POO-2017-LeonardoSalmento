package model;

public class ContaCorrente extends Conta{
	
	void ContaCorrente(){
		
	}
	
	
	public void atualizar(double taxa){
		super.atualizar(taxa*2) ;
	}
	
	public void depositar(double valor){
		this.saldo += valor - 0.1;
	}
}