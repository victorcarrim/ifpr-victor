#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

typedef struct elemento {
	int dado;
	struct elemento *prox;
} *Pilha;

Pilha criaPilha(){
	return NULL;
}

int pilhaVazia(Pilha p){
	if(p == NULL)
		return (TRUE);
	else
		return (FALSE);
}

void imprimeElementos(Pilha p){
	Pilha pa;
	
	printf("\n\n---------- ELEMENTOS DA PILHA ----------\n");
	
	if(!pilhaVazia(p)){
		pa = p;
		while(pa != NULL){
			printf("%d - ", pa->dado);
			pa = pa->prox;
		}
	} else {
		printf("\nPILHA VAZIA!!!");
	}
}

Pilha insereElemento(Pilha p, int x){
	Pilha novo;
	
	novo = malloc(sizeof(struct elemento));
	novo->dado = x;
	novo->prox = p;
	
	return novo;
}

Pilha retiraElemento(Pilha p, int x){
	Pilha pa;
	
	if(!pilhaVazia(p)){
		x = p->dado;
		pa = p;
		p = p->prox;
		free(pa);
		printf("\nDesempilhado com Sucesso!");
	} else {
		x = -1;
		printf("\nPILHA VAZIA!!!");
	}
	
	return (p);
}

	
int main(){
	Pilha pilha;
	int cont = 1, a;
	
	pilha = criaPilha();
	
	while(cont != 0){
		printf("\n\n\n------------- MENU PILHA ---------------");
		printf("\n [0] - Sair\n [1] - Empilhar Elemento\n [2] - Desempilhar elemento\n [3] - Imprimir Elementos\n\n");
		printf("Insira a opção do menu: ");
		scanf("%d", &cont);
		setbuf(stdin, NULL);
		
		switch(cont){
			case 1:
				printf("\n\n------- EMPILHAMENTO DE ELEMENTO -------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				pilha = insereElemento(pilha, a);
				printf("\nEmpilhado com Sucesso!");
				break;
			
			case 2:
				pilha = retiraElemento(pilha, a);
				break;
			
			case 3:
				imprimeElementos(pilha);
				break;
		}
	}
	
	return 0;
}
