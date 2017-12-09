package model;


public class Gerente extends Funcionario{
	public double getBonificacao() {
		return getSalario() * 0.15;
	}
}
