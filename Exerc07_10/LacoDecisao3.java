package PacoteJava;

import java.util.Scanner;

public class LacoDecisao3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>= 10 && idade <= 14) 
		{
			System.out.printf("Sua idade �: %d, e voc� est� na categoria: INFANTIL", idade);
		}
		else if(idade >= 15 && idade <= 17) 
		{
			System.out.printf("Sua idade �: %d, e voc� est� na categoria: JUVENIL", idade);
		}
		else if(idade >= 18 && idade <= 25) 
		{
			System.out.printf("Sua idade �: %d, e voc� est� na categoria: ADULTOS", idade);
		}
		else {
			System.out.printf("Voc� digitou uma idade inv�lida...");
		}
	}

}
