package model;

public class Produto {
	int codigo;
	String descricao;
	double valor;
	int quantidade;
	int quantidadeMinima;
	
	public Produto(int codigo, String descricao, double valor, int quantidade, int quantidadeMinima){
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.quantidadeMinima = quantidadeMinima;
	}
	
	public void baixar(int quantidade){
		if (this.quantidade-quantidade >=quantidadeMinima){
			this.quantidade = this.quantidade - quantidade;
		}		
	}
	
	public void aumentar(int quantidade){
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void reajusta(double taxa){
		this.valor = valor*(1+taxa/100);
	}
	
	public String ToString(){
		String s;
		s = "Código do produto: " + this.codigo + "\nDescrição do Produto: " + this.descricao + "\nValor: R$ " + this.valor;
		s = s + "\nQuantidade em estoque: " + this.quantidade + "\nQuantidade Minima: " + this.quantidadeMinima;
		return s;
		
	}
	
	public boolean equals(Produto produto){
		if(this.codigo == produto.codigo){
			return true;
		}
		return false;
	}	

}
