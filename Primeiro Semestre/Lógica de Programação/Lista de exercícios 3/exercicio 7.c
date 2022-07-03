#include <stdio.h>

int main(){

	int dinheiro, cem, cinquenta, vinte, dez, cinco, dois, um, valor;
	
	printf("Contagem de notas\n\nEntre com o valor do dinheiro em reais: ");
	scanf("%d", &dinheiro);
	
	valor = dinheiro;
	
	cem = dinheiro / 100;
	dinheiro = dinheiro - (cem * 100);
	
	cinquenta = dinheiro / 50;
	dinheiro = dinheiro - (cinquenta * 50);
	
	vinte = dinheiro / 20;
	dinheiro = dinheiro - (vinte * 20);
	
	dez = dinheiro / 10;
	dinheiro = dinheiro - (dez * 10);
	
	cinco = dinheiro / 5;
	dinheiro = dinheiro - (cinco * 5);
	
	dois = dinheiro / 2;
	dinheiro = dinheiro - (dois * 2);
	
	um = dinheiro / 1;
	
	printf("%d\n", valor);
	printf("%d nota(s) de R$100,00\n", cem);
	printf("%d nota(s) de R$50,00\n", cinquenta);
	printf("%d nota(s) de R$20,00\n", vinte);
	printf("%d nota(s) de R$10,00\n", dez);
	printf("%d nota(s) de R$5,00\n", cinco);
	printf("%d nota(s) de R$2,00\n", dois);
	printf("%d nota(s) de R$1,00\n", um);
	
	return 0;
}
