#include <stdio.h>
#include <math.h>

int main(){
	
	double xa, xb, ya, yb, distancia;
	
	printf("Calculadora de distancia em um ponto cartesiano\nEntre com as coordenadas do eixo x = ");
	scanf("%lf %lf", &xa, &ya);
	printf("Entre com as coordenadas do eixo y = ");
	scanf("%lf %lf", &xb, &yb);
	
	distancia = sqrt( pow(xb - xa, 2) + pow(yb - ya, 2));

	printf("\nResultado\nDistancia = %.4f", distancia);
	return 0;
}
