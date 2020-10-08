programa
{
	funcao pula(){
        escreva("\n")
    }
	
	funcao inicio()
	
	{
		inteiro anos, meses, dias, totalDias;

		escreva("Insira aqui quantos anos você tem:");
		leia(anos);
		pula()
		escreva("Diga aqui quantos meses você tem desde seu último aniversário:");
		leia(meses);
		pula()
		escreva("E quantos dias tem de diferença desde o último dia de número igual ao dia do seu aniversário? Digite aqui:");
		leia(dias);
		pula()
		totalDias= (anos*365)+(meses*30)+dias;
		escreva("Você viveu até hoje ", totalDias, " dias.");
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */