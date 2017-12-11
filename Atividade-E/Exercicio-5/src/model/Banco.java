package model;

public class Banco {

	public Conta contas[];
	private int contador = 0;
	private int qtdContas;
	
	public Banco(int qtdContas){
		this.contas = new Conta[qtdContas];
		this.qtdContas = qtdContas;
	}
	
	public void adicionar(Conta conta){
		if (contador<qtdContas){
			contas[contador] = conta;
			contador++;
		}		
	}
	
	private Conta pegaConta(int x){
		if (x> 0 && x < contador){
			for(int i=0;i<contador;i++){
				if(i == x){
					return contas[i];
				}
		}
			
		}
		return null;
		
	}
	
	public String creditar(String numero, double valor){
		for(int i = 0; i<contador;i++){
			if (contas[i].getNumero()==numero){
				contas[i].setSaldo(contas[i].getSaldo() + valor);
				return "Saldo adicionado!";
			}
		}return "Numero da conta não existe";
	}
	
	public String transferir(String numCredito, String numDebito, double valor){
		for(int i = 0; i<contador;i++){
			if (contas[i].getNumero()==numDebito){
				contas[Integer.parseInt(numCredito)].setSaldo(contas[Integer.parseInt(numCredito)].getSaldo() - valor);
				contas[i].setSaldo(contas[i].getSaldo() + valor);
				return "Transferencia concluida!";
			}
		}return "Numero da conta não existe";
	}
	
	public int pegaTotalDeContas(){
		return contador;
	}
	
	public double saldoTotal(){
		double saldoTotal = 0;
		for(int i=0;i<contador;i++){
			saldoTotal += contas[i].getSaldo();
		}
		return saldoTotal;
	}
	
	public double mediaSaldo(){
		return (saldoTotal()/pegaTotalDeContas());
	}
	
}
