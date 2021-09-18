#include <stdio.h>

int main (){
	
	float area, raio;
	
	printf("Calculo de area do circulo\n");
	
	printf("Digite o raio: ");
	scanf("%f" ,&raio);
	
	area = 3.14 * (raio*raio);
	
	printf("\nResultado\n");
	printf("Area = %.4f" ,area);
	
	return 0;
}
