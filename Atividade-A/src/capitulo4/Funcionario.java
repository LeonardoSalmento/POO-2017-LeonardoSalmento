package capitulo4;

public class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	
	public String rg;
	public boolean estaNaEmpresa;
	
	public Data dataDeEntrada = new Data();
	
	public void bonifica(double aumento){
		salario += aumento;
	}
	
	public void demite(){
		estaNaEmpresa = false;
	}
	
	public void setDataDeEntrada(int dia, int mes, int ano){
		this.dataDeEntrada.dia = dia;
		this.dataDeEntrada.mes = mes;
		this.dataDeEntrada.ano = ano;
	}

	public void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario:R$ "+ this.salario);
		System.out.println("Entrou em " + this.dataDeEntrada.dia+"/"+this.dataDeEntrada.mes+"/"+this.dataDeEntrada.ano);
		System.out.println("RG: " + this.rg);
		if(estaNaEmpresa){
			System.out.println("Situacao: Empregado");
		}else{
			System.out.println("Situacao: Desempregado");
		}
		
	}
	
	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	

}
