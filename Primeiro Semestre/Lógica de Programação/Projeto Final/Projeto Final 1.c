#include <stdio.h>
#include <math.h>
#include <string.h>

int formacao(int);
int poliglota(int);
float cargo(int);
float salariofinalcalc(float, int, int, float);

int main(){
	
	int n, i, seletor, seletoralteracao, salarioformacao1, salariopoliglota1;
	float salariofinal, salariocargo1, total, media;
	
	printf("===================== Sistema de Gestão de Pessoas ====================\n\n\n");
	printf("Quantidade de funcionários que trabalham na empresa? ");
	scanf("%d", &n);
	
	struct funcionario{
		char nome[50];
		int grauestudo;
		int linguas;
		int cargo;
		float produtividade;
		float salario;
	} funcdados[n]; //funcdados = funcionarios dados. VARIAVEL
	
	
	while(seletor > -1){
		printf("\n\n=========================== Menu de Opções ============================\n\n");
		printf("[0] sair\n[1] Cadastro de Funcionário\n[2] Alterar dados\n[3] Cáculo de salário\n[4] Salários acima da média\n[5] Informações de um funcionário\n\n");
		printf("O que deseja fazer? ");
		setbuf(stdin, NULL);
		scanf("%d", &seletor);
	
		switch(seletor){
			
			case 0:
				printf("Sistema Finalizado");
				break;
			
			case 1:
				for(i = 0; i <= n-1; i++){
					printf("\n\n======================= Cadastro de Funcionário =======================\n\n");
				
					printf("Insira o nome: ");
					setbuf(stdin, NULL);
					fgets(funcdados[i].nome, sizeof(funcdados[i].nome), stdin);
					funcdados[i].nome[strlen(funcdados[i].nome)-1] = '\0';
				
					printf("\nInsira o grau de estudo (de 1 a 5): ");
					setbuf(stdin, NULL);
					scanf("%d", &funcdados[i].grauestudo);
					
				
					printf("\nInsira a quantidade de linguas faladas: ");
					setbuf(stdin, NULL);
					scanf("%d", &funcdados[i].linguas);
				
					printf("\nInsira o cargo que ocupa (de 1º ao 4º nível): ");
					setbuf(stdin, NULL);
					scanf("%d", &funcdados[i].cargo);
					
					printf("\nInsira o índice de produtividade (de 0 a 1.0): ");
					setbuf(stdin, NULL);
					scanf("%f", &funcdados[i].produtividade);
				}
				printf("\nFuncionários cadastrados com sucesso!!!");
				break;
			
			case 2:
				printf("\n\n================== Funcionários Sujeitos a Alteração ==================\n\n");
				for(i = 0; i<= n-1; i++){
					printf("[%d] %s\n", i, funcdados[i].nome);}
					
				printf("\nQual cadastro deseja alterar? ");
				setbuf(stdin, NULL);
				scanf("%d", &i);
				
				printf("\n\n========================= Menu de Alterações ==========================\n");
				printf("\n\n[0] sair\n[1] Nome\n[2] Grau de Estudo\n[3] Linguas Faladas\n[4] Cargo\n[5] Produtividade");
				
				printf("\n\nQual dado deseja alterar? ");
				setbuf(stdin, NULL);
				scanf("%d", &seletoralteracao);
				
				switch(seletoralteracao){
					
					case 0:
						break;
						
					case 1: 
						printf("Novo nome: ");
						setbuf(stdin, NULL);
						fgets(funcdados[i].nome, sizeof(funcdados[i].nome), stdin);
						funcdados[i].nome[strlen(funcdados[i].nome)-1] = '\0';
						break;
						
					case 2:
						printf("Novo grau de estudo: ");
						setbuf(stdin, NULL);
						scanf("%d", &funcdados[i].grauestudo);
						break;
						
					case 3:
						printf("Nova quantidade de linguas falada: ");
						setbuf(stdin, NULL);
						scanf("%d", &funcdados[i].linguas);
						break;
						
					case 4:
						printf("Novo cargo: ");
						setbuf(stdin, NULL);
						scanf("%d", &funcdados[i].cargo);
						break;
						
					case 5:
						printf("Nova produtividade: ");
						setbuf(stdin, NULL);
						scanf("%f", &funcdados[i].produtividade);
						break;
			
					
					default:
						break;
				}
				
				//calculo de salario com os dados alterados
				salarioformacao1 = formacao(funcdados[i].grauestudo); //indice pelo estudo
				salariopoliglota1 = poliglota(funcdados[i].linguas); //indice das linguas faladas
				salariocargo1 = cargo(funcdados[i].cargo); //salario base por cargo
			
				salariofinal = salariofinalcalc(salariocargo1, salarioformacao1, salariopoliglota1, funcdados[i].produtividade); //calculo do salario final
			
				funcdados[i].salario = salariofinal; //alocação do salario na estrutura
				
				break;
			
			case 3:
				printf("\n\n======================= Salarios de Funcionários ======================\n\n");
				for(i = 0; i<= n-1; i++){
					printf("[%d] %s\n", i, funcdados[i].nome);}
					
				printf("\nQual salário deseja calcular? ");
				setbuf(stdin, NULL);
				scanf("%d", &i);
		
				salarioformacao1 = formacao(funcdados[i].grauestudo); //indice pelo estudo
				salariopoliglota1 = poliglota(funcdados[i].linguas); //indice das linguas faladas
				salariocargo1 = cargo(funcdados[i].cargo); //salario base por cargo
			
				salariofinal = salariofinalcalc(salariocargo1, salarioformacao1, salariopoliglota1, funcdados[i].produtividade); //calculo do salario final
			
				funcdados[i].salario = salariofinal; //alocação do salario na estrutura
			
				break;
				
			case 4:
				printf("\n\n======================= Salários Acima da Média =======================\n\n");
				for(i = 0; i <= n-1; i++){ //calculo do salário
					total += funcdados[i].salario;
					media = total / n;}
					
				for(i = 0; i <= n-1; i++){ //mostra quais são os salários mais altos
					if(funcdados[i].salario > media){
						printf("O salario de %s está acima da média, sendo ele de: R$ %.2f\n", funcdados[i].nome, funcdados[i].salario);} 
					}
				break;
				
			
			case 5:
				printf("\n\n\n========================= Dados de um Usuário =========================\n\n");
					for(i = 0; i <= n-1; i++){
						printf("[%d] %s\n", i, funcdados[i].nome);}
						
					printf("\nQual usuário deseja vizualizar? ");
					setbuf(stdin, NULL);
					scanf("%d", &i);
					
					printf("\nNome: %s\n", funcdados[i].nome);
					printf("Grau de Estudo: %d\n", funcdados[i].grauestudo);
					printf("Linguas Faladas: %d\n", funcdados[i].linguas);
					printf("Cargo: %dº nível\n", funcdados[i].cargo);
					printf("Indíce de Produtividade: %.2f\n", funcdados[i].produtividade);
					printf("Salário: R$ %.2f", funcdados[i].salario);
				break;
			
			default:
				break;
		}
		
		
}
	
	return 0;
}

