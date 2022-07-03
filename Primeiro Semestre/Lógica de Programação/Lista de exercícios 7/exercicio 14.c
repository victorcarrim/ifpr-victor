#include <stdio.h>

int main(){
	
	int n, i;
	int m = 1;
	
	scanf("%d", &n);
	
	for(i = n; i >=1; i--){
		m*= i;
		printf ("%d\n",m);
	}
	
	return 0;
}
