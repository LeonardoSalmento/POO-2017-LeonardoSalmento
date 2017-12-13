package model;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		
		System.out.println(c.getSaldo());
		c.atualizar(selic);
		System.out.println(c.getSaldo());
		double variavel = c.getSaldo();
		saldoTotal+=c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}


	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	

}
