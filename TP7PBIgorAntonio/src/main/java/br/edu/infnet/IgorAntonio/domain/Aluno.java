package br.edu.infnet.IgorAntonio.domain;

public class Aluno {
	
	private int matricula;
	private String nome;
	
	@Override
	public String toString() {
		
		return "\nNome do aluno: " + nome + "\nMatrícula: " + matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
