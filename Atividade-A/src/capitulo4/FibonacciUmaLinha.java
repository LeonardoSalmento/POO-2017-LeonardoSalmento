package capitulo4;

public class FibonacciUmaLinha {
	
	
	public int UmaLinha(int primeiro, int segundo){
		
		return segundo <= 100 ? UmaLinha(segundo,primeiro+segundo) : segundo;
			
	}
}
