package capitulo4;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	public void abre(){
		aberta = true;
	}
	
	public void fecha(){
		aberta = false;
	}
	
	public void pinta(String s){
		cor = s;
	}
	
	public boolean estaAberta(){
		if (aberta){
			System.out.println("A porta esta aberta");
		}else{
			System.out.println("A porta esta fechada");
		}
		return aberta;
	}
}
