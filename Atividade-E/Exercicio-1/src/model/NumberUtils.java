package model;

public class NumberUtils {
	int numero;
	
	public NumberUtils(int numero){
		this.numero = numero;
	}
	
	public boolean isPair(){
		if (numero % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isPrime(){
		int cont = 0;
		if (numero==1){
			return false;
		}
		for (int l=1;l<=numero;l++){
			if (numero % l == 0){
				cont++;
			}
			if (cont > 2){
				return false;
				
			}
		
		}
		return true;
	}
	
	public String printCount(){
		String s = "";
		for (int l = 0; l <= numero;l++){
			if (l != numero){
				s = s + l + ", ";
			}else{
				s = s + l;
			}
		}
		return s;
	}
	
	public String printReverseCount(){
		String s = "";
		for (int l = numero; l >= 0;l--){
			if (l != 0){
				s = s + l + ", ";
			}else{
				s = s + l;
			}
		}
		return s;
	}
	

}
