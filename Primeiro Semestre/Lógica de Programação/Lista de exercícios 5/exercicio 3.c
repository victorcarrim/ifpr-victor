#include <stdio.h>

int main (){
	
	float renda, calculo;
	
	printf("Imposto de Renda\n\n");
	printf("Digite o valor de sua renda: ");
	scanf("%f", &renda);
	
	if (renda<=2000.00){ //insenção
		printf("Isento");
	}
	
	else if (renda<=3000.00){ //8% de imposto
		calculo = (renda - 2000.00) * 0.08;
		printf("R$ %.2f", calculo);
	}
		
	else if (renda<=4500.00){ //18% de imposto
		calculo = 1000 * 0.08 + (renda - 3000.00) * 0.18;  //insenção
		printf("R$ %.2f", calculo);
	}
	
	else { //28% de imposto
		calculo = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
		printf("R$ %.2f", calculo);
	}
	
	return 0;
}
