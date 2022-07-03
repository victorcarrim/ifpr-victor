#include <stdio.h>
#include <string.h>

#define maxItens 5
#define maxTam 5

typedef char tpLista [maxTam] [maxItens];

void criaLista(tpLista l){
	int i;
	
	for(i=0; i<maxItens; i++)
		l[i][0] = '\0';
}
	
void insereElemento(tpLista l, char *item){
	int i;
	
	for(i=0; i<maxItens && strlen(l[i])>0; i++);
	if(i<maxItens){
		strcpy(l[i], item);
		printf("\nO item (%s) foi inserido na lista", item);
	} else {
		printf("\nNão ha mais espaço na lista");}
}

void retiraElemento(tpLista l, char *item){
	int i;
	
	for(i=0; i<maxItens && strlen(l[i])>0 && (strcmp(l[i], item) != 0); i++);
	
	if(i<maxItens && (strcmp(l[i], item) == 0)){
		printf("\nItem (%s) encontrado, removendo da lista ...", item);
		
		if(i < (maxItens-1)){
		for(; i<maxItens - 1 && strlen(l[i])>0; i++)
			strcpy(l[i], l[i+1]);}
		
		l[maxItens -1][0] = '\0';
	} else {
		printf("\nElemento não encontrado");}
}

int contaElementos(tpLista l){
	int i;
	
	for(i=0; i<maxItens && (strlen(l[i])>0); i++);
	
	return (i);
}

void exibeConteudo(tpLista l){
	int i;
	
	for(i=0; i<maxItens && (strlen(l[i])>0); i++)
		printf("\n%s", l[i]);
		
	}	


int main(){
	
	tpLista lista;
	char item[maxTam];
	int cont = 1;
	int aux;
	
	
	
	criaLista(lista);
	printf("--------- LISTA ---------");
	
	while(cont != 0){
		printf("\n\n\n--------- MENU ----------");
		printf("\n [0] - Sair\n [1] - Inserir elemento\n [2] - Retirar elemento\n [3] - Contar elementos\n [4] - Exibir conteúdo\n\n");
		scanf("%d", &cont);
		setbuf(stdin, NULL);
		
		switch(cont){
			case 1:
			printf("\nInsira o elemento: ");
			fgets(item, sizeof maxTam, stdin);
			item[strlen(item)] = '\0';
			insereElemento(lista, item);
			break;
			
			case 2:
			printf("\nInsira o elemento a ser retirado: ");
			fgets(item, sizeof maxTam, stdin);
			item[strlen(item)] = '\0';
			retiraElemento(lista, item);
			break;
			
			case 3:
			aux = contaElementos(lista);
			printf("\nA lista possui (%d) elementos!", aux);
			
			break;
			
			case 4:
			exibeConteudo(lista);
			break;
			
			default:
			break;
		}
	}
	
	return 0;
}
