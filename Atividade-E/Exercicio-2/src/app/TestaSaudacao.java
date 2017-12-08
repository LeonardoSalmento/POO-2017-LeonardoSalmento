package app;

import model.Saudacao;

public class TestaSaudacao {

	public static void main(String[] args) {
		
		Saudacao saudacao = new Saudacao();
		
		String frase = saudacao.obterSaudacao("Bom dia", "Pessoas");
		
		System.out.println(frase);

	}

}
