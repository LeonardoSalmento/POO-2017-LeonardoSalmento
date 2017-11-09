package capitulo4;


public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Leonardo";
		f1.salario = 100;
		f1.departamento = "TI";
		f1.bonifica(50);
		f1.setDataDeEntrada(03,11,2017);
		f1.rg = "12343212";
		f1.estaNaEmpresa = true;
		f1.demite();
		
		f1.mostra();
		System.out.println(" ");
		
		Funcionario f2 = new Funcionario();
		
		f2.nome = "Leonardo";
		f2.salario = 100;
		f2.departamento = "TI";
		f2.bonifica(50);
		f2.dataDeEntrada.dia = 03;
		f2.dataDeEntrada.mes = 11;
		f2.dataDeEntrada.ano = 17;
		f2.rg = "12343212";
		f2.estaNaEmpresa = true;
		f2.demite();
		
		Funcionario f3 = f1;
		
		f2.mostra();
		
		if (f1 == f2){
			System.out.println("f1 e f2 sao iguais");
		}else{
			System.out.println("\nf1 e f2 sao Diferentes");
		}
		
		if (f1 == f3){
			System.out.println("f1 e f3 sao iguais");
		}else{
			System.out.println("\nf1 e f3 sao Diferentes");
		}
		
	}
	
}
