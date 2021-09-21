#include<stdio.h>

int main(){

    int numa, numb, numc, maiorAB, maiorABC;
    
    printf("Calculadora de maior numero\n\nEntre com o Numero A, B e C: ");
    scanf("%d %d %d", &numa, &numb, &numc);
    
	maiorAB = (numa+numb+abs(numa-numb))/2;
	maiorABC = (maiorAB+numc+abs(maiorAB-numc))/2;

	printf("\nResultado = %d eh o maior\n",maiorABC);

return 0;

}
