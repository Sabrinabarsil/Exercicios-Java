1/*Ler 10 números e imprimir quantos são 
 pares e quantos são ímpares. (FOR)*/

package br.com.gereration.repeticao;

import java.util.Scanner;

public class Exercicio2JLR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = 10, contPar = 0, contImpar = 0;

		for (int i = 1; i < 11; i++) {
			System.out.print("Informe o " + i + "º numero: ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;

			}
		}
		
		System.out.println("Foram digitados " + contPar + " numeros Pares. E " + contImpar + " números ímpares");
		
	}
}
