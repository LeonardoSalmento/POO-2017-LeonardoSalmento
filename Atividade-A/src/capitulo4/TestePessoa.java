package capitulo4;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "leo";
		p1.idade = 17;
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		
		p1.fazAniversario();
		System.out.println("Idade: " + p1.idade);
	}

}
