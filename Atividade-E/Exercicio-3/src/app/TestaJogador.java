package app;

import javax.swing.JOptionPane;

import model.Jogador;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(100,2,1000);
		Jogador jogador2 = new Jogador(500,1,1000);
		
		jogador1.atacar(jogador2);
		jogador2.atacar(jogador1);
		
		JOptionPane.showMessageDialog(null, jogador1.pontosAtuais());
		JOptionPane.showMessageDialog(null, jogador2.pontosAtuais());

	}

}
