package com.projetoescola.model;

public class Professor extends Pessoa{
	protected String disciplina;
	
	public Professor(String nome, String email, String disciplina) {
		super(nome, email);
		this.disciplina = disciplina;
	}

	public String getDiscplina() {
		return disciplina;
	}

	public void setDiscplina(String discplina) {
		this.disciplina = discplina;
	}
	
	public void mostrarDados() {
		mostrarDados();
		System.out.println("| " + "Disciplina: " + disciplina);
	}
}
