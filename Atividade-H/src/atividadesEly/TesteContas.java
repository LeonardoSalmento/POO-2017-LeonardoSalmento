package atividadesEly;

public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		SeguroDeVida seguroDeVida1 = new SeguroDeVida();
		SeguroDeVida seguroDeVida2 = new SeguroDeVida();
		
		conta1.setSaldo(1000);
		conta2.setSaldo(1500);
		
		AuditoriaInterna auditoriaInterna = new AuditoriaInterna();
		
		//auditoriaInterna.Adicionar(conta);
		auditoriaInterna.Adicionar(conta1);
		auditoriaInterna.Adicionar(conta2);
		auditoriaInterna.Adicionar(seguroDeVida1);
		auditoriaInterna.Adicionar(seguroDeVida2);
		
		System.out.println("Total de Tributos: R$ " + auditoriaInterna.calcularTributos());

	}

}
