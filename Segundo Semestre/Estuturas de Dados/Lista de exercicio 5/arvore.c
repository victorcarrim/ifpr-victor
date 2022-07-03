#include <stdio.h>
#include <stdlib.h>

struct Elemento {
	int dado;
	struct Elemento *esq;
	struct Elemento *dir;
};

typedef struct Elemento *Arvore;

Arvore criaArvore(){
	return NULL;
}

void insereElemento(Arvore *a, int x){
	
	if((*a) == NULL){
		(*a) = malloc(sizeof(struct Elemento));
		(*a) -> dado = x;
		(*a) -> esq = NULL;
		(*a) -> dir = NULL;
	} else if (x < (*a) -> dado){
		insereElemento(&((*a)->esq), x);
	} else if (x > (*a) -> dado){
		insereElemento(&((*a)->dir), x);
	} else {
		printf("A Árvore não permite elementos duplicados!!!\n");}
		
}

Arvore buscaElemento(Arvore a, int x){
	
	if (a == NULL){
		return NULL;
	} else if (x < a-> dado){
		return buscaElemento(a->esq, x);
	} else if (x > a->dado){
		return buscaElemento(a->dir, x);
	} else {
		return a;}
	}
	
void preOrdem(Arvore a){
	if(a != NULL){
		printf("\n%d", a->dado);
		preOrdem(a->esq);
		preOrdem(a->dir);
	}
}

void inOrdemAsc(Arvore a){
	if (a != NULL){
		inOrdemAsc(a->esq);
		printf("\n%d", a->dado);
		inOrdemAsc(a->dir);
	}
}

void inOrdemDesc(Arvore a){
	if (a != NULL){
		inOrdemDesc(a->dir);
		printf("\n%d", a->dado);
		inOrdemDesc(a->esq);
	}
}

void posOrdem(Arvore a){
	if(a != NULL){
		posOrdem(a->esq);
		posOrdem(a->dir);
		printf("\n%d", a->dado);
	}
}

void antecessor(Arvore a, Arvore *x){
	Arvore aux;
	
	if((*x)->dir != NULL){
			antecessor(a, &((*x)->dir));
		} else {
			a->dado = (*x)->dado;
			aux = *x;
			*x = aux->esq;
			free(aux);
		}
	}

void retiraElemento(Arvore *a, int x){
	Arvore aux;
	
	if(*a != NULL){
		if(x > ((*a)->dado)){
			retiraElemento(&((*a)->dir), x);
		} else if(x < ((*a)->dado)){
			retiraElemento(&((*a)->esq), x);
		} else {
			if ((*a)->dir == NULL){
				aux = (*a);
				*a = aux->esq;
				free(aux);
			} else if ((*a)->esq == NULL){
				aux = (*a)->dir;
				free(*a);
				*a = aux;
			} else {
				antecessor(*a, &((*a)->esq));
			}
		}
	}
}

int main(){
	Arvore arvore, retorno;
	int cont = 1; 
	int elem, cont2;
	arvore = criaArvore();
	
	while(cont != 0){
	printf("\n\n\n--------- MENU ARVORE ----------");
		printf("\n [0] - Sair\n [1] - Inserir elemento\n [2] - Retirar elemento\n [3] - Busca Elementos\n [4] - Exibir Elementos Pré-Ordem\n [5] - Exibir Elementos In-Ordem\n [6] - Exibir Elementos Pós-Ordem\n\n");
		printf("Insira a opção do menu: ");
		scanf("%d", &cont);
		setbuf(stdin, NULL);
		
		switch(cont){
		
			case 1:
				printf("\n\n\n--------- INSERIR ELEMENTO ----------");
				printf("\n\nInsira o valor do elemento:");
				scanf("%d", &elem);
				insereElemento(&arvore, elem);
				break;
				
			case 2:
				printf("\n\n\n--------- RETIRAR ELEMENTO ----------");
				printf("\n\nInsira o valor do elemento:");
				scanf("%d", &elem);
				retiraElemento(&arvore, elem);
				break;
				
			case 3:
				printf("\n\n\n--------- BUSCAR ELEMENTO ----------");
				printf("\n\nInsira o valor do elemento:");
				scanf("%d", &elem);
				retorno = buscaElemento(arvore, elem);
				
				if(retorno == NULL){
						printf("Elemento não existe na arvore\n");
					} else {
						printf("Elemento existe na arvore\n");
					}
				break;
				
			case 4:
				printf("\n\n\n--------- ARVORE PRÉ-ORDEM ----------");
				preOrdem(arvore);
				break;
				
			case 5:
				printf("\n\n\n--------- MENU IN-ORDEM ----------");
				printf("\n [1] - In-ordem Ascendente\n [2] - In-ordem Descendente\n\n");
				scanf("%d", &cont2);
				switch(cont2){
					case 1:
						printf("\n\n\n--------- ARVORE IN-ORDEM ASCENDENTE ----------");
						inOrdemAsc(arvore);
						break;
						
					case 2:
						printf("\n\n\n--------- ARVORE IN-ORDEM DESCENDENTE ----------");
						inOrdemDesc(arvore);
						break;
						
					default:
						break;
					}
				break;
				
			case 6:
				printf("\n\n\n--------- ARVORE PÓS-ORDEM ----------");
				posOrdem(arvore);
				break;
				
			default:
				break;
			}
	
	}
	
	
	return 0;
}
