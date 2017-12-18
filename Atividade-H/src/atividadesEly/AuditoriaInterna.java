package atividadesEly;

public class AuditoriaInterna {
	private double somaFinal;
	Tributavel[] tributaveis = new Tributavel[10];
	private int contador;
	
	public void Adicionar(Tributavel tributavel){
		tributaveis[contador] = tributavel;
		contador++;
		
	}
	
	public double calcularTributos(){
		for (int i =0; i<contador;i++){
			somaFinal += tributaveis[i].calculaTributo();
		}
		return somaFinal;
	}

}
