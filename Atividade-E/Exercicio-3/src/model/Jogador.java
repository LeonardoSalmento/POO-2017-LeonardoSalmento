package model;

public class Jogador {
	int forca;
	int nivel;
	int pontosAtuais;
	
	public Jogador(int forca, int nivel, int pontosAtuais){
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
	}
	
	public int pontosAtaque(int forca, int nivel){
		return forca*nivel;
	}
	
	public void atacar(Jogador jogador){
		pontosAtuais -= this.pontosAtaque( jogador.forca, jogador.nivel);
	}
	
	public int pontosAtuais(){
		return this.pontosAtuais;
	}

}
