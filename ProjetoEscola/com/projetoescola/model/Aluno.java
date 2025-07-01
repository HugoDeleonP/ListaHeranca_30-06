package com.projetoescola.model;

public class Aluno extends Pessoa{
	protected int serie;
	
	public Aluno(String nome, String email, int serie) {
		super(nome, email);
		this.serie = serie;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public void mostrarDados() {
		mostrarDados();
		System.out.println("|" + "Série: " + serie);
	}
}
