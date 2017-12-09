package app;

import model.Funcionario;
import model.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setSalario(1000);
		System.out.println(gerente.getBonificacao());

	}
	
	// Bonificacao do gerente
	//sim, pois, apesar do objeto ter sido instanciado com o funcionario, no momento da execução, ele descobre que é um gerente.

}
