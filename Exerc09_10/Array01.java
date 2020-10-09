package PacoteJava;

public class Array01 {
	public static void main(String args[])
	{
			
		int[] A = {1, 0, 5, -2, -5, 7};		
		int soma;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("Soma das posições A[0], A[1] e A[5]: " + soma + "\n");
		
		A[4] = 100;
		
		for (int i : A)
		{
			System.out.println(i);
		}
		
		
	}
}
