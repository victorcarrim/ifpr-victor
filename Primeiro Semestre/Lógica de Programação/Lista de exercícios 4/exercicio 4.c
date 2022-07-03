#include <stdio.h>

int main (){

		float nota1, nota2, nota3, nota4, notaexame, media, exame;
		
		printf("Media Escolar\nEntre com suas notas: ");
		scanf("%f %f %f %f", &nota1, &nota2, &nota3, &nota4);
		
		media = (nota1 * 2)  + (nota2 * 3) + (nota3 * 4) + (nota4) / 10;
		
		if (media>=7.0){
			printf("Aluno aprovado\n");}
		else if (media>=5 && media<7.0){
			printf("Aluno em exame.\n");
			printf("Nota do exame: ");
			scanf("%f", &notaexame);
			exame = media + notaexame / 2;
			if (exame>=5.0){
				printf("Aluno aprovado.\n");
				printf("Media final: %.1f", exame);}
			else {
				printf("Media: %.1f", exame);}
			}
		else if (media<5.0){
			printf("Aluno reprovado\n");}	
	
	return 0;
}
