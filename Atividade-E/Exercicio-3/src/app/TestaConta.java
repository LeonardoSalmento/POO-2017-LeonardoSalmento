package app;

import model.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.depositar(100);
		c2.depositar(200);
		c1.transferir(c2, 50);
		System.out.println(c1.consultarSaldo());
		System.out.println(c2.consultarSaldo());



	}

}
