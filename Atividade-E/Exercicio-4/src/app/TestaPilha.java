package app;

import javax.swing.JOptionPane;

import model.Pilha;

public class TestaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.empilhar(5);
		pilha.empilhar(7);
		pilha.empilhar(2);
		pilha.empilhar(9);
		pilha.empilhar(8);
		if(pilha.estaCheia()){
			JOptionPane.showMessageDialog(null, "O array esta cheio");
		}else{
			JOptionPane.showMessageDialog(null, "O array ainda possui espaço");
		}
		
		JOptionPane.showMessageDialog(null, "O topo do array é: " + pilha.retornaTopo());
		
		pilha.desempilhar();
		JOptionPane.showMessageDialog(null, pilha.exibir());

	}

}
