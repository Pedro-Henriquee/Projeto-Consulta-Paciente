package exercicios;

public class Paciente {
	
	private int codigo;
	private String nome;
	private String sexo;
	
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String toString() {
		String sPaciente = ("Codigo do paciente: " + codigo + "\nNome do paciente: " + nome + "\nSexo do paciente: " + sexo);
		return sPaciente;
	}
	
}
