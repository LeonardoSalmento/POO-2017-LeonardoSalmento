package Capitulo3;

public class FibonacciDuasVariaveis {

	public static void main(String[] args) {
		int primeiro = 0;
		int segundo = 1;
		Fib(primeiro,segundo);

	}
	
	public static void Fib(int primeiro,int segundo){
		if (segundo <= 100){
			System.out.println(primeiro);
			Fib(segundo, segundo+primeiro);
		}else{
			System.out.println(primeiro);
			System.out.println(segundo);
		}
		
	}

}
