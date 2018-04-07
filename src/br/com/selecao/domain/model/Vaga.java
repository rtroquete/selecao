package br.com.selecao.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vaga {

	private String nome;
	private List<Candidato> candidatos = new ArrayList<>();
	
	public Vaga(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionaCandidadato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public Candidato buscarPelaPosicao(int posicao) {
		return candidatos.stream().collect(Collectors.toList()).get(posicao);
	}

}
