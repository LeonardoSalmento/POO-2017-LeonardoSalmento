package questao3;

public class ContaBancaria {
	double saldo;
	Titular T1 = new Titular("Leonardo",123);
	
	public void depositar(double valor){
		this.saldo+= valor;
	}
	
	public void sacar(double valor){
		this.saldo-= valor;
	}
	
}
