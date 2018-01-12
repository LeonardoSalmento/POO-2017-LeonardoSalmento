package app;

import model.*;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.calculaTributo());
		
		Tributavel t = contaCorrente;
		
		System.out.println(t.calculaTributo());
		
		
		
	}

}
