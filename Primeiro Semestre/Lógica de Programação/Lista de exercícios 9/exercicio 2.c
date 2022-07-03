#include <stdio.h>

int main(){
	
	int n[10], i, a;
	
	scanf("%d", &a);
	
	for(i=0; i<10; i++){
		n[i] = a;
		printf("N[%d] = %d\n", i, a);
		a*= 2;
	}
		
	return 0;
}
