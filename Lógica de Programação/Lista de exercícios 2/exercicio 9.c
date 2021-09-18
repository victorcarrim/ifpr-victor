#include <stdio.h>

int main (){
	
	int numpeca1, numpeca2, quantidadepeca1, quantidadepeca2;
	float valorpeca1, valorpeca2, valorfinal;
	
	printf("Loja de Roupas\n\nDigite o numero da peca A, quantidade a ser comprada e o valor unitario da peca: ");
	scanf("%d %d %f", &numpeca1, &quantidadepeca1, &valorpeca1);
	
	printf("Digite o numero da peca B, quantidade a ser comprada e o valor unitario da peca: ");
	scanf("%d %d %f", &numpeca2, &quantidadepeca2, &valorpeca2);
	
	valorfinal = (quantidadepeca1 * valorpeca1) + (quantidadepeca2 * valorpeca2);
	
	printf("\nVALOR A PAGAR = %.2f", valorfinal);
	
	return 0;
}
