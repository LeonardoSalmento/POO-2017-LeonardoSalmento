package model;

public class ContaCorrente extends Conta implements Tributavel{
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizar(double taxa){
		super.atualizar(taxa*2) ;
	}

	@Override
	public double calculaTributo() {
		
		return this.saldo*0.01;
	}
	
	
}