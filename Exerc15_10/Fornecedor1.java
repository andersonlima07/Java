package EncapsulamentoHerenca;

public class Fornecedor1 extends Pessoa1 {
	private float valorCredito;
	private float valorDivida;

	public Fornecedor1 (String nome, String endereco, String telefone, float valorCredito, float valorDivida) 
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	public float obterSaldo() 
	{
		return valorCredito - valorDivida;
	}
}
