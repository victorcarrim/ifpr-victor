#include <stdio.h>

int main (){
	
	int a, b;
	double resultado;
	
	printf("Lanches do Marcão\n\n");
	printf("1. Cachorro-Quente\n");
	printf("2. X-Salada\n");
	printf("3. X-Bacon\n");
	printf("4. Torrada simples\n");
	printf("5. Refrigerante\n\n");
	printf("Escolha uma opção: ");
	scanf("%d", &a);
	
	printf("\nDigite a quantidade a ser comprada: ");
	scanf("%d", &b);
	
	switch (a){
		
		case 1:
			resultado = b * 4;
			printf("\nTotal: R$ %.2f", resultado);
			break;
			
		case 2: 
			resultado = b * 4.5;
			printf("\nTotal: R$ %.2f", resultado);
			break;
			
		case 3:
			resultado = b * 5;
			printf("\nTotal: R$ %.2f", resultado);
			break;
			
		case 4:
			resultado = b * 2;
			printf("\nTotal: R$ %.2f", resultado);
			break;
			
		case 5:
			resultado = b * 1.5;
			printf("\nTotal: R$ %.2f", resultado);
			break;
			
		default:
			printf("\nProduto não existente no cardapio");
			break;
		}
	
	return 0;
}
