#include <stdio.h>
#include <math.h>

int main(){
	double numa, numb, numc, triangulo, circulo, trapezio, quadrado,retangulo;
	
	printf("Calculadora de areas\nEntre com os valores de A, B e C = ");
	scanf("%lf %lf %lf", &numa, &numb, &numc);
	
	triangulo = (numa * numc) / 2;
	circulo = 3.14159 * pow(numc, 2);
	trapezio = ((numa + numb) * numc) / 2;
	quadrado = numb * numb;
	retangulo = numa * numb;
	
	printf("\nResultados\nTRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
	
	return 0;
}
