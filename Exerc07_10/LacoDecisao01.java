package PacoteJava;

import java.util.Scanner;

public class LacoDecisao01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numUm, numDois, numTres, maior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numUm = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numDois = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numTres = ler.nextInt();
		
		if(numUm > numDois && numUm > numTres) {
			maior = numUm;
		} else if(numDois > numUm && numDois > numTres) {
			maior = numDois;
		} else {
			maior = numTres;
		}
		
		System.out.printf("Maior n�mero: %d", maior);
	}

}
