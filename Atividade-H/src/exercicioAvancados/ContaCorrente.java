package exercicioAvancados;

public class ContaCorrente implements ContaTributavel{
	
	private double saldo;
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * (taxa*2);
	}

		
	public double getSaldo(){
		return this.saldo;
	}

	@Override
	public double calculaTributo() {
		return this.saldo*0.01;
	}
	
	Conta c = new ContaCorrente();
	Tributavel t = new ContaCorrente();
	
}