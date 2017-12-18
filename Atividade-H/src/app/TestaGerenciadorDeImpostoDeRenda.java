package app;

import model.*;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		gerenciador.adiciona(seguroDeVida);
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		gerenciador.adiciona(contaCorrente);
		
		System.out.printf("O saldo é: R$ %.2f", gerenciador.getTotal());

		
	}

}
