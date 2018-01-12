package atividadesEly;

public class Quadrado implements FiguraGeometrica, Comparavel{
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

	@Override
	public int Comparar(FiguraGeometrica figura) {
		if (this.calcularArea()>figura.calcularArea()){
			return 1;
		}else if(this.calcularArea()<figura.calcularArea()){
			return -1;
		}
		return 0;
	}

}