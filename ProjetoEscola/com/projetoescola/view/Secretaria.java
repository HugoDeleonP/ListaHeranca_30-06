package com.projetoescola.view;

import java.util.Scanner;
import com.projetoescola.model.*;

public class Secretaria {
	
	Scanner input;
	
	public Secretaria() {
		input = new Scanner(System.in);
	}
	
	public int mainMenu() {
		System.out.println(" _________________________");
		System.out.println("|                         |");
		System.out.println("| 1 - Cadastro de pessoas |");
		System.out.println("|                         |");
		System.out.println("| 2 - Listagem de pessoas |");
		System.out.println("|_________________________|");
		int keyUser = input.nextInt();
		input.nextLine();
		
		return keyUser;
	}
	
	public int keyTypeUser() {
		System.out.println(" _________________________");
		System.out.println("|                         |");
		System.out.println("| 1 - Aluno               |");
		System.out.println("|                         |");
		System.out.println("| 2 - Professor           |");
		System.out.println("|_________________________|");
		int keyTypeUser = input.nextInt();
		input.nextLine();

		return keyTypeUser;
	}
	
	public void interfaceAluno() {
		System.out.println("==============Aluno=============");
	}
	
	public void interfaceProfessor() {
		System.out.println("============Professor===========");
	}


	public void listarAluno(Aluno aluno) {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Email: " + aluno.getEmail());
		System.out.println("Série: " + aluno.getSerie() + "\n");
	}
	
	public void listarProfessor(Professor professor) {
		System.out.println("Nome: " + professor.getNome());
		System.out.println("Email: " + professor.getEmail());
		System.out.println("Disciplina: " + professor.getDiscplina() + "\n");
	}
	
	public String writeNome() {
		System.out.println("Digite o nome: ");
		String nome = input.nextLine();
		
		return nome;
	}
	
	public String writeEmail() {
		System.out.println("Digite o email: ");
		String email = input.nextLine();
		
		return email;
	}
	
	public String writeDisciplina() {
		System.out.println("Digite a disciplina: ");
		String disciplina = input.nextLine();
		
		return disciplina;
	}
	
	public int writeSerie() {
		System.out.println("Digite a série: ");
		int serie = input.nextInt();
		
		return serie;
	}
	
	public void digitoInvalido() {
		System.out.println("Dígito inválido");
		System.out.println("Por favor, digite um corresponde à legenda");
	}

}
