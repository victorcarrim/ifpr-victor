#include <stdio.h>

int main (){
	
	int numa, numb, prod;
	
	printf("Calculadora de Produto\nDigite os valores de A e B: ");
	
	scanf("%d %d" ,&numa ,&numb);
	
	prod = numa * numb;
	
	printf("\nResultado\nPROD = %d" ,prod);
	
	return 0;
}
