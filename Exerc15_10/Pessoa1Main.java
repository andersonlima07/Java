package EncapsulamentoHerenca;

public class Pessoa1Main {
	public static void main(String args[])
	{
		/*TESTANDO FORNECEDOR*/
		Fornecedor1 anderson = new Fornecedor1("Anderson", "Rua 123", "1197777-7777", 2000, 1500);
		Fornecedor1 vinicius = new Fornecedor1("Vinicius", "Rua 456", "1198888-8888", 2500, 1737);
		
		anderson.mostrarInfo();
		vinicius.addSobrenome("Jesus Santos");
		System.out.println(vinicius.getNome());
		System.out.println(anderson.getNome());
		System.out.println(vinicius.getEndereco());
		System.out.println(anderson.getTelefone());
		/*______________________________________________________*/
		/*TESTANDO VENDEDOR*/
		Vendedor1 vanessa = new Vendedor1("Vanessa", "Rua 7777","1199999-7777", 2500, 1800, 10);
		
		vanessa.infoVendedor();
		
		
		
		
	}
}