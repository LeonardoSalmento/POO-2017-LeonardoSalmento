package app;

import model.*;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class ManipuladorDeContas {
	
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("Leo");
		cc1.depositar(500);
		
		ContaCorrente cc2 = new ContaCorrente("Andressa");
		cc2.depositar(600);
		
		ContaCorrente cc3 = new ContaCorrente("Joao");
		cc3.depositar(400);
		
		ContaCorrente cc4 = new ContaCorrente("Jessica");
		cc4.depositar(200);
		
		ContaCorrente cc5 = new ContaCorrente("Henrique");
		cc5.depositar(300);
		
		List<ContaCorrente> contas = new ArrayList();
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		
		for(Conta c : contas){
			System.out.println("Conta do(a) dono(a): " + c.getTitular());
		}
		
		Collections.sort(contas);
		Collections.rotate(contas,1);
		
		
		System.out.println("Ordenando... \n");
		
		for(Conta c : contas){
			System.out.println("Conta do(a) dono(a): " + c.getTitular());
		}
		
	}

}
