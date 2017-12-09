package app;

import javax.swing.JOptionPane;

import model.*;

public class TestaMicroBlog {

	public static void main(String[] args) {
		
		MicroBlog microblog = new MicroBlog(5);
		
		Postagem postagem1 = new Postagem();
		Postagem postagem2 = new Postagem();
		Postagem postagem3 = new Postagem();
		
		
		postagem1.setTexto("vamos ver no que vai dar");
		postagem1.setId(1);
		postagem1.setQtdCurtidas(2);
		postagem1.curtir();
		
		postagem2.setTexto("parece que ta indo");
		postagem2.setId(2);
		postagem2.setQtdCurtidas(4);
		postagem2.curtir();
		
		postagem3.setTexto("será se deu?");
		postagem3.setId(3);
		postagem3.setQtdCurtidas(6);
		postagem3.curtir();
		
		microblog.adicionaPostagem(postagem1);
		microblog.adicionaPostagem(postagem2);
		microblog.adicionaPostagem(postagem3);
		
		JOptionPane.showMessageDialog(null, microblog.maisCurtida().tostring());
		microblog.curtir(1);
		
		microblog.excluirPostagem(3);
		JOptionPane.showMessageDialog(null, microblog.maisCurtida().tostring());
		
		
		
		
	}

}
