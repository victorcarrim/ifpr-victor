#include <stdio.h>

int main (){
	
	int horai, horaf, tempo;
	
	printf("Tempo de Jogo\n\n");
	printf("Entre com a hora de inicio e a hora de fim do jogo (apenas valores inteiros): ");
	scanf("%d %d", &horai, &horaf);
	
	if (horai > horaf) {
		tempo = 24 - (horai - horaf);
		printf("O JOGO DUROU %d HORA(S)\n", tempo);
	}
	
	else if (horaf > horai) {
		tempo = horaf - horai;
		printf("O JOGO DUROU %d HORA(S)\n", tempo);
	}
	
	else {
		printf("O JOGO DUROU 24 HORA(S)\n");
	}
	
	return 0;
}
