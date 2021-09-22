#include <stdio.h>

int main () {

	double valor, D, E;
	int nota, B, moeda;
	int cem, cinquenta, vinte, dez, cinco, dois;
	int mum, mcinquenta, mvintecinco, mdez, mcinco, mumcent;

	printf("Contagem de notas e moedas\n\nEntre com o valor do dinheiro em reais: ");
	scanf ("%lf",&valor);

	nota = valor;
	
	cem = nota / 100;
	nota = nota%100;

	cinquenta = nota / 50;
	nota = nota%50;

	vinte = nota / 20;
	nota = nota%20;

	dez = nota / 10;
	nota = nota%10;

	cinco = nota / 5;
	nota = nota%5;

	dois = nota / 2;
	
	mum = nota%2;
	

	E = valor * 100;
	B = (int) E;
	moeda = B%100;
	
	mcinquenta = moeda / 50;
	moeda = moeda%50;

	mvintecinco = moeda / 25;
	moeda = moeda%25;

	mdez = moeda / 10;
	moeda = moeda%10;

	mcinco = moeda / 5;
	mumcent = moeda%5;

	printf ("\nNOTAS:\n");
	printf ("%d nota(s) de R$ 100.00\n",cem);
	printf ("%d nota(s) de R$ 50.00\n",cinquenta);
	printf ("%d nota(s) de R$ 20.00\n",vinte);
	printf ("%d nota(s) de R$ 10.00\n",dez);
	printf ("%d nota(s) de R$ 5.00\n",cinco);
	printf ("%d nota(s) de R$ 2.00\n",dois);
	printf ("MOEDAS:\n");
	printf ("%d moeda(s) de R$ 1.00\n",mum);
	printf ("%d moeda(s) de R$ 0.50\n",mcinquenta);
	printf ("%d moeda(s) de R$ 0.25\n",mvintecinco);
	printf ("%d moeda(s) de R$ 0.10\n",mdez);
	printf ("%d moeda(s) de R$ 0.05\n",mcinco);
	printf ("%d moeda(s) de R$ 0.01\n",mumcent);

	return 0;

}
