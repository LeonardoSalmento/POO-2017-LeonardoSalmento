package model;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public boolean ehTriangulo(){
		int x = this.lado2-this.lado1;
		if (x<0){
			x = x*(-1);
		}
		if(x<this.lado1 && this.lado1<this.lado2+this.lado3){
			return true;
		}
		return false;
	}
	
	public boolean ehIsoceles(){
		if(ehTriangulo()!=true){
			return false;
		}
		if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado1 != lado3 && lado2 == lado3){
			return true;
		}
		return false;
	}
	
	public boolean ehEquilatero(){
		if(ehTriangulo()!=true){
			return false;
		}
		if(lado1 != lado2 || lado2 != lado3 || lado1 != lado3){
			return false;
		}
		return true;
	}

	public boolean ehEscaleno(){
		if(ehTriangulo()!=true){
			return false;
		}
		if(lado1 != lado3 && lado1 != lado2 ){
			return true;
		}
		return false;
	}
	
	public void setLado1(int lado1){
		this.lado1 = lado1;
	}
	
	public void setLado2(int lado1){
		this.lado1 = lado1;
	}
	
	public void setLado3(int lado1){
		this.lado1 = lado1;
	}

}
