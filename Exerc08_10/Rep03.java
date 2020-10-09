package PacoteJava;

import java.util.*;

public class Rep03 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade, jovem = 0,idoso = 0;
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99)
		{
			if(idade < 21) {
				jovem++;
			}
			if(idade > 50) {
				idoso++;
			}
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("Ao todo são "+jovem+" pessoas com menos de 21 anos e ");
		System.out.printf(idoso+" pessoas com mais de 50 anos. ");
	}
}
