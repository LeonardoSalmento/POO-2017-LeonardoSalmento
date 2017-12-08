package app;

import javax.swing.JOptionPane;

import model.Equipamento;

public class TestaEquipamento {

	public static void main(String[] args) {
		
		Equipamento equipamento1 = new Equipamento();
		Equipamento equipamento2 = new Equipamento();

		equipamento1.ligar();
		equipamento2.desligar();
		
		equipamento1.inverter();
		equipamento2.inverter();
		
		if(equipamento1.estaLigado()){
			JOptionPane.showMessageDialog(null, "Está ligado!");
		}else{
			JOptionPane.showMessageDialog(null, "Está desligado!");
		}
		
		if(equipamento2.estaLigado()){
			JOptionPane.showMessageDialog(null, "Está ligado!");
		}else{
			JOptionPane.showMessageDialog(null, "Está desligado!");
		}
		
	}

}
