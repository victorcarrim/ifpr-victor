#include <stdio.h>

int main (){
	
	float numa, numb, media;
	
	printf("Media de Notas\nDigite suas duas notas: ");
	scanf("%f %f", &numa, &numb);
	
	if ((numa,numb)>=10.0){
		printf("\nSuas notas devem ter um valor maximo de 10.0, tente novamente!");
	}else{
		media = ((numa * 3.5) + (numb * 7.5))/11;
		
		printf("\nMEDIA = %.5f" ,media);	
	}
	return 0;
}
