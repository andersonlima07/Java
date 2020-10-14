package Testes;

public class Cliente 
{
	String nome;
	String idade;
	String email;
	
	public Cliente (String nomeCliente, String idadeCliente,String emailCliente)
	{
		nome = nomeCliente;
		idade = idadeCliente;
		email = emailCliente;
	}
	public void Mostrar()
	{
		System.out.printf("Dados do cliente: \n Nome: %s \n Idade: %s \n Email: %s", nome,idade,email);
	}
}
