package exercicios;

public class Consulta {
	
	private int codigoConsulta;
	private String data;
	private String horario;
	private double valor;
	Paciente oPaciente;
	
	public void setCodigoConsulta(int codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}
	
	public int getCodigoConsulta() {
		return codigoConsulta;
	}
	
	public void setData (String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setHorario (String horario) {
		this.horario = horario;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Consulta() {
		oPaciente = new Paciente();
	}
	
	public void setPaciente(Paciente oPaciente) {
		this.oPaciente = oPaciente;
	}
	
	public Paciente getPaciente() {
		return oPaciente;
	}
	
	public String toStringFinal() {
		String stg = "PACIENTE\n---------------------\n" + oPaciente.toString() + "\n---------------------\nDADOS DA CONSULTA\n--------------------\n"
				+ "Codigo da consulta: " + codigoConsulta + "\nData da consulta: " + data + "\nHor�rio da consulta: " + horario + "\nValor da consulta: " + valor;
		return stg;
	}
	
	public String toStringInicial() {
		String stgI = "Codigo da consulta: " + codigoConsulta + "\nData da consulta: " + data + "\nHor�rio da consulta: " + horario + "\nValor da consulta: " + valor;
		return stgI;
	}
	

}
