#include<stdio.h>

int main (){
 
	int n1, n2, i, soma;
 
	scanf("%d %d", &n1, &n2);
	soma = 0;
 
	if (n1<n2){
		for(i=n1;i<=n2;i++){
			if(i%13!=0){
				soma +=i;
			}		
		}
	}
	
	else{
		for (i=n2;i<=n1;i++){
			if(i%13!=0){
				soma+=i;
			}
		}
	}
	
	printf("%d\n",soma);
	
	getchar();
	
	return 0;
}
