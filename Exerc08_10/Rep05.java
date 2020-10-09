package PacoteJava;

import java.util.*;

public class Rep05 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		do 
		{
			soma = soma + num;
			System.out.print("Digite um número: ");
			num = ler.nextInt();
		
		}while(num !=0);
		System.out.print("\nA soma de todos os números é: "+ soma);
		
	}
}
