package app;

import model.Soma;

public class TestaSoma {

	public static void main(String[] args) {
		Soma soma = new Soma();
		
		int soma_final = soma.calculaSoma(4, 3);
		
		System.out.println("O resultado da soma é: " + soma_final);
		

	}

}
