package app;

import model.*;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco(5);
		
		 AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.1);

		
		Conta conta1 = new ContaCorrente();
		conta1.depositar(1000);
		
		Conta contaCorrente1 = new ContaCorrente();
		contaCorrente1.depositar(1000);
		
		Conta contaPoupanca1 = new ContaCorrente();
		contaPoupanca1.depositar(1000);
		
		banco.adicionar(conta1);
		banco.adicionar(contaCorrente1);
		banco.adicionar(contaPoupanca1);
		
		for (int i= 0; i < banco.pegaTotalDeContas();i++){
			System.out.println("Funcionario "+ (i + 1));
			System.out.print("Saldo: ");
			atualizadorDeContas.roda(banco.contas[i]);
		}
		
		System.out.println("O total de Contas no banco é " + banco.pegaTotalDeContas());

	}

}
