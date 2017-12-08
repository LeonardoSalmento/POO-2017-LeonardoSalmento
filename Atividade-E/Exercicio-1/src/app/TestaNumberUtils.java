package app;

import javax.swing.JOptionPane;

import model.NumberUtils;

public class TestaNumberUtils {

	public static void main(String[] args) {
		int numero = 5;
		NumberUtils numberUtils = new NumberUtils(numero);
		
		if(numberUtils.isPair()){
			JOptionPane.showMessageDialog(null, "O numero " + numero + " é par.");
		}else{
			JOptionPane.showMessageDialog(null, "O numero " + numero + " é impar.");
		}
		
		if(numberUtils.isPrime()){
			JOptionPane.showMessageDialog(null, "O numero " + numero + " é primo.");
		}else{
			JOptionPane.showMessageDialog(null, "O numero " + numero + " não é primo.");
		}
		
		JOptionPane.showMessageDialog(null, numberUtils.printCount());
		
		JOptionPane.showMessageDialog(null, numberUtils.printReverseCount());
		

	}

}
