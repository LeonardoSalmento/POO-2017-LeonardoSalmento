package Capitulo3;

public class Cap3Quest6 {

	public static void main(String[] args) {
		int primeiro = 0;
		int segundo = 1;
		while(primeiro <= 100){
			System.out.println(primeiro);
			segundo += primeiro;
			primeiro = segundo - primeiro;
			
		}
		System.out.println(primeiro);
		
	}

}
