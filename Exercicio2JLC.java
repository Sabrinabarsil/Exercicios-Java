package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio2JLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Abaixo informe 3 numero de sua prefer�ncia: ");

		System.out.println("Valores: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println("1� Os numeros em ordem crescente s�o: " + n1+" " + n2 + " "+ n3);
		} 
		else if (n1 <= n3 && n3 <= n2) {
			System.out.println("2� Os numeros em ordem crescente s�o: " + n1+" "+n3+" "+n2);
		} 
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("3� Os numeros em ordem crescente s�o: " + n2+" "+n1+" "+n3);
		} 
		else if (n2 <= n3 && n3 <= n1) {
			System.out.println("4� Os numeros em ordem crescente s�o: " + n2+" "+n3+" "+n1);
		} 
		else if (n3 <= n1 && n1 <= n2) {
			System.out.println("5� Os numeros em ordem crescente s�o: " + n3+" "+n1+" "+n2);
		}
		else {
			System.out.println("6� Os numeros em ordem crescente s�o \n" + n3+" "+n2+" "+n1);
		}
		
		
		scan.close();
	}

}
