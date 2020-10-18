package Polimorfismo;

public class Preguica extends Animal {
	private String subir; /*atributos*/
	
	/*construtor vazio*/
	public Preguica() 
	{
			
	}
	
	/*construtor padrao*/
	public String getNome() {
		return "Preguiça: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nMovimento: " + this.getSubir();
	}
	/*getters and setters*/
	public String getSubir() {
		return subir;
	}
	public void setSubir(String subir) {
		this.subir = subir;		
	}
}