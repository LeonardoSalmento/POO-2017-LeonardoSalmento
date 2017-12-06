package model;

public class ContaPoupanca extends Conta{
	
	void ContaPoupanca(){
		
	}
	
	public void atualizar(double taxa){
		super.atualizar(taxa*3) ;
	}
}
