package questao4;

public class TesteArCondicionado {

	public static void main(String[] args) {
		ArCondicionado ar1 = new ArCondicionado(10000);
		
		ar1.Ligado= true;
		ar1.Modo = "Frio";
		ar1.temperaturaAlvo = 22;
		ar1.VelocidadeVentilador = "forte";

	}

}
