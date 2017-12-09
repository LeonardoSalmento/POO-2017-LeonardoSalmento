package model;

public class Funcionario extends PessoaFisica{
	public boolean isCpfValido(){
		return true;
	}
	
	 private double salario; 
	 
	  public double getBonificacao() {
		  return this.salario * 0.10;
		  }
	  
	 public double getSalario(){
		  return this.salario;
	  }
	 
	 public void setSalario(double salario){
		 this.salario = salario;
	 }

}
