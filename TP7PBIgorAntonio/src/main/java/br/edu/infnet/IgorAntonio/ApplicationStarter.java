package br.edu.infnet.IgorAntonio;

import br.edu.infnet.IgorAntonio.domain.Aluno;
import br.edu.infnet.IgorAntonio.domain.Disciplina;
import br.edu.infnet.IgorAntonio.domain.Professor;
import br.edu.infnet.IgorAntonio.domain.Turma;

public class ApplicationStarter {

	public static void main(String[] args) {
	
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matemática");
		disciplina1.setCodigo(01);
		
		Professor professor1 = new Professor();
		professor1.setNome("Fernando");
		professor1.setMatricula(123456);
		
		Turma turma1 = new Turma(01, professor1, disciplina1);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		aluno1.setMatricula(147896);
		
		turma1.addAluno(aluno1);
		System.out.println(turma1.gerarPauta());
		
		turma1.abrirTurma();
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Português");
		disciplina2.setCodigo(01);
		
		Professor professor2 = new Professor();
		professor2.setNome("Lopes");
		professor2.setMatricula(123456);
		
		Turma turma2 = new Turma(02, professor2, disciplina2);
		
		Aluno aluno2 = new Aluno();	
		aluno2.setNome("Pedro");
		aluno2.setMatricula(133456);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("João");
		aluno3.setMatricula(699887);
		
		turma2.addAluno(aluno2);
		turma2.addAluno(aluno3);
		System.out.println(turma2.gerarPauta());
		
		turma2.abrirTurma();
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Física");
		disciplina3.setCodigo(01);
		
		Professor professor3 = new Professor();
		professor3.setNome("Juan");
		professor3.setMatricula(123456);
		
		Turma turma3 = new Turma(03, professor3, disciplina3);
		
		
		Aluno aluno4 = new Aluno();	
		aluno4.setNome("Joana");
		aluno4.setMatricula(133456);
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome("Lohan");
		aluno5.setMatricula(693887);
		
		Aluno aluno6 = new Aluno();	
		aluno6.setNome("Jupiter");
		aluno6.setMatricula(609887);
		
		Aluno aluno7 = new Aluno();	
		aluno7.setNome("Pablo");
		aluno7.setMatricula(459887);
		
		Aluno aluno8 = new Aluno();	
		aluno8.setNome("Luiz");
		aluno8.setMatricula(699808);
		
		Aluno aluno9 = new Aluno();	
		aluno9.setNome("Bruce");
		aluno9.setMatricula(699547);
		
		Aluno aluno10 = new Aluno();	
		aluno10.setNome("Fabio");
		aluno10.setMatricula(655887);
		
		Aluno aluno11 = new Aluno();	
		aluno11.setNome("Igor");
		aluno11.setMatricula(699111);
		
		Aluno aluno12 = new Aluno();	
		aluno12.setNome("Bruno");
		aluno12.setMatricula(229111);
		
		Aluno aluno13 = new Aluno();	
		aluno13.setNome("Caio");
		aluno13.setMatricula(666111);
		
		Aluno aluno14 = new Aluno();	
		aluno14.setNome("Rodrigo");
		aluno14.setMatricula(633331);
		
		turma3.addAluno(aluno4);
		turma3.addAluno(aluno5);
		turma3.addAluno(aluno6);
		turma3.addAluno(aluno7);
		turma3.addAluno(aluno8);
		turma3.addAluno(aluno9);
		turma3.addAluno(aluno10);
		turma3.addAluno(aluno11);
		turma3.addAluno(aluno12);
		turma3.addAluno(aluno13);
		turma3.addAluno(aluno14);
		
		System.out.println(turma3.gerarPauta());
		
		turma3.abrirTurma();
		
		
		
		
		
		

	}

}
