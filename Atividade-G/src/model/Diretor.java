package model;

public class Diretor extends Funcionario{
	
	public double getBonificacao(double taxa){
		double salarioFinal = getSalario()* taxa;
		salarioFinal += getSalario();
		return salarioFinal;
	
	}
}
