#include <stdio.h>

int main (){
	
	float numa, numb, soma;
	
	printf("Calculadora de Soma\n");
	
	printf("Digite o valor de A: ");
	scanf("%f" ,&numa);
	
	printf("Digite o valor de B: ");
	scanf("%f" ,&numb);
	
	soma = numa + numb;
	
	printf("\nResultado\n");
	printf("SOMA = %.0f" ,soma);
	
	return 0;
}
