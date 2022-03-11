package br.com.gereration.vetor;


import java.util.Scanner;
public class Exercicio1JVT {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] notaVetor = new int[5];
		int maiorPonto = 0;

		System.out.println("MODALIDADE: Ginastica Ritimica");
		System.out.println("Nota dos jurados");
		for (int i = 1; i < 5; i++) {
			System.out.println("Insira a nota do "+ i + "º jurado:" );
			notaVetor[i] = ler.nextInt();
			if(notaVetor [i] > maiorPonto) {
				maiorPonto= notaVetor[i];
				
			}
		}
		
		System.out.println("A maior pontuação recebida foi " + maiorPonto);
	
	ler.close();
	}
	
	
	

}
