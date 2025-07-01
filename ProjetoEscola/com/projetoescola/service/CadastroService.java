package com.projetoescola.service;
import java.util.ArrayList;

import com.projetoescola.model.*;
import com.projetoescola.view.Secretaria;

public class CadastroService {
	private ArrayList <Pessoa> pessoas;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	
	public CadastroService() {
		pessoas = new ArrayList<>();
		alunos = new ArrayList<>();
		professores = new ArrayList<>();
	}
	
		
	public void managerUser(int keyUser, Secretaria viewer) {
		switch(keyUser) {
		case 1 ->{
			int keyTypeUser = viewer.keyTypeUser();
			managerTypeUser(keyTypeUser, viewer);
		}
		
		case 2 ->{
			listarPessoas(viewer);
		}
		
		default -> {
			viewer.digitoInvalido();
		}
		}
	}
	
	public void managerTypeUser(int keyTypeUser, Secretaria viewer) {
		Pessoa novaPessoa = cadastroPessoa(viewer);
		switch(keyTypeUser) {
		case 1 ->{
			cadastroAluno(viewer, novaPessoa);
		}
		
		case 2 ->{
			cadastroProfessor(viewer, novaPessoa);
		}
		
		default ->{
			viewer.digitoInvalido();
		}
		}
	}
	
	public Aluno cadastroAluno(Secretaria viewer, Pessoa novaPessoa) {
		String nome = novaPessoa.getNome();
		String email = novaPessoa.getEmail();
		int serie = viewer.writeSerie();
		
		Aluno novoAluno = new Aluno(nome, email, serie);
		
		alunos.add(novoAluno);
		pessoas.add(novoAluno);
		
		return novoAluno;
	}
	
	public Professor cadastroProfessor(Secretaria viewer, Pessoa novaPessoa) {
		String nome = novaPessoa.getNome();
		String email = novaPessoa.getEmail();
		String disciplina = viewer.writeDisciplina();
		
		Professor novoProfessor = new Professor(nome, email, disciplina);
		
		professores.add(novoProfessor);
		pessoas.add(novoProfessor);
		
		return novoProfessor;
	}
	
	public Pessoa cadastroPessoa(Secretaria viewer) {
		String nome = viewer.writeNome();
		String email = viewer.writeEmail();
		
		Pessoa novaPessoa = new Pessoa(nome, email);
		
		return novaPessoa;
	}
	
	public void listarPessoas(Secretaria viewer) {
		viewer.interfaceAluno();
		for(Aluno alunoUnit: alunos) {
			
			viewer.listarAluno(alunoUnit);
		}
		viewer.interfaceProfessor();
		for(Professor professorUnit: professores) {
			
			viewer.listarProfessor(professorUnit);
		}
	}
	
	}
