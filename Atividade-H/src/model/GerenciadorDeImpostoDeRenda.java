package model;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public void adiciona(Tributavel tributavel){
		System.out.println("Adicionando tributavel: " + tributavel);
		
		this.total += tributavel.calculaTributo();
	}
	
	public double getTotal(){
		return this.total;
		
	}

}
