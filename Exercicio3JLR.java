/*Solicitar a idade de várias pessoas e imprimir:
- Total de pessoas com menos de21 anos.
- Total de pessoas com mais de 50 anos.
O programa termina quando idade for =-99. (WHILE)*/


package br.com.gereration.repeticao;

import java.util.Scanner;

public class Exercicio3JLR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade=0, cont21=0, cont50=0;
		
		
		
		while (idade != -99) {
			System.out.print("Informe sua idade: ");
			idade = ler.nextInt();
			
			if (idade<=21) {
				cont21++ ;
			}
			else if (idade>=50) {
				cont50++;
							
			} 
		}
		
		
		
		System.out.println("O total de pessoas com menos de 21 anos é:" + cont21 + "\nE o total de pessoas com mais de 50 é: " + cont50);
		ler.close();
		}	
		}
		

	


