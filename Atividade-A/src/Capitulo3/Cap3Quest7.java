package Capitulo3;
import javax.swing.JOptionPane;

public class Cap3Quest7 {

	public static void main(String[] args) {
	int X = Integer.valueOf(JOptionPane.showInputDialog("valor de X: "));
	int Y = -1;
	
	while(Y!=1){
		if (X % 2 == 0){
			Y = X/2;
		}else{
			Y = (3*X) + 1;
		}
		System.out.println(Y);
		X = Y;
	}
	

	}

}
