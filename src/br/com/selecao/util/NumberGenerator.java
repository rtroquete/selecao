package br.com.selecao.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase para gerar numeros sequenciais de 5 algarismos sem repetição
 */
public class NumberGenerator {

	public Integer geraProximoNumero(int inicial) {
		int[] arr = numero2Array(inicial);

		while (temDuplicados(arr) || temNumeroPar(arr)) {
			inicial++;
			arr = numero2Array(inicial);
		}

		return inicial;
	}

	private boolean temDuplicados(int[] items) {
		Set<Integer> appeared = new HashSet<>();
		for (int item : items)
			if (!appeared.add(item)) return true;
		return false;
	}

	private boolean temNumeroPar(int[] items) {
		for (int i = 0; i < 5; i++)
			if (items[i] % 2 == 0)
				return true;

		return false;
	}

	private int[] numero2Array(int number) {
		String temp = Integer.toString(number);
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++)
			arr[i] = Integer.parseInt(Character.toString(temp.charAt(i)));
		
		return arr;
	}

}
