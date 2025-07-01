package com.projetoclinica.model;

public class Paciente extends Pessoa{
	private String planoSaude;
	
	public Paciente(String nome, String telefone, String planoSaude) {
		super(nome, telefone);
		this.planoSaude = planoSaude;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	
}
