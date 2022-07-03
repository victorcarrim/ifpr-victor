#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

struct elemento{
	int dado;
	struct elemento *prox;
};
typedef struct elemento *FilaElemento;

typedef struct{
	FilaElemento inicio;
	FilaElemento fim;
} Fila;

Fila criaFila(){
	Fila f;
	f.inicio = NULL;
	f.fim = NULL;
	
	return (f);
}

int filaVazia(Fila f){
	if(f.inicio == NULL){
		return TRUE;
	} else {
		return FALSE;
	}
}

void imprimeFila(Fila f){
	FilaElemento p;
	
	printf("\n\n---------- ELEMENTOS DA FILA ----------\n");
	p = f.inicio;
	if(!filaVazia(f)){
		while (p != NULL){
			printf("%d - ", p->dado);
			p = p->prox;
		}
	} else {
		printf("\nFILA VAZIA!!!");
	}
}

Fila insereElemento(Fila f, int x){
	FilaElemento novo;
	
	novo = malloc(sizeof(struct elemento));
	novo -> dado = x;
	novo -> prox = NULL;
	
	if (filaVazia(f)){
		f.inicio = novo;
		f.fim = novo;
	} else {
		f.fim->prox = novo;
		f.fim = novo;
	}
	return (f);
}

Fila retiraElemento(Fila f, int x){
	FilaElemento p;
	
	if(!filaVazia(f)){
	
		x = f.inicio->dado;
		p = f.inicio;
		f.inicio = f.inicio->prox;
		free(p);
		
		if (filaVazia(f))
			f.fim = NULL;
		} else {
			x = -1;
			printf("\nFila Vazia!!!");
		}
		
	return (f);
}

int main(){
	Fila fila;
	int cont = 1, a;
	
	fila = criaFila();
	
	while(cont != 0){
		printf("\n\n\n------------- MENU FILA ---------------");
		printf("\n [0] - Sair\n [1] - Inserir Elemento\n [2] - Retirar elemento\n [3] - Imprimir Elementos\n\n");
		printf("Insira a opção do menu: ");
		scanf("%d", &cont);
		setbuf(stdin, NULL);
		
		switch(cont){
			case 1:
				printf("\n\n------ INSERIR ELEMENTO NA FILA -------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				fila = insereElemento(fila, a);
				printf("\nInserido com Sucesso!");
				break;
				break;
				
			case 2:
				retiraElemento(fila, a);
				break;
			
			case 3:
				imprimeFila(fila);
				break;
			
			default:
				break;
			}
		}
		
	return 0;
}

