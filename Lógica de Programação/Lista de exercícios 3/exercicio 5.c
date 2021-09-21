#include <stdio.h>

int main(){
	
	int km, distancia;
	
	printf("Entre com a quantidade de KM de diferença do carro X: ");
	scanf("%d", &km);
	
	distancia = km * 2;
	
	printf("\nResultado\nMinutos de distancia do carro X: %d minutos", distancia);

	return 0;
}
