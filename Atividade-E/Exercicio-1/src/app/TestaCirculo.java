package app;

import model.Circulo;
import javax.swing.JOptionPane;

public class TestaCirculo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		double raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do raio: "));
		
		double area = circulo.obterArea(raio);
		double perimetro = circulo.obterPerimetro(raio);
		
		JOptionPane.showMessageDialog(null, "O valor da �rea do circulo �: " + area);
		JOptionPane.showMessageDialog(null, "O valor do per�metro do circulo �: " + perimetro);

	}

}
