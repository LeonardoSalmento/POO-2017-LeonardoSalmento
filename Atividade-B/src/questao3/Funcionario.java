package questao3;

public class Funcionario {
	boolean estaEmpregado;
	double salario;
	
	Cargo f1 = new Cargo(100.0,12);
	
	public void demitir(){
		this.estaEmpregado = false;
	}
	
	public void bonificar(double valor){
		this.salario += valor;
	}
	
	
}