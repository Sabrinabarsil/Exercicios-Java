package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio3JLC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade;

		System.out.print("Informe a idade do competidor: ");
		idade = scan.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("CATEGORIA INFANTIL");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("CATEGORIA JUVENIL");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("CATEGORIA ADULTO");
		}
		else{
			System.out.println("CANDIDATO NÃO TEM IDADE PARA COMPETIR NAS CATEGORIAS INFORMADAS");
					}
	scan.close();
	}
	

}
