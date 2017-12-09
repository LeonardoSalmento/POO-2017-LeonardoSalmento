package app;

import javax.swing.JOptionPane;

import model.Triangulo;

public class TesteTriangulo {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(5,5,5);
		triangulo.setLado1(5);
		triangulo.setLado2(5);
		triangulo.setLado3(5);
		
		if(triangulo.ehEquilatero()){
			JOptionPane.showMessageDialog(null, "É um triangulo equilatero.");
		}
		
	}

}
