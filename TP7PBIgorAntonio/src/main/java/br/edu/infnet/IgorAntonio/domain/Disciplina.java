package br.edu.infnet.IgorAntonio.domain;

public class Disciplina {

	private int codigo;
	private String nome;
	
	@Override
	public String toString() {
		
		return "Nome da disciplina: " + nome + "\nCódigo da disciplina: " + codigo;	
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
