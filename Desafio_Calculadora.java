package br.com.generation.condicional;

import java.util.Scanner;

public class Desafio_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);// Scanner: responsavel pela entrada de dados no programa

		double num1, num2, num3, num4;
		int cont;

		System.out.println("Informe o 1° valor ");// syso ctr+space
		num1 = scan.nextDouble(); // recebe o valor e manda para variavel

		System.out.println("Informe o 2º valor ");
		num2 = scan.nextDouble();

		System.out.println("Informe o que você deseja fazer ");
		System.out.println("(1) SOMAR");
		System.out.println("(2) SUBTRAIR");
		System.out.println("(3) MULTIPLICAR");
		System.out.println("(4) DIVIDIR");
		System.out.println("(5) RAIZ QUADRADA");
		
		cont = scan.nextInt();// relacionado as perguntas de cima

		switch (cont) { // switch vai verificar o que o cont esta recebendo
		case 1:
			num3 = num1 + num2;
			System.out.println(num3);
			break;

		case 2:
			num3 = num1 - num2;
			System.out.println(num3);
			break;

		case 3:
			num3 = num1 * num2;
			System.out.println(num3);
			break;

		case 4:
			num3 = num1 / num2;
			System.out.println(num3);
			break;
			
		case 5:
				num3 = Math.sqrt(num1);
				num4 = Math.sqrt(num2);
				System.out.println("Raiz quadrada de " + num1 + " é = "+num3+ "\nRaiz quadrada de " + num2 + " 2é = "+num4);
				
			break;

		default: // Caso o cont de switch não receba os valores determinados
			System.out.print("opção invalida, informe um valor valido");

		}
		scan.close();
	}
	
	}


