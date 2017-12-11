package app;

import model.*;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta("1",250);
		Conta cc = new Conta("2",300);
		Conta cp = new Conta("4",500);
		
		
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		

		
		

	}
	
	
}