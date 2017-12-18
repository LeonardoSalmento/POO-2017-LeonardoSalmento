package exercicioAvancados;

public interface Conta {
		
	double getSaldo();
	void atualizar(double taxa);	
	void depositar(double valor);
	void sacar(double valor);
	
	

}
