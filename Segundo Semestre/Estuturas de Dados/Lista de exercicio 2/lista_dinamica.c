#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct elemento{
	int dado;
	struct elemento *prox;
};

typedef struct elemento *Lista;

Lista criaLista(){
	return NULL;
}

void imprimeLista(Lista l){
	Lista p;
	
	
	p = l;
	
	printf("\nItens da Lista\n");
	
	while(p != NULL){
		printf("%d - ", p->dado);
		p = p->prox;
	}
	printf("\n");
}

Lista insereElemento(Lista l, int x){
	Lista novo, p, ant;
	
	novo = malloc(sizeof(struct elemento));
	novo-> dado = x;
	
	p = l;
	ant = p;
	
	while((p != NULL) && (p->dado < x)){
		ant = p;
		p = p->prox;
	}
		
	if(p != ant){
		ant -> prox = novo;
	} else {
		l = novo;
	}

	novo->prox = p;

	return l;
}



int contaElementos(Lista l){
	Lista p;
	int cont = 0;
	
	p = l;
	while(p != NULL){
		cont++;
		p = p->prox;
	}
	
	return cont;
}

Lista buscaLista(Lista l, int x){
	Lista p;
	
	p = l;
	
	while((p != NULL) && (p->dado != x)){
		p = p->prox;}
	
	return (p);
}

Lista retiraElemento(Lista l, int x){
	Lista p, ant;
	
	p=l;
	ant=l;
	
	while((p!=NULL) && (p->dado != x)){
		ant = p;
		p = p->prox;
	}
	if(p!=NULL){
		if(p == ant){
			l = p->prox;
			free(p);
		} else{
			ant->prox = p->prox;
			free(p);
		}
	}
	
	return (l);
}

int main(){
	Lista lista, buscLista, remLista;
	int a, contLista;
	int cont = 1;
	
	lista = criaLista();
	
	while(cont != 0){
		printf("\n\n\n--------- MENU LISTA ORDENADA ----------");
		printf("\n [0] - Sair\n [1] - Inserir elemento\n [2] - Retirar elemento\n [3] - Busca Elementos\n [4] - Exibir Elementos\n [5] - Conta Elementos\n\n");
		printf("Insira a opção do menu: ");
		scanf("%d", &cont);
		setbuf(stdin, NULL);
	
		switch(cont){
			case 1:
				printf("\n\n--------- CADASTRO DE ELEMENTO ---------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				lista = insereElemento(lista, a);
				break;
				
			case 2:
				printf("\n\n---------- REMOVER ELEMENTO ----------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				remLista = retiraElemento(lista, a);
				printf("\nElemento removido com sucesso!");
				break;
				
			case 3:
				printf("\n\n---------- BUSCA DE ELEMENTO ----------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				buscLista = buscaLista(lista, a);
				
				if(buscLista == NULL){
					printf("\n Elemento não encontrado!");
				} else {
					printf("\nElemento encontrado!");}
				break;
					
			case 4:
				printf("\n\n--------- ELEMENTOS CADASTRADOS --------");
				imprimeLista(lista);
				break;
				
			case 5:
				contLista = contaElementos(lista);
				printf("\n\n--------- NUMERO DE ELEMENTOS ----------");
				printf("\nO numero de elementos da lista é %d", contLista);
				break;
				
			default:
				break;
		}
	}
	
	return 0;
}
