#include <stdio.h>

int main (){
	
	float kmpercorrido, combustiveltotal, kmporlitro;
	
	printf("Calculadora de km/l\n\nDigite a quantidade de km percorrido e combustivel usado: ");
	scanf("%f %f", &kmpercorrido, &combustiveltotal);
	
	kmporlitro = kmpercorrido / combustiveltotal;
	
	printf("\nResultado\n%.3f km/l", kmporlitro);
	
	return 0;
}
