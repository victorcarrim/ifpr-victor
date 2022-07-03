#include <stdio.h>

 int main(){
	 
	 int horas, velocidademedia;
	 double kmh;
	 
	 printf("Litros de combustivel gastos\nEntre com a quantidades de horas e velocidade media da viagem: ");
	 scanf("%d %d", &horas, &velocidademedia);
	 
	 kmh = (horas * velocidademedia) / 12.00;
	 
	 printf("\nResultado\nQuantidade de combustivel gasto: %.3f", kmh);
	 
	 return 0;
 }
