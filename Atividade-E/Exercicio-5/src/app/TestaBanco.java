package app;

import javax.swing.JOptionPane;

import model.*;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco(5);

		
		Conta conta1 = new Conta("1",250);
		conta1.depositar(1000);
		
		Conta contaCorrente1 = new Conta("2",250);
		contaCorrente1.depositar(1000);
		
		Conta contaPoupanca1 = new Conta("4",500);
		contaPoupanca1.depositar(1000);
		
		banco.adicionar(conta1);
		banco.adicionar(contaCorrente1);
		banco.adicionar(contaPoupanca1);
		
		JOptionPane.showMessageDialog(null, banco.transferir("1", "4", 50));
		
		for (int i= 0; i < banco.pegaTotalDeContas();i++){
			System.out.println("Numero: "+ banco.contas[i].getNumero());
			System.out.println("Saldo: " + banco.contas[i].getSaldo());
			
		}
		
		System.out.println("O total de Contas no banco é " + banco.pegaTotalDeContas());
		
		JOptionPane.showMessageDialog(null, "O saldo total é: R$ " + banco.saldoTotal());
		JOptionPane.showMessageDialog(null, "A media de saldo por conta é: R$ " + banco.mediaSaldo());

	}

}
