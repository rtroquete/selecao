package br.com.selecao.domain.model;

import java.util.List;

public class Empresa {

	private String nome;
	private List<Vaga> vagas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

}
