#include <stdio.h>

int main (){
	
	float salario, reajuste;
	
	printf("Aumento de Salario\nEntre com seu salario: ");
	scanf("%f" &salario);
	
	if (0 < salario < 400.00){
		reajuste = salario * 15%;
		printf("%f", reajuste);}
		
		return 0;
	}
