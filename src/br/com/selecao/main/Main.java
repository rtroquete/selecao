package br.com.selecao.main;

import java.util.Scanner;

import br.com.selecao.config.Initializer;
import br.com.selecao.domain.model.Candidato;
import br.com.selecao.domain.model.Vaga;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		Vaga vaga = new Initializer().initVagas("Vaga Corretor");

		boolean deveEncerrar = false;

		while (!deveEncerrar) {
			System.out.println("Insira a posição que deseja buscar o candidato: ");

			int posicao = sc.nextInt();
			Candidato candidato = vaga.buscarPelaPosicao(posicao -1);

			System.out.println("Nome: " + candidato.getNome());
			System.out.println("Numero: " + candidato.getNumero());
			System.out.println("");
			System.out.println("Deseja encerrar? S=SIM N=NAO");

			String encerra = sc.next();

			if ("S".equalsIgnoreCase(encerra)) deveEncerrar = true;
		}

		System.out.println("FIM");

	}

}
