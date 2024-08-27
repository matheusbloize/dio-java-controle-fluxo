package com.matheusbloize.dio.lab;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int parametroUm, parametroDois;

		System.out.println("Digite o primeiro parâmetro: ");
		parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		parametroDois = input.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		} finally {
			input.close();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}
}
