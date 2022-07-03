#include <stdio.h>
#include <math.h>

float triangulo(float, float);

int main(){
	float base, altura, calculo;
	
	printf("Qual a base? ");
	scanf("%f", &base);
	
	printf("Qual a altura? ");
	scanf("%f", &altura);
	
	calculo = triangulo(base, altura);
	printf("\nA área do triangulo é %.2f", calculo);
	
	return 0;
}

float triangulo(float base, float altura){
	float area;
	area = (base * altura) / 2;
	return area;
}

