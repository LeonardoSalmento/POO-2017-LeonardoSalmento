package app;

import javax.swing.JOptionPane;

import model.*;

public class TesteFiguraGeometrica {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		
		quadrado.setLado(5);
		
		retangulo.setLado1(5);
		retangulo.setLado2(6);
		
		triangulo.setLado1(4);
		triangulo.setLado2(5);
		triangulo.setLado3(6);
		triangulo.setAltura(3.4);
		
		JOptionPane.showMessageDialog(null, "A area do quadrado é : " + quadrado.calcularArea());
		JOptionPane.showMessageDialog(null, "O perimetro do retangulo é: " + retangulo.calcularPerimetro());
		
		JOptionPane.showMessageDialog(null, "A area do triangulo é : " + triangulo.calcularArea());
		JOptionPane.showMessageDialog(null, "O perimetro do triangulo é: " + triangulo.calcularPerimetro());
		

	}

}
