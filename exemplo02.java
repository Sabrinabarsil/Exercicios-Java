package br.com.generation.condicional;

import java.util.Locale;
import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		double num1, num2, resultado=0.0;
		char operacao;
		
		System.out.print("Digite o 1� numero ");
		num1 = entrada.nextDouble();
		
		System.out.print(" Digite a opera��o ");
		operacao = entrada.next().charAt(0);
		
		System.out.print("Digite o 2� numero ");
		num2 = entrada.nextDouble();
		
		if(operacao== '+') {
			resultado = num1 + num2;
		}
		else if (operacao=='-') {
				resultado = num1 - num2;
			}
		else if (operacao=='*') {
			resultado = num1 * num2;
		}
		else if (operacao=='/') {
			resultado = num1 / num2;
		}
		else {
			System.out.print("Opera��o Invalida");
		}
		System.out.print("Resultado: " + resultado);
		entrada.close();
	}
	
	

}
