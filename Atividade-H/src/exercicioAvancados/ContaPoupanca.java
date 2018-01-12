package exercicioAvancados;

public class ContaPoupanca implements Conta{
	
private double saldo;
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * (taxa*3);
	}

		
	public double getSaldo(){
		return this.saldo;
	}
}
