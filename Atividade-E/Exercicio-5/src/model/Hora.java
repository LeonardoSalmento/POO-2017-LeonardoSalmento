package model;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora(int horas, int minutos, int segundos){
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		
	}
	
	public void setarHoras(int horas){
		this.horas = horas;
	}
	
	public void setarMinutos(int minutos){
		this.minutos = minutos;
	}
	
	public void setarSegundos(int segundos){
		this.segundos = segundos;
	}
	
	public String mostrarHora(){
		return horas + ":" + minutos + ":" + segundos; 
	}

}
