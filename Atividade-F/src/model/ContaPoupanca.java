package model;

public class ContaPoupanca extends Conta{
	
	void ContaPoupanca(){
		
	}

	@Override
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa*3;
		
	}
	
	
}
