package model;

public class SituacaoFinanceira {
	double valorCreditos;
	double valorDebitos;
	
	public double saldo(double valorCreditos, double valorDebitos){
		return valorCreditos - valorDebitos;
	}

}
