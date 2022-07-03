#include <stdio.h>

int main (){
	
	int valora, valorb, valorc, valord;
	
	printf("Entre com os valores: ");
	scanf("%d %d %d %d", &valora, &valorb, &valorc, &valord);
	
	if (valorb>valorc && valord>valora && valorc+valord>valora+valorb && valorc>0 && valord>0 && valora%2==0){
		printf("valores aceitos\n");}
	else {
		printf("valores não aceitos\n");}
		
	return 0;
}
