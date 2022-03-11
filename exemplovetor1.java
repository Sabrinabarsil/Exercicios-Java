package br.com.gereration.vetor;

public class exemplovetor1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] arrayvetor = new int [10];
			
			int numero= 900;
			int numero2= arrayvetor[9];
			
			arrayvetor[7] =6;
			arrayvetor[2] = 500;
			arrayvetor[4]= numero;
			arrayvetor[9] = 456;
			
			for(int i=0; i <=9; i++) {
				System.out.println(i+"-"+arrayvetor [i]++ );
				
			}
		System.out.println(numero2);
	}

}
