package app;

import javax.swing.JOptionPane;

import model.DecimalNumber;

public class TestaDecimalNumber {

	public static void main(String[] args) {
		
		DecimalNumber decimalNumber = new DecimalNumber(3.5);
		
		int inteiro = decimalNumber.parteInteira();
		int decimal = decimalNumber.parteDecimal();
		
		JOptionPane.showMessageDialog(null, "O numero Inteiro é : " + inteiro);
		JOptionPane.showMessageDialog(null, "A parte decimal é : " + decimal);

	}

}
