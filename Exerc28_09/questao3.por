programa
{
	funcao br() {
        escreva ("\n")
    }
	funcao inicio()
	{
		real nota1,nota2,nota3, res
		
		escreva("Este é um programa que calcula a média ponderada de notas.");
		br()
		escreva("Insira a primeira nota: ");
		leia(nota1);
		
		escreva("Insira a segunda nota: ");
		leia(nota2);
		
		escreva("Insira a terceira nota: ");
		leia(nota3)
		
		res= ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		escreva("Sua média ponderada é: ", res);
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */