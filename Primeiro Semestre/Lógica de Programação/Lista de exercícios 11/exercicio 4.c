#include <stdio.h>

float retangulo(float, float);

int main(){
	float base, altura, calculo;
	
	printf("Qual a base? ");
	scanf("%f", &base);
	
	printf("Qual a altura? ");
	scanf("%f", &altura);
	
	calculo = retangulo(base, altura);
	printf("\nA área do retângulo é %.2f", calculo);
	
	return 0;
}

float retangulo(float base, float altura){
	float area;
	area = base * altura;
	return area;
}

