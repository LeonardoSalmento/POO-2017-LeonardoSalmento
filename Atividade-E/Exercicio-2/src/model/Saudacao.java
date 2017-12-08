package model;

public class Saudacao {
	String texto;
	String destinatario;
	
	public String obterSaudacao(String texto, String destinatario){
		return (texto +", " + destinatario + ".");
	}
}
