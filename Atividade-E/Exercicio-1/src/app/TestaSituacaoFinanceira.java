package app;

import javax.swing.JOptionPane;

import model.SituacaoFinanceira;

public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		
		SituacaoFinanceira situacaoFinanceira = new SituacaoFinanceira();
		
		double creditos = Integer.parseInt(JOptionPane.showInputDialog("Informe os creditos a serem armazenados"));
		double debitos = Integer.parseInt(JOptionPane.showInputDialog("Informe os debitos a serem armazenados"));
		
		double saldo = situacaoFinanceira.saldo(creditos,debitos);
		
		if (saldo>=0){
			JOptionPane.showMessageDialog(null, "Sua conta está positiva.\nsaldo: R$ " + saldo);
		}else{
			JOptionPane.showMessageDialog(null, "Sua conta está negativa.\nsaldo: R$ " + saldo);
		}
		
		

	}

}
