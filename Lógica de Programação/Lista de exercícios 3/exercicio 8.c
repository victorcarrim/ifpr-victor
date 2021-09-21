#include <stdio.h>

int main (){
	
	int tempo, horas, minutos, segundos;
	
	printf("Tempo do evento\nEntre com a quantidade de segundos: ");
	scanf("%d", &tempo);
	
	horas = tempo / 3600;
	tempo = tempo - (horas * 3600);
	
	minutos = tempo / 60;
	tempo = tempo - (minutos * 60);
	
	segundos = tempo / 1;
	
	printf("Tempo do evento: %d:%d:%d", horas, minutos, segundos);
	
	return 0;
}
