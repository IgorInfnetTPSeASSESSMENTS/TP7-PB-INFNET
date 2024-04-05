package br.edu.infnet.IgorAntonio.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private int codigo;
	private Professor professor;
	private Disciplina disciplina;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma(int codigo, Professor professor, Disciplina disciplina) {
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
	}
	
	public String addAluno(Aluno aluno) {
		alunos.add(aluno);
		
		return "Aluno " + aluno.getNome() + " incluído com sucesso!";
	}
	
	public boolean abrirTurma() {
		if(alunos.size() < 2) {
			System.out.println("Turma não pode ser aberta! Número de alunos insuficiente!\n");
			return false;
		}
		
		if(alunos.size() > 10) {
			System.out.println("Turma não pode ser aberta! Número de alunos ultrapassou o limite de alunosc por turma!\n");
			return false;
		}
 		System.out.println("Turma aberta com sucesso!\n");
		return true;
	}
	
	public String gerarPauta() {
		return "Código da turma: " + codigo + "\nNome da disciplina: " +
							disciplina.getNome() + "\nNome do professor: " +
							professor.getNome() + "\nAlunos: " +
							getAlunos();					
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int ccdigo) {
		this.codigo = ccdigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}

