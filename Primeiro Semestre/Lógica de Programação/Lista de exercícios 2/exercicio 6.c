#include <stdio.h>

int main (){
	
	float numa, numb, numc, media;
	
	printf("Media de notas\nDigite suas tres notas: ");
	scanf("%f %f %f", &numa, &numb, &numc);
	
	if ((numa, numb, numc)>=10.0){
		printf("\nSuas notas devem ter um valor maximo de 10.0, tente novamente");
	}else{
		media = ((numa * 2) + (numb * 3) + (numc * 5))/10;
		printf("\nMEDIA = %.1f", media);
	}
	return 0;
}
