package br.com.selecao.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.selecao.domain.model.Candidato;
import br.com.selecao.domain.model.Vaga;
import br.com.selecao.util.NumberGenerator;

public class Initializer {

	private int inicial = 13579;

	public Vaga initVagas(String nomeVaga) {
		final Vaga vaga = new Vaga(nomeVaga);
		final List<Candidato> candidatos = new ArrayList<>();

		for (int i = 0; i < 120; i++) {
			Candidato candidato = new Candidato("Candidato" + i);
			candidatos.add(candidato);
		}

		Collections.shuffle(candidatos);
		candidatos.forEach(candidato -> {
			Integer proximoNumero = new NumberGenerator().geraProximoNumero(inicial);
			candidato.setNumero(proximoNumero);
			vaga.adicionaCandidadato(candidato);
			inicial = proximoNumero + 1;
		});
		
		return vaga;
	}

}
