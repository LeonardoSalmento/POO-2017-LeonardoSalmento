package app;

import model.Circulo;
import javax.swing.JOptionPane;

public class TestaCirculo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		double raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do raio: "));
		
		double area = circulo.obterArea(raio);
		double perimetro = circulo.obterPerimetro(raio);
		
		JOptionPane.showMessageDialog(null, "O valor da Área do circulo é: " + area);
		JOptionPane.showMessageDialog(null, "O valor do perímetro do circulo é: " + perimetro);

	}

}
