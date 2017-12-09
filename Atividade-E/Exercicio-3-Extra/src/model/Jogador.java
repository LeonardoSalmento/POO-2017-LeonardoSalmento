package model;

public class Jogador {
	public int vidas;
	public Jogador(){
		this.vidas = 5;
	}
	
	public boolean isLimiteMaxVidas(){
		if(this.vidas==5){
			return true;
		}
		return false;
	}
	
	public boolean isLimiteMinVidas(){
		if(this.vidas==0){
			return true;
		}
		return false;
	}
	
	public void aumentarVidas(){
		if(this.vidas<5){
			this.vidas++;
		}
	}
	
	public void diminuirVidas(){
		if(this.vidas>0){
			this.vidas--;
		}
	}
	
	public void doarVidas(Jogador jogador){
		if(isLimiteMinVidas() == false){
			if(isLimiteMaxVidas() == false){
				this.diminuirVidas();
				jogador.aumentarVidas();
			}
		}
	}	
}