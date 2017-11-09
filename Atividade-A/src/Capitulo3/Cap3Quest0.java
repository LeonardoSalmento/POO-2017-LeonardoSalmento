package Capitulo3;

//parte 3.3

public class Cap3Quest0 {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		int i = 10;
		double d = 5;
		char c = 't';
		boolean b = true;
		// imprime concatenando diversas variáveis
		System.out.println("Resultado: " + i + ", " + d + ", " + c + ", " + b);

	}

}