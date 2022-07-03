#include <stdio.h>
#include <string.h>

int main(){
	
	int n, i, seletor, subseletor1;
	
	printf("\n\n\n---------------- Sistema de Cadastro --------------------------\n\n\n");
	printf("Quantidade de pessoas a serem cadastradas: ");
	scanf("%d", &n);
	
	struct Tpessoa { //estrutura com os dados
		int codigo;
		char nome[50];
		char sexo;
		int idade;
		float altura;
		float peso;
	} cadpessoa[n];
	
	for(i = 0; i <= n-1; i++){ //cadastro de usuario
		printf("\n\n\n---------------- Cadastro de Pessoas --------------------------\n\n\n");
		
		printf("Insira o Código da pessoa: ");
		scanf("%d", &cadpessoa[i].codigo);
		
		printf("Insira o Nome: ");
		setbuf(stdin, NULL);
		fgets(cadpessoa[i].nome, sizeof(cadpessoa[i].nome), stdin);
		
		printf("Masculino ou Feminino(M/F): ");
		setbuf(stdin, NULL);
		scanf("%c", &cadpessoa[i].sexo);
		
		printf("Insira a Idade: ");
		setbuf(stdin, NULL);
		scanf("%d", &cadpessoa[i].idade);
		
		printf("Insira a Altura: ");
		setbuf(stdin, NULL);
		scanf("%f", &cadpessoa[i].altura);
		
		printf("Insira a Peso: ");
		setbuf(stdin, NULL);
		scanf("%f", &cadpessoa[i].peso);
		}
	
	while(seletor > -1){ //menu de alterações
		
		printf("\n\n\n---------------- Menu de Acoes --------------------------\n\n\n");
		printf("[0] sair\n[1] Alterar dados\n[2] Excluir Pessoa\n[3] Dados de uma pessoa\n[4] Dados de todas pessoas\n\n");
		
		printf("O que deseja fazer?\n");
		setbuf(stdin, NULL);
		scanf("%d", &seletor);
		
		switch(seletor){
			
			case 0:
				printf("\nSalvo com sucesso\n");
				break;
				
			case 1: // alteração de cadastro
				printf("\n\n\n---------------- Cadastros Sujeitos a Alteração --------------------------\n\n");
				for(i = 0; i <= n-1; i++){
					printf("[%d] %s", i, cadpessoa[i].nome);}
				
				printf("\nQual cadastro deseja alterar? ");
				setbuf(stdin, NULL);
				scanf("%d", &i);
				
				printf("\n\n[0] sair\n[1] Código\n[2] Nome\n[3] Sexo\n[4] Idade\n[5] Altura\n[6] Peso\n\n");
				printf("Qual dado deseja alterar?\n\n");
				
				setbuf(stdin, NULL);
				scanf("%d", &subseletor1);
				
				switch(subseletor1){
					
					case 0:
						break;
					
					case 1:
						printf("\nNovo Código: ");
						setbuf(stdin, NULL);
						scanf("%d", &cadpessoa[i].codigo);
						break;
						
					case 2:
						printf("\nNovo Nome: ");
						setbuf(stdin, NULL);
						fgets(cadpessoa[i].nome, sizeof(cadpessoa[i].nome), stdin);
						break;
				
					case 3:
						printf("\nNovo Sexo: ");
						setbuf(stdin, NULL);
						scanf("%c", &cadpessoa[i].sexo);
						break;
						
					case 4:
						printf("\nNova Idade: ");
						setbuf(stdin, NULL);
						scanf("%d", &cadpessoa[i].idade);
						break;
						
					case 5:
						printf("\nNova Altura: ");
						setbuf(stdin, NULL);
						scanf("%f", &cadpessoa[i].altura);
						break;
						
					case 6:
						printf("\nNova Idade: ");
						setbuf(stdin, NULL);
						scanf("%f", &cadpessoa[i].peso);
						break;
						
					default:
						break;
				}
				break;
				
			case 2: //excluir usuarios
				printf("\n\n\n---------------- Exclusão de Usuário --------------------------\n\n");
				for(i = 0; i <= n-1; i++){
					printf("[%d] %s", i, cadpessoa[i].nome);}
				
				printf("\nQual cadastro deseja excluir? ");
				setbuf(stdin, NULL);
				scanf("%d", &i);
				setbuf(stdin, NULL);
				
				char excluido[] = "Cadastro Excluido\n"; 
				strcpy(cadpessoa[i].nome, excluido);
				cadpessoa[i].codigo = 0;
				cadpessoa[i].sexo = 0;
				cadpessoa[i].idade = 0;
				cadpessoa[i].peso = 0;
				cadpessoa[i].altura = 0;
				
				printf("\n Cadastro Excluido \n");
				
				break;
		
			case 3: // mostrar os dados de um usuario
				printf("\n\n\n---------------- Dados de um Usuário --------------------------\n\n");
				for(i = 0; i <= n-1; i++){
					printf("[%d] %s", i, cadpessoa[i].nome);}
					
					printf("\nQual cadastro deseja vizualizar? ");
				setbuf(stdin, NULL);
				scanf("%d", &i);
					
					printf("\nCódigo: %d\n", cadpessoa[i].codigo);
					printf("Nome: %s", cadpessoa[i].nome);
					printf("Sexo: %c\n", cadpessoa[i].sexo);
					printf("Idade: %d\n", cadpessoa[i].idade);
					printf("Altura: %.2f\n", cadpessoa[i].altura);
					printf("Peso: %.2f\n", cadpessoa[i].peso);
				break;
				
			case 4: // mostrar os dados de todos os usuarios
				printf("\n\n\n---------------- Dados de todos Usuário --------------------------\n\n");
				for(i = 0; i <= n-1; i++){
					printf("\nCódigo: %d\n", cadpessoa[i].codigo);
					printf("Nome: %s", cadpessoa[i].nome);
					printf("Sexo: %c\n", cadpessoa[i].sexo);
					printf("Idade: %d\n", cadpessoa[i].idade);
					printf("Altura: %.2f\n", cadpessoa[i].altura);
					printf("Peso: %.2f\n", cadpessoa[i].peso);}
					
				break;
				
			default:
				break;
				
		}
	
	}
	
		
	return 0;
}
