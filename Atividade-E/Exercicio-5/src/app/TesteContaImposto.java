package app;

import javax.swing.JOptionPane;

import model.*;

public class TesteContaImposto {

	public static void main(String[] args) {
		ContaImposto contaImposto = new ContaImposto(500,1);
		
		contaImposto.creditar(500);
		JOptionPane.showMessageDialog(null,"Saldo atual: R$ " + contaImposto.getSaldo());
		
		contaImposto.debitar(500);
		JOptionPane.showMessageDialog(null,"Saldo atual: R$ " + contaImposto.getSaldo());
		

	}

}
