package app;

public class Teste {

	public static void main(String[] args) {
		String[] lista = {"9","5","6","7","0"};
		
		int listaAux[] = new int[lista.length];
		
		for (int i=0;i<lista.length;i++){
			listaAux[i] = Integer.parseInt(lista[i]);
		}
		
		int Ordenados[] = new int[lista.length];
		Ordenados[0] = listaAux[0];
		for (int i=1;i<lista.length;i++){
			
			if(listaAux[i]>=Ordenados[i-1]){
				Ordenados[i] = listaAux[i]; 
			}else{
			//	int aux = listaAux[i];
			//	for (int j=0;j<i;j++){
			//		if(Ordenados[j] >= aux){
				//		
			//		}
		//				
	//				
//				}
				Ordenados[i] = Ordenados[i-1];
				Ordenados[i-1] = listaAux[i];
			}
		}
		
		for(int i=0;i<Ordenados.length;i++){
			System.out.println(Ordenados[i]);
			
		}
		
		
	}

}
