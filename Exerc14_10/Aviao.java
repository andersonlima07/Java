package Testes;

public class Aviao {
	public String linhaAerea;
	double velocidade;
	double altitude;
	public String capacidadePassageiros;


	void decolar()
	{
		System.out.println("Apertem os cintos. Vamos decolar!");
	}
	void subir(double quantiAltura)
	{
		double subir = this.altitude+quantiAltura;
		this.altitude = subir;
		System.out.printf("%s informa, nesse voo de capacidade total: %s passageiros, vamos aumentar nossa altitude. Nova altitude: %.2f \n", linhaAerea, capacidadePassageiros, altitude);
	}
	void descer(double quantiAltura)
	{
		double descer = this.altitude-quantiAltura;
		this.altitude = descer;
		System.out.printf("%s informa, nesse voo de capacidade total: %s passageiros, vamos diminuir nossa altitude. Nova altitude: %.2f \n", linhaAerea, capacidadePassageiros, altitude);
	}
	void acelerar(double quantiVelocidade)
	{
		double acelerar = this.velocidade+quantiVelocidade;
		this.velocidade = acelerar;
		System.out.printf("%s informa, nesse voo de capacidade total: %s passageiros, vamos acelerar. Nova velocidade: %.2f \n", linhaAerea, capacidadePassageiros, velocidade);
	}
	void freiar(double quantiVelocidade)
	{
		double descer = this.velocidade-quantiVelocidade;
		this.velocidade = descer;
		System.out.printf("%s informa, nesse voo de capacidade total: %s passageiros, vamos frear. Nova velocidade: %.2f \n", linhaAerea, capacidadePassageiros, velocidade);
	}
}
