package questao3;

public class Veiculo {
	String marca;
	String modelo;
	boolean CarroEmDia;
	String cor;
	int ano;
	
	Veiculo(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void Multar(){
		CarroEmDia = false;
	}
	
	public void pintar(String cor){
		this.cor = cor;
	}
	
}
