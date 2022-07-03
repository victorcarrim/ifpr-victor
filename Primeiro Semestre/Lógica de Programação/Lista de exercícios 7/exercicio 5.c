#include <stdio.h>

int main (){

	int a,b,c,d,e,f;
  
	a = 5;
	c = 0;
	d = 0;
	e = 0;
	f = 0;
  
	while(a--){
		scanf("%d", &b);
		if (b < 0)
			d++;
		
		else if (b > 0)
			c++;
			
		if (b % 2 == 0)
			e++;
		else
			f++;
	}
	
	printf("%d valor(es) par(es)\n", e);
	printf("%d valor(es) impar(es)\n", f);
	printf("%d valor(es) positivo(s)\n", c);
	printf("%d valor(es) negativo(s)\n", d);

    return 0;
}
