package T10;

import java.util.Scanner;

public class ConverterDias {
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int dias,meses,anos,totalDias;
		System.out.println("Sistema conversor de anos, meses e dias em dias corridos.");
		System.out.println("Insira os anos: ");
		anos =ler.nextInt();
		System.out.println("Insira os meses: ");
		meses =ler.nextInt();
		System.out.println("Insira os dias: ");
		dias =ler.nextInt();
		totalDias = anos*365+meses*30+dias;
		System.out.println("O total de dias é: ");
		System.out.println(totalDias);
		
		
		
	}

}
