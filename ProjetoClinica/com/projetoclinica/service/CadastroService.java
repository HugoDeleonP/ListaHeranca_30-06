package com.projetoclinica.service;
import java.util.ArrayList;
import com.projetoclinica.model.*;
import com.projetoclinica.view.Viewer;

public class CadastroService {
	ArrayList <Pessoa> pessoas;
	ArrayList <Paciente> pacientes;
	ArrayList <Medico> medicos;
	
	public CadastroService() {
		pessoas = new ArrayList<>();
		pacientes = new ArrayList<>();
		medicos = new ArrayList<>();
	}
	
	public void managerUser(int keyUser, Viewer viewer) {
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
	
	public void managerTypeUser(int keyTypeUser, Viewer viewer) {
		Pessoa novaPessoa = cadastroPessoa(viewer);
		switch(keyTypeUser) {
		case 1 ->{
			cadastroMedico(viewer, novaPessoa);
		}
		
		case 2 ->{
			cadastroPaciente(viewer, novaPessoa);
		}
		
		default ->{
			viewer.digitoInvalido();
		}
		}
	}
	
	public Medico cadastroMedico(Viewer viewer, Pessoa novaPessoa) {
		String nome = novaPessoa.getNome();
		String telefone = novaPessoa.getTelefone();
		String especialidade = viewer.writeEspecialidade();
		
		Medico novoMedico = new Medico(nome, telefone, especialidade);
		
		medicos.add(novoMedico);
		pessoas.add(novoMedico);
		
		return novoMedico;
	}
	
	public Paciente cadastroPaciente(Viewer viewer, Pessoa novaPessoa) {
		String nome = novaPessoa.getNome();
		String telefone = novaPessoa.getTelefone();
		String planoSaude = viewer.writePlanoSaude();
		
		Paciente novoPaciente = new Paciente(nome, telefone, planoSaude);
		
		pacientes.add(novoPaciente);
		pessoas.add(novoPaciente);
		
		return novoPaciente;
	}
	
	public Pessoa cadastroPessoa(Viewer viewer) {
		String nome = viewer.writeNome();
		String telefone = viewer.writeTelefone();
		
		Pessoa novaPessoa = new Pessoa(nome, telefone);
		
		return novaPessoa;
	}
	
	public void listarPessoas(Viewer viewer) {
		viewer.interfaceMedico();
		for(Medico MedicoUnit: medicos) {
			
			viewer.listarMedico(MedicoUnit);
		}
		viewer.interfacePaciente();
		for(Paciente PacienteUnit: pacientes) {
			
			viewer.listarPaciente(PacienteUnit);
		}
	}

}
