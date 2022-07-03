#include <stdio.h>

void areaImpressa(float x, float y){
	float area;
	
	area = x * y;
	
	printf("\nA área do retângulo é %.2f\n\n", area);
}

float areaNaoImpressa(float x, float y){
	float area;
	
	area = x * y;
	
	return area;
}

float soma(float x, float y){
	float soma;
	
	soma = x + y;
	
	return soma;
}

float multiplica(float x, float y){
	float multiplica;
	
	multiplica = x * y;
	
	return multiplica;
}

float subtracao(float x, float y){
	float subtrai;
	
	subtrai = x - y;
	
	return subtrai;
}

float divisao(float x, float y){
	float divisao;
	
	divisao = x / y;
	
	return divisao;
}

float calculadora(float x, float y, char z){
	float resultado;
	
	if(z == '+'){
		resultado = soma(x,y);
		return resultado;
	} else if(z == '-'){
		resultado = subtracao(x,y);
		return resultado;
	} else if(z == '*'){
		resultado = multiplica(x,y);
		return resultado;
	} else if(z == '/'){
		resultado = divisao(x,y);
		return resultado;
	}
}

int main(){
	char operacao;
	float a, b;
	float calculo;
	int menu1 = 1;
	
	while(menu1 != 0){
		printf("-------- OPERAÇÕES COM FUNÇÕES --------\n\n");
		printf("[0] - sair\n[1] - Área do retângulo com impressão na função\n[2] - Área do retângulo com impressão no programa principal\n[3] - Calculadora\n\n");
		printf("Selecione o menu desejado: ");
		scanf("%d", &menu1);
		
		switch(menu1){
			case 1:
				printf("\n\n---------- ÁREA DO RETÂNGULO ----------\n\n");
				printf("Insira a base do retângulo: ");
				scanf("%f", &a);
				printf("\nInsira a altura do retângulo: ");
				scanf("%f", &b);
				
				areaImpressa(a, b);
				break;
				
			case 2:
				printf("\n\n---------- ÁREA DO RETÂNGULO ----------\n\n");
				printf("Insira a base do retângulo: ");
				scanf("%f", &a);
				printf("\nInsira a altura do retângulo: ");
				scanf("%f", &b);
				
				calculo = areaNaoImpressa(a, b);
				
				printf("\nA área do retângulo é %.2f\n\n", calculo);
				break;
				
			case 3:
				printf("\n\n------------- CALCULADORA -------------\n\n");
				printf("Insira o primeiro valor: ");
				scanf("%f", &a);
				printf("\nInsira o segundo valor: ");
				scanf("%f", &b);
				printf("\n\nOPERAÇÃO ---------- SELETOR\n");
				printf("SOMA     ----------    +\nSUBTRAÇÃO ---------    -\nMULTIPLICAÇÃO -----    *\nDIVISÃO  ----------    /\n");
				printf("\nInsira o seletor da opeção: ");
				scanf("%s", &operacao);
				calculo = calculadora(a, b, operacao);
				printf("\n\nResultado da operação: %.2f\n\n\n", calculo);
				break;
				
				
			default:
				break;
		}
	}
	
	return 0;
} 
