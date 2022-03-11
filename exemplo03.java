package br.com.generation.condicional;

import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		// switch case -- bom para menus
		Scanner entrada = new Scanner (System.in);

		
		System.out.print("Escreva uma letra entre A e D");
		String letra = entrada.next();
		
		switch(letra){
		case "a"  :
			System.out.print("Ana");
			break;
		case "A":
			System.out.print("Ana");
			break;
		case "b":
			System.out.print("Bruno");
			break;
		case "B":
			System.out.print("Bruno");
			break;
		case "c":
			System.out.print("Carlotta");
			break;
		case "C":
			System.out.print("Carlotta");
			break;
		case "d":
			System.out.print("Diana");
			break;
		case "D":
			System.out.print("Diana");
			break;
		default:
			 System.out.print("opção invalida");
		break;
		}
		entrada.close();
	}
		
}
