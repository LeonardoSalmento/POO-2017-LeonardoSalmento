package model;

public class Quadrado extends FiguraGeometrica{
	private double lado;
	
	
	public double calcularArea(){
		return getLado()*getLado();
	}
	
	public double calcularPerimetro(){
		return getLado() *4;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public double getLado(){
		return lado;
	}

}