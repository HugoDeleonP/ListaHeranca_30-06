package com.projetoclinica.model;

public class Medico extends Pessoa{
	private String especialidade;
	
	public Medico(String nome, String telefone, String especialidade) {
		super(nome, telefone);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
