
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package br.com.generation.condicional;

import java.util.Scanner;

public class Exercico1JLC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Abaixo informe 3 numero INTEIROS de sua prefer�ncia: ");

		System.out.print("1 � valor: ");
		n1 = scan.nextInt();
		System.out.print("2� valor: ");
		n2 = scan.nextInt();
		System.out.print("3 � valor: ");
		n3 = scan.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			System.out.println("O maior numero �: " + n1);
		}

		else if (n2 >= n1 && n2 >= n3) {
			System.out.println("O maior numero �: " + n2);
		} else {
			System.out.println("O maior numero �: " + n3);
		}

		scan.close();

	}
}
