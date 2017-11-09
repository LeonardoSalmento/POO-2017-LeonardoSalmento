package capitulo4;

public class TestePorta {

	public static void main(String[] args) {
		Porta p1 = new Porta();
		
		p1.aberta = true;
		p1.cor = "Branca";
		p1.dimensaoX = 1.5;
		p1.dimensaoY = 1.3;
		p1.dimensaoZ = 1.2;
		
		System.out.println("Cor: "+p1.cor);
		p1.pinta("verde");
		System.out.println(p1.estaAberta());
		p1.fecha();
		System.out.println(p1.estaAberta());
		System.out.println("Cor: "+p1.cor);
		
	}
	

}
