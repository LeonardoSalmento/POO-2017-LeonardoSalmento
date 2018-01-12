package model;

public class Gerente extends Funcionario{
	
	private double rendimentoParaGerente;
	
	
	public double getBonificacao(double taxa){
		double salarioFinal = getSalario()* taxa + rendimentoParaGerente;
		salarioFinal += getSalario();
		return salarioFinal;
		
		
	}

}
