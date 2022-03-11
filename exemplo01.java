package br.com.generation.condicional;

import java.util.Scanner;

public class exemplo01 { //inicio da classe do programa

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println(" Digite a primeira Nota");
		nota1 = leia.nextDouble();
		
		System.out.println(" Digite a segunda Nota");
		nota2 = leia.nextDouble();

		
			
		media = (nota1 + nota2)/2;
		
		if( media > 7) {// Aqui entra a condição a ser atendida
			System.out.println(" Aluno aprovado, a média foi: " + media);	
		} else {
			System.out.println(" Aluno aprovado, a média foi: " + media);
			// tentar inserir else if reprovado
		}
		leia.close();
	} 

}
