package com.projetoclinica.view;

import java.util.Scanner;
import com.projetoclinica.service.CadastroService;
import com.projetoclinica.model.*;

public class Viewer {
	Scanner input;
	
	public Viewer() {
		input = new Scanner(System.in);
	}
	
	public int mainMenu() {
		
		System.out.println("===================================================");
		System.out.println("| Escolha uma opção correspondente com a legenda: |");
		System.out.println("|                                                 |");
		System.out.println("| 1- Cadastrar                                    |");
		System.out.println("|                                                 |");
		System.out.println("| 2- Listar                                       |");
		System.out.println("===================================================");
		System.out.println("\n0- Sair");
		int keyUser = input.nextInt();
		
		return keyUser;
	}
	
	public int keyTypeUser() {
		System.out.println("===================================================");
		System.out.println("| Escolha um tipo de usuario:                     |");
		System.out.println("| 1 - Medico                                      |");
		System.out.println("|                                                 |");
		System.out.println("| 2 - Paciente                                    |");
		System.out.println("===================================================");
		int keyTypeUser = input.nextInt();
		input.nextLine();

		return keyTypeUser;
	}
	
	public void interfaceMedico() {
		System.out.println("=============Medico==============");
	}
	
	public void interfacePaciente() {
		System.out.println("=============Paciente============");
	}


	public void listarMedico(Medico Medico) {
		System.out.println("Nome: " + Medico.getNome());
		System.out.println("Telefone: " + Medico.getTelefone());
		System.out.println("Especialidade: " + Medico.getEspecialidade() + "\n");
	}
	
public void listarPaciente(Paciente Paciente) {
		System.out.println("Nome: " + Paciente.getNome());
		System.out.println("Telefone: " + Paciente.getTelefone());
		System.out.println("Plano de saúde: " + Paciente.getPlanoSaude() + "\n");
	}
	
	public String writeNome() {
		System.out.println("Digite o nome: ");
		String nome = input.nextLine();
		
		return nome;
	}
	
	public String writeTelefone() {
		System.out.println("Digite o telefone: ");
		String Telefone = input.nextLine();
		
		return Telefone;
	}
	
	public String writeEspecialidade() {
		System.out.println("Digite a especialidade: ");
		String especialidade = input.nextLine();
		
		return especialidade;
	}
	
	public String writePlanoSaude() {
		System.out.println("Digite o plano de saúde: ");
		String planoSaude = input.nextLine();
		
		return planoSaude;
	}
	
	public void digitoInvalido() {
		System.out.println("Dígito inválido");
		System.out.println("Por favor, digite um corresponde à legenda");
	}

}
