package app;

import javax.swing.JOptionPane;

import model.Jogador;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		
		jogador1.diminuirVidas();
		jogador1.diminuirVidas();
		
		jogador2.diminuirVidas();
		jogador2.diminuirVidas();
		jogador2.aumentarVidas();
		
		jogador1.doarVidas(jogador2);
		
		JOptionPane.showMessageDialog(null, "O jogador 1 possui " + jogador1.vidas + " vidas");
		JOptionPane.showMessageDialog(null, "O jogador 2 possui " + jogador2.vidas + " vidas");

	}

}
