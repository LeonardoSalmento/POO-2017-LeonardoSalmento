package app;

import model.*;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	void roda(Conta c){
		System.out.println(c.getSaldo());
		c.atualiza(0.1);
		System.out.println(c.getSaldo());
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	

}
