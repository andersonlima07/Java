package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Estoque
{
	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public static void main(String args[]) {

		int opc;
		String product;
		Collection<String> estoque = new ArrayList();
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das opções a seguir: " + "\n1) Adicionar um produto do estoque"
				+ "\n2) Remover um produto do estoque" + "\n3) Atualizar um produto do estoque"
				+ "\n4) Mostrar estoque" + "\n0) Sair");

		opc = ler.nextInt();
		do {
			if (opc == 1) {
				System.out.println("Digite o produto que deseja adicionar? ");
				product = ler.next();
				estoque.add(product);
			} else if (opc == 2) {
				System.out.println("Digite o produto que deseja remover? ");
				product = ler.next();
				estoque.remove(product);
			} else if (opc == 3) {
				System.out.println("Digite o produto que deseja atualizar/substituir?");
				product = ler.next();
				if (estoque.contains(product)) {
					estoque.remove(product);
					System.out.println("\nDigite o novo produto:");
					product = ler.next();
					estoque.add(product);
				}
			} else if (opc == 4) {
				System.out.println(estoque);
			} else {
				System.out.println("Opção inválida");
			}
			System.out.println("Escolha uma nova opção: ");
			opc = ler.nextInt();
		} while (opc != 0);

	}
}