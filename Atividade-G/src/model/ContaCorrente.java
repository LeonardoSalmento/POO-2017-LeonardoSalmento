package model;

public class ContaCorrente extends Conta{
	
	void ContaCorrente(){
		
	}
	
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * taxa*2;
	}
	
	public void depositar(double valor){
		this.saldo += valor - 0.1;
	}


	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}
}