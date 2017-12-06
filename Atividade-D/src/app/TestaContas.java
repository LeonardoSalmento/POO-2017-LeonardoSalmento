package app;

import model.*;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
		

	}
	
	
}