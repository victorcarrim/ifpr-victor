#include <stdio.h>
int main(){
	
   int a,b,c,d,e,n, p, men;
   scanf("%d", &n);
   
   int x[n];
   for(a=0; a<n; a++)
        scanf("%d", &x[a]);
    
    men=x[0];
    
    for(a=1; a<n; a++){
        if(men>x[a]){
            men=x[a];
            p=a;
        }
    }
    
    printf("Menor valor: %d\nPosicao: %d\n", men, p);
    
    return 0;
}
