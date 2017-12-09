package app;

import javax.swing.JOptionPane;

import model.ImpostoDeRenda;

public class TestaImpostoDeRenda {

	public static void main(String[] args) {
		
		ImpostoDeRenda impostoDeRenda1 = new ImpostoDeRenda(1000);
		ImpostoDeRenda impostoDeRenda2 = new ImpostoDeRenda(1500);
		
		JOptionPane.showMessageDialog(null, "O valor a ser pago no Imposto de renda1 é: R$ " + impostoDeRenda1.calculaImposto());
		JOptionPane.showMessageDialog(null, "A renda1 liquida é: R$ " + impostoDeRenda1.rendaLiquida());
		
		JOptionPane.showMessageDialog(null, "O valor a ser pago no Imposto de renda2 é: R$ " + impostoDeRenda2.calculaImposto());
		JOptionPane.showMessageDialog(null, "A renda2 liquida é: R$ " + impostoDeRenda2.rendaLiquida());

	}

}
