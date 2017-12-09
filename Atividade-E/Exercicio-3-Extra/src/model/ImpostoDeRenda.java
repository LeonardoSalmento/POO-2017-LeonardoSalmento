package model;

public class ImpostoDeRenda {
	double rendaBruta;
	
	public ImpostoDeRenda(double rendaBruta){
		this.rendaBruta = rendaBruta;
	}
	
	public double calculaImposto(){
		if(rendaBruta>0 && rendaBruta <= 1000){
			return rendaBruta*0.05;
		}
		return rendaBruta*0.1;
	}
	
	public double rendaLiquida(){
		return (this.rendaBruta - this.calculaImposto());
	}

}