int formacao(int x){
	int salarioformacao;
		
	switch(x){
		
		case 1:
			x = 1 * 1;
			break;
			
		case 2:
			x = 1 * 2;
			break;
			
		case 3:
			x = 1 * 2 * 3;
			break;
			
		case 4:
			x = 1 * 2 * 3 * 4;
			break;
			
		case 5:
			x = 1 * 2 * 3 * 4 * 5;
			
		default:
			break;
		}
		
	salarioformacao = x;
	
	return salarioformacao;
}

int poliglota(int x){
	float salariopoliglota;
	
	salariopoliglota = pow(x, 3);
	
	return salariopoliglota;
}

float cargo(int x){
	float salariocargo;
		
	switch(x){
		
		case 1:
			x = 1000.00;
			break;
			
		case 2:
			x = 1500.00;
			break;
			
		case 3:
			x = 2000.00;
			break;
			
		case 4:
			x = 2500.00;
			break;
			
		default:
			break;
		}
		
	salariocargo = x;
	
	return salariocargo;
}

float salariofinalcalc(float x, int y, int z, float w){
	float salariofinal;
	
	if(w > 07){
		salariofinal = (x + (y * 100) + (z * 100)) + (x * w);
	}
	else if(w > 0.4 || w <= 0.7){
		salariofinal = (x + (y * 100) + (z * 100));
	}
	else {
		salariofinal = (x + (y * 100) + (z * 100)) - (x * (0.4 - w));
	}
	
	return salariofinal;
}
