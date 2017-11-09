package capitulo4;

public class Fibonacci {

	public int calculaFibonacci(int index){
	int aux,primeiro,segundo;
	primeiro = 0;
	segundo = 1;

	
	for (int i = 0; i < index; i++){
		aux = primeiro;
		primeiro += segundo;
		segundo = aux;
		
		
	}
	return primeiro;
	}
}