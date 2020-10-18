package Polimorfismo;

public class AnimalMain {
	public static void main (String args[]) 
	{
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Dog");
		cachorro.setIdade(10);
		cachorro.setSom("AuAuAu");
		cachorro.setCorrer("Correr");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Horse");
		cavalo.setIdade(18);
		cavalo.setSom("rinnn");
		cavalo.setCorrer("Correr");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Sloth");
		preguica.setIdade(5);
		preguica.setSom("Zzzzz...");
		preguica.setSubir("Subir em árvores");
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal giro: animais) /*SUPER CLASSE, VARIAVEL DE LOOP E OBJETO*/
		{
			System.out.println(giro.getNome()+"\n");
		}
	}
}
