#include <stdio.h>
#include <math.h>

float triangulo(float, float);
float retangulo(float, float);
float circulo(float);

int main(){
	int seletor;
	float base, altura, raio, calculo;
	
	printf("Calculo de Áreas");
	printf("\n\n1: Calculo de de triângulo\n2: Calculo de área de retângulo\n3: Calculo de área de circunferência");
	printf("\n\nQual calculo deseja fazer?");
	
	scanf("%d", &seletor);
	
	switch(seletor){
		
		case 1:
			printf("\n\nQual a base? ");
			scanf("%f", &base);
		
			printf("Qual a altura? ");
			scanf("%f", &altura);
		
			calculo = triangulo(base, altura);
			printf("\nA área do triangulo é %.2f", calculo);
			
			break;
			
		case 2:
			printf("\n\nQual a base? ");
			scanf("%f", &base);
	
			printf("Qual a altura? ");
			scanf("%f", &altura);
	
			calculo = retangulo(base, altura);
			printf("\nA área do retângulo é %.2f", calculo);
			
			break;
			
		case 3:
			printf("\n\nQual o raio do círculo? ");
			scanf("%f", &raio);
	
			calculo = circulo(raio);
			printf("\nA área da círculo é %.2f", calculo);
			
			break;
			
		default:
			break;
		}
	
	return 0;
}

float triangulo(float base, float altura){
	float area;
	area = (base * altura) / 2;
	return area;
}

float retangulo(float base, float altura){
	float area;
	area = base * altura;
	return area;
}

float circulo(float raio){
	float area;
	area = 3.14 * pow(raio, 2);
	return area;
}
