package app;

import model.Desconto;

public class TestaDesconto {

	public static void main(String[] args) {
		
		Desconto desconto = new Desconto();
		
		double valorComDesconto = desconto.calcula(120,10);
		
		System.out.println(valorComDesconto);

	}

}
