package br.com.generation.condicional;

import java.util.Scanner;
public class Exercicio4JLC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double A;

		System.out.print("Entre com um valor Num�rico: ");
		A = scan.nextDouble();
		
		if(A %2 == 0) {
			System.out.printf(A +" � par e sua raiz quadrada � " + Math.sqrt(A));
			
		}
		else {
			System.out.printf(A + " � impar e o seu quadrado vale " + Math.pow(A, 2));
			
		}
		
		scan.close();
	}

}
