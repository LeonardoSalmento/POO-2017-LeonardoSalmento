package model;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(String titular) {
		super(titular);
	}


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
	public int compareTo(ContaCorrente outra){
		if (this.saldo < outra.saldo) {
            return -1;
          }

          if (this.saldo > outra.saldo) {
            return 1;
          }

          return 0;
    }
}