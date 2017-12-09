package model;

public class Postagem {
	private int id;
	private String texto;
	private int qtdCurtidas;
	
	
	public void curtir(){
		qtdCurtidas++;
	}
	
	public String tostring(){
		return "Postagem: " + this.texto + "\nCurtidas: " + this.qtdCurtidas; 
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
		
	public void setTexto(String texto){
		this.texto = texto;
	}
	
	public String getTexto(){
		return this.texto;
	}
	
	
	public void setQtdCurtidas(int qtdCurtidas){
		this.qtdCurtidas = qtdCurtidas;
	}
	
	public int getQtdCurtidas(){
		return this.qtdCurtidas;
	}
}
