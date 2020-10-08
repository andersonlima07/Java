package T10;

import java.util.Scanner;

public class TempoDuracao {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int segundosTotal,hora,minuto,segundo;
		System.out.println("Insira o tempo da duração em segundos: ");
		
		segundosTotal = ler.nextInt();
		
		hora=segundosTotal/3600;
		minuto=segundosTotal%3600/60;
		segundo=segundosTotal%3600%60;
		
		System.out.println("A duração do seu evento é "+hora+":"+minuto+":"+segundo);
		
	}
}
