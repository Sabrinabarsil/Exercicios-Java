package br.com.gereration.repeticao;
import java.util.Scanner;
public class Exercicio6JLR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		int cont = 0;
		int num;
		int media=0;
		int soma=0;
		

		System.out.print("Digite 0 para encerrar o programa\n");
		
		do {
			System.out.print("Digite um numero inteiro: ");
			num = ler.nextInt();

			if (num %3==0 && num!= 0) {
				soma=soma+num;
				
				cont += 1;
				
		} while (num > 0);

		mult = soma / cont;

		System.out.print("A soma dos numeros inteiros é " + soma);
		System.out.print(" E a Média: " + media);
		
		
	}

}
