/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

package br.com.gereration.vetor;

import java.util.Scanner;

public class Exercicio2JVT {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] lance = new int[10];
		int media = 0, maiorPonto = 0, soma = 0, contador = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o resultado da " + (i + 1) + "� Jogada: ");
			lance[i] = ler.nextInt();

			if (lance[i] >= maiorPonto) {

				if (lance[i] > maiorPonto) {
					contador = 1;
				}
			}
			if (lance[i] == maiorPonto) {
				contador++;

			} else {
				maiorPonto = lance[i];

			}
			soma = soma + lance[i];
			media = soma / 10;

		}

		System.out.println("\nA m�dia de lances foi de " + media);
		System.out.println("\nE o maior lan�amento registrado foi " + maiorPonto + ", rolado um total de " + contador + " vezes");
		ler.close();
	}
}
