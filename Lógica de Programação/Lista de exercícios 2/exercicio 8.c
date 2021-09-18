#include <stdio.h>

int main(){
	
	float numerofun, horasalario, horatrabalhada, salario;
	
	printf("Calculadora de Salario\nDigite seu numero de funcionario: ");
	scanf("%f", &numerofun);
	printf("Digite o seu salario-hora: ");
	scanf("%f", &horasalario);
	printf("Digite o numero de horas trabalhadas: ");
	scanf("%f", &horatrabalhada);
	
	salario = horatrabalhada * horasalario;
	
	printf ("\nFuncionario numero %.2f, seu salario esse mes foi de $ %.2f", numerofun, salario);
	
	return 0;
}
