programa
{
	
	funcao inicio()
	{
			inteiro totalSegundos,hora,minuto,segundo;
			escreva("Insira o tempo de duração do evento em segundos: ");
			leia(totalSegundos);

			hora = totalSegundos/3600;
			minuto = (totalSegundos%3600) / 60;
			segundo = (totalSegundos%3600)%60;

			escreva(hora,":",minuto,":",segundo);
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */