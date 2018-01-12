package model;

public class ContaPoupanca extends ContaCorrente{
	
	void ContaPoupanca(){
		
	}
	
	public void atualizar(double taxa){
		super.atualizar(taxa*3) ;
	}
}
