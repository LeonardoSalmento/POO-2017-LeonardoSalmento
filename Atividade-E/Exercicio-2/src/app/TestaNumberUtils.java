package app;

import javax.swing.JOptionPane;

import model.NumberUtils;

public class TestaNumberUtils {

	public static void main(String[] args) {
		int numero = 5;
		NumberUtils numberUtils = new NumberUtils(numero);
		
		if(numberUtils.isPair()){
			JOptionPane.showMessageDialog(null, "O numero " + numero + " � par.");
		}else{
			JOptionPane.showMessageDialog(null, "O numero " + numero + " � impar.");
		}
		
		if(numberUtils.isPrime()){
			JOptionPane.showMessageDialog(null, "O numero " + numero + " � primo.");
		}else{
			JOptionPane.showMessageDialog(null, "O numero " + numero + " n�o � primo.");
		}
		
		JOptionPane.showMessageDialog(null, numberUtils.printCount());
		
		JOptionPane.showMessageDialog(null, numberUtils.printReverseCount());
		

	}

}
