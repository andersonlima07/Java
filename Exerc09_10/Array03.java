package PacoteJava;

import java.util.*;

public class Array03 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int[][] matriz = new int[3][3];
		int maiorDez=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for(int linha=0 ; linha<3 ; linha++) 
		{
			for(int coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: " , linha+1, coluna+1);
				matriz[linha][coluna] = entrada.nextInt();
				
				if (matriz[linha][coluna]>10)
				{
					maiorDez = maiorDez + 1;
				}
			}
		}
		
		System.out.println("Quantidade de valores da Matriz maiores que 10: " + maiorDez);
				
		
	}

}
