#include <stdio.h>

int main (){
	
	int numa, numb, numc, numd, diferenca;
	
	printf("Calculadora de Diferenca\nEntre com A e B: ");
	scanf("%d %d", &numa, &numb);
	
	printf("Entre com C e D: ");
	scanf("%d %d", &numc, &numd);
	
	diferenca = (numa * numb) - (numc * numd);
	
	printf("\nResultado da diferenca de AB para CD\nDIFERENCA = %d", diferenca);
	
	return 0;
}
