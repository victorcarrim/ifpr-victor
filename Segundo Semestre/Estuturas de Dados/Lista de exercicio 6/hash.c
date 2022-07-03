#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct elemento{
	int dado;
	struct elemento *prox;
};

typedef struct elemento *Lista;

int hash(int chave){
	return (chave %10);
}

Lista criaLista(){
	return NULL;
}

void criaHash(Lista *h){
	int i;
	for(i=0;i<10;i++)
		h[i] = criaLista();
	
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

void imprimeHash(Lista *h){
	int i;
	printf("\nImpimindo a lista do hash h");
	for (i=0; i<10; i++){
		printf("\nh[%d]", i);
		imprimeLista(h[i]);
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

void insereHash(Lista *h, int valor){
	int i;
	i = hash(valor);
	h[i]=insereElemento(h[i], valor);
}

Lista buscaLista(Lista l, int x){
	Lista p;
	
	p = l;
	
	while((p != NULL) && (p->dado != x)){
		p = p->prox;}
	
	return (p);
}

Lista buscaHash(Lista *h, int valor){
	int i;
	i = hash(valor);
	return (buscaLista(h[i], valor));
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

void retiraHash(Lista *h, int valor){
	int i;
	i = hash(valor);
	h[i] = retiraElemento(h[i], valor);
}

int main(){
	int a;
	int cont = 1;
	Lista h[10];
	
	criaHash(h);
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
				insereHash(h, a);
				break;
				
			case 2:
				printf("\n\n---------- REMOVER ELEMENTO ----------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				retiraHash(h, a); 
				printf("\nElemento removido com sucesso!");
				break;
				
			case 3:
				printf("\n\n---------- BUSCA DE ELEMENTO ----------");
				printf("\n\nInsira o elemento: ");
				scanf("%d", &a);
				buscaHash(h, a);
				
				if(buscaHash == NULL){
					printf("\n Elemento não encontrado!");
				} else {
					printf("\nElemento encontrado!");}
				break;
					
			case 4:
				printf("\n\n--------- ELEMENTOS CADASTRADOS --------");
				imprimeHash(h);
				break;
				
			default:
				break;
		}
	}
	
	return 0;
}
