package exceptions;

public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(double valor) {
		super("Voce nao possui R$ " + valor+ " na conta.");
	}

}
