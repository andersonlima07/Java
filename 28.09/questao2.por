programa
{
	funcao br() {
        escreva ("\n")
    }
	funcao inicio()
	{
		inteiro diasTotal,anos,meses,dias;
		escreva("Este é um programa que transforma seus dias vívidos em anos, meses e dias. Insira a quantidade de dias vivídos: ");
		leia(diasTotal);
		br();
		anos=diasTotal/365;
		meses= (diasTotal%365)/30;
		dias= (diasTotal%365)%30;

		escreva("Você viveu ", anos, " anos, ", meses, " meses, ", dias, " dias.");
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */