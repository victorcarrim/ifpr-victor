#include <stdio.h>
#include <string.h>

struct aluno {
	char nome[40];
	int matricula;
	int nota1;
	int nota2;
	float media;
	int faltas;
};

struct turma{
	struct aluno cadastro[40];
}
	

int abreDados(struct aluno *cadastro, int i){
	FILE *arq;
	int x;
	
	arq = fopen("dadosAlunos.txt", "w");
	
	if(arq == NULL){
		fprintf(stderr, "Erro ao abrir arquivo de dados!");
		return 1;}
	else {
		x = fread(&cadastro, sizeof(struct aluno), i, arq);
		fclose(arq);
		if(x == i){
			return 0;}
		else{
			return 1;}
		}
	}

int salvaDados(struct aluno *cadastro, int i){
	FILE *arq;
	int x;
	
	arq = fopen("dadosAlunos.txt", "w");
	
	if(arq == NULL){
		fprintf(stderr, "Erro ao abrir arquivo de dados!");
		return 1;}
	else {
		x = fwrite(&cadastro, sizeof(struct aluno), i, arq);
		fclose(arq);
		if(x == i){
			return 0;}
		else{
			return 1;}
		}
	}
	
int main(){
	
	int i, n;
	int abrir = abreDados(cadastro, i);
	int salvar = salvaDados(cadastro, i);
	
	printf("Quantidade de alunos?");
	scanf("%d", &n);
	
	for (i=0; i<= n-1; i++){
		printf("Qual o nome do Aluno?");
		setbuf(stdin, NULL);
		fgets(cadastro[i].nome, sizeof(cadastro[i].nome), stdin);
		cadastro[i].nome[strlen(cadastro[i].nome)-1] = '\0';
	
		printf("Qual a matricula do Aluno?");
		setbuf(stdin, NULL);
		scanf("%d", &cadastro[i].matricula);
	
		printf("Qual a primeira nota do Aluno?");
		setbuf(stdin, NULL);
		scanf("%d", &cadastro[i].nota1);
	
		printf("Qual a segunda nota do Aluno?");
		setbuf(stdin, NULL);
		scanf("%d", &cadastro[i].nota2);
	
		printf("Qual a quantidade de faltas do Aluno?");
		setbuf(stdin, NULL);
		scanf("%d", &cadastro[i].faltas);
	}
	
	printf("Dados salvos com sucesso", salvaDados);  
	
	
	
	return 0;
}

			
