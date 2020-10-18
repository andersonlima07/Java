package EncapsulamentoHerenca;

public class Vendedor1 extends Pessoa1
{

	private float valorVendas; 
	private int comissao;
	private float salario;
	public Vendedor1 (String nome, String endereco, String telefone, float totalVendas, float salario, int comissao) 
	{
		super(nome, endereco, telefone);
		this.valorVendas = totalVendas;
		this.salario = salario;
		this.comissao = comissao;
	}
	
	public float totalComissao() {
		float total = salario + (valorVendas*((float) comissao/100));
		return total;
	}
	public void infoVendedor() {
		System.out.print("Vendedor(a) "+getNome()+" vendeu um total de "+valorVendas+" , de comissão receberá "+comissao+"%. E seu salário comissionado é de: "+totalComissao());
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}