package app;

import model.*;

public class TestaEmpregados {

	public static void main(String[] args) {
		Empregado e = new Empregado();
		Empregado d = new Diarista();
		Empregado h = new Horista();
		
		System.out.println("Salario1 = " + e.calcSalario());
		System.out.println("Salario1 = " + d.calcSalario());
		System.out.println("Salario1 = " + h.calcSalario());

	}

}
