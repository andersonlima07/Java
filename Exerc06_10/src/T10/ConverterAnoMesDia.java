package T10;

import java.util.Scanner;

public class ConverterAnoMesDia {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int dias,meses,anos,totalDias;
		System.out.println("Conversor de dias em anos, meses e dias");
		System.out.println("Insira os dias: ");
		totalDias = ler.nextInt();
		anos = totalDias/365;
		meses = totalDias%365/30;
		dias = totalDias%365%30;
		
		System.out.println("O total de anos � "+anos);
		System.out.println("O total de meses � "+meses);
		System.out.println("O total de dias � "+dias);
		
	}

}
