package model;

public class Senha {
	String valor;
	
	public Senha(String valor){
		this.valor = valor;
	}
	
	public boolean iguais(String valor){
		if (this.valor == valor){
			return true;
		}
		return false;
	}
	
	public void iguaisTrim(String valor){
		
	}
	
	public boolean tamanhoSeguro(){
		if(valor.length()>=6){
			return true;
		}
		return false;
	}
	
	public boolean possuiMaiusculaMinuscula(){
		
		int maiuscula = 0;
		int minuscula = 0;
		for(int l = 0; l < valor.length();l++){
			if(valor[l]>='A' && valor[l]<= 'Z'){
				maiuscula++;
			}else if(valor[l]>='a' && valor[l]<= 'z'){
				minuscula++;
			}
			if (maiuscula > 0 && minuscula > 0){
				return true;
			}
		}
		return false;
	}
	
	public boolean possuiNumero(){
		
		
	}
	
	public boolean ehValida(){
		if(possuiMaiusculaMinuscula() && possuiNumero() && tamanhoSeguro()){
			return true;
		}
		return false;
	}

}
