package model;

public class Horista extends Diarista{
	
	public double calcSalario(){
		return (super.calcSalario()/24);
	}
}
