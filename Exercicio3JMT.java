package br.com.gereration.vetor;

import java.util.Scanner;

public class Exercicio3JMT {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] M1 = new double[4][6];
		double[][] M2 = new double[4][6];
		int i = 1, soma, subtracao;
		
		System.out.println("Matriz N1");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("Informe os valores da Matriz n1 %d %d: " ,l,c);
				n1[i][i] = ler.nextDouble();
			}

		}
		System.out.println("Matriz N2");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("Informe os valores da Matriz n2 %d %d: " ,l,c);
				n2[i][i] = ler.nextDouble();
			}

		}
		System.out.print("\nSoma Matriz M1 \n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				M1[l][c] = n1[l][c] + n2[l][c];
				System.out.print(M1[l][c] + "|");
			}

		}

		System.out.print("\nSubtração Matriz M2 \n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				M2[l][c] = n1[l][c] - n2[l][c];
				System.out.print(M1[l][c] + "|");
			}
		}
	}
}
