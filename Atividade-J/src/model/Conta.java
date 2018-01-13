package model;

import exceptions.SaldoInsuficienteException;

public class Conta {
	
	public Conta(){
		
	}
	
	protected double saldo;
	

	
	public void depositar(double valor) {
		if (valor <= 0){
			throw new IllegalArgumentException("Você tentou depositar" + 
                    " um valor negativo");
			
		}else{
			this.saldo += valor;
			
		}
		
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor <= 0){
			throw new IllegalArgumentException("Você tentou sacar" + 
                    " um valor negativo");
		
		}
		if(valor> this.saldo){
			throw new SaldoInsuficienteException(valor);
			
		}
		
		this.saldo -= valor;
		
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}