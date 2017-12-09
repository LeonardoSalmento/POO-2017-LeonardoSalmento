package model;

public class Pilha {
	int[] array = new int[5];
	int cont = 0;
	
	public void empilhar(int numero){
		array[cont] = numero;
		cont++;
	}
	
	public boolean estaCheia(){
		if (cont == 5){
			return true;
		}
		return false;
	}
	
	public void desempilhar(){
		int[] arrayAux = new int[array.length-1];
		for (int i=0;i<cont-1;i++){
			arrayAux[i] = array[i];
		}
		
		array = arrayAux;
	}
	
	public int retornaTopo(){
		return array[0];
	}
	
	public String exibir(){
		String s = "";
		for(int i = 0; i<cont;i++){
			if (i<cont-1){
				s += array[i] + " ";
			}
				
		}
		
	return s;
	}

}
