package PacoteJava;

import java.util.Scanner;

public class LacoDecisao04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		Scanner ler = new Scanner(System.in);
		int num;
		double raizQuadrada, potenciacao;
		
		System.out.printf("Digite um n�mero: ");
		num = ler.nextInt();
		
		if(num % 2 == 0)
		{
			raizQuadrada = Math.sqrt(num);
			System.out.printf("O n�mero %d � PAR, e sua raiz quadrada �: %.2f", num, raizQuadrada);
		} else {
			potenciacao = Math.pow(num, 2);
			System.out.printf("O n�mero %d � �MPAR, e sua pot�ncia �: %.2f", num, potenciacao);
		}
	}

}
