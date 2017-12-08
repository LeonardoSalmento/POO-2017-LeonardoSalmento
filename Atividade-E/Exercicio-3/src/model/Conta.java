package model;

public class Conta { 
	String numero;
	double saldo;
	
	public boolean sacar(double valor) {
		if (saldo - valor>0){
			saldo = saldo - valor;
			return true;
		}else{
			return false;
		}
		 
	}

	public void depositar(double valor) {
		saldo = saldo + valor; 
		}

	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean transferir(Conta conta, double valor) {
		double saldoAtual = this.saldo;
		this.sacar(valor);
		if (saldoAtual == this.saldo){
			return false;
		}else{
			conta.depositar(valor);
			return true;
		}
		
		}

}