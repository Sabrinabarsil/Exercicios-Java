package br.com.gereration.repeticao;

import java.util.Scanner;

public class Exercicio5JRL {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int soma = 0;
		int cont = 0;
		int num;
		int media;

		System.out.print("Digite 0 para encerrar o programa\n");
		
		do {
			System.out.print("Digite um numero inteiro: ");
			num = ler.nextInt();

			if (num != 0) {
				cont += 1;
				soma += num;
			}
		} while (num > 0);

		media = soma / cont;

		System.out.print("A soma dos numeros inteiros é " + soma);
		System.out.print(" E a Média: " + media);

	}

}
