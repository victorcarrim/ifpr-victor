#include <stdio.h>
#include <math.h>

float circulo(float);

int main(){
	float raio, calculo;
	
	printf("Qual o raio do círculo? ");
	scanf("%f", &raio);
	
	calculo = circulo(raio);
	printf("\nA área da círculo é %.2f", calculo);
	
	return 0;
}

float circulo(float raio){
	float area;
	area = 3.14 * pow(raio, 2);
	return area;
}
