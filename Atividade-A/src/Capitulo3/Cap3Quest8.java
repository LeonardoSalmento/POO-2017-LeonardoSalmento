package Capitulo3;
import javax.swing.JOptionPane;

public class Cap3Quest8 {

	public static void main(String[] args) {
		int N = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor: "));
		
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j * i);
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}