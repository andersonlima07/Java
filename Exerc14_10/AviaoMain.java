package Testes;

public class AviaoMain 
{
	public static void main(String args[])
	{
		Aviao aviao1 = new Aviao();
		aviao1.linhaAerea = "Gol";
		aviao1.capacidadePassageiros = "100";
		
		aviao1.decolar();
		aviao1.subir(20);
		aviao1.descer(10);
		aviao1.acelerar(15);
		aviao1.freiar(13);
	}

}
