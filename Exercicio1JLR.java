/*1- Informar todos os números de 1000 a 1999 
que quando divididos por 11 obtemos resto = 5. (FOR)*/



package br.com.gereration.repeticao;


public class Exercicio1JLR {

	public static void main(String[] args) {
		//O for é para atender ao "números entre 1000 e 1999"
		//a condição é para imprimir apenas os valores que, 
				//ao serem divididos por 11, deem 5.
		
		for(int i=1000; i <2000; i++) {
			if(i%11==5) {
				System.out.print(i+"-" );
				
			}
			
		}
		
	
	}

}
