#include <stdio.h>

int soma(int a){
	int valor, resultado_soma=0;
	
	for(valor = 0; valor<=a; valor++){
		resultado_soma += valor;
	}
		
	return resultado_soma;
}

int main(){
	int n;
	
	printf("Entre com o valor n: ");
	scanf("%d", &n);
	
	printf("O valor da soma dos numero de n é: %d", soma(n));
	
	return 0;
}
