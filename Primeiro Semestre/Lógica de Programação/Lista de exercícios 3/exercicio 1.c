#include <stdio.h>
#include <math.h>

int main() {
	double raio,volume;
	
	printf("Calculadora de volume de esfera\nDigite o raio da esfera = ");
	scanf("%lf", &raio);
	
	volume = (4.0/3) * 3.14159 * pow(raio,3);
	
	printf("\nResultado\nVOLUME = %.3f", volume);
	
	return 0;
}

