package model;

public class Equipamento {
	boolean ligado = true;
	
	
	
	public void ligar(){
		if (ligado==false){
			ligado = true;
			
		}
	}
	
	public void desligar(){
		if (ligado){
			ligado = false;
		}
	}
	
	public void inverter(){
		if(ligado){
			ligado = false;
		}else{
			ligado = true;
		}
	}
	
	public boolean estaLigado(){
		if (ligado){
			return true;
			
		}else{
			return false;
		}
	}
		

	

}
