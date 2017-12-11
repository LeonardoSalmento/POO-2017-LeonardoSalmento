package model;

public class Conta { 
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if (saldo - valor>0){
			saldo = saldo - valor;
			return true;
		}else{
			return false;
		}
		 
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor; 
		}

	public double consultarSaldo() {
		return this.saldo;
	}
	
	public boolean transferir(Conta conta, double valor) {
		double saldoAtual = this.saldo;
		this.sacar(valor);
		if (saldoAtual == this.saldo){
			return false;
		}
		conta.depositar(valor);
		return true;
		}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}

}