package app;

import javax.swing.JOptionPane;

import model.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1,"Notebook Dell",3.500,20,5);
		Produto produto2 = new Produto(3,"Notebook Samsung",3.000,15,5);
		Produto produto3 = new Produto(3,"Notebook Acer",3.000,15,5);
		
		JOptionPane.showMessageDialog(null, produto1.ToString());
		JOptionPane.showMessageDialog(null, produto2.ToString());
		JOptionPane.showMessageDialog(null, produto3.ToString());
		
		produto1.aumentar(5);
		produto2.baixar(10);
		produto3.baixar(11);
		
		produto1.reajusta(10);
		
		if(produto2.equals(produto3)){
			JOptionPane.showMessageDialog(null, "Os Produtos 2 e 3 possuem o mesmo código");
		}else{
			JOptionPane.showMessageDialog(null, "Os Produtos 2 e 3 possuem códigos diferentes");
		}
		
		JOptionPane.showMessageDialog(null, produto1.ToString());
		JOptionPane.showMessageDialog(null, produto2.ToString());
		JOptionPane.showMessageDialog(null, produto3.ToString());

	}

}
