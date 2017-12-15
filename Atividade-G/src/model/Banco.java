package model;

public class Banco {

	public Conta contas[];
	private int contador = 0;
	
	public Banco(int qtdContas){
		this.contas = new Conta[qtdContas];
	}
	
	public void adicionar(Conta conta){
		contas[contador] = conta;
		contador++;
		
	}
	
	public Conta pegaConta(int x){
		if (x> 0 && x < contador){
			for(int i=0;i<contador;i++){
				if(i == x){
					return contas[i];
				}
		}
			
		}
		return null;
		
	}
	
	public int pegaTotalDeContas(){
		return contador;
	}
	
}
