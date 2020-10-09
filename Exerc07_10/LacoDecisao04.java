package PacoteJava;

import java.util.Scanner;

public class LacoDecisao04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		Scanner ler = new Scanner(System.in);
		int num;
		double raizQuadrada, potenciacao;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0)
		{
			raizQuadrada = Math.sqrt(num);
			System.out.printf("O número %d é PAR, e sua raiz quadrada é: %.2f", num, raizQuadrada);
		} else {
			potenciacao = Math.pow(num, 2);
			System.out.printf("O número %d é ÍMPAR, e sua potência é: %.2f", num, potenciacao);
		}
	}

}
