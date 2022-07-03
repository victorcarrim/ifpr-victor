#include<stdio.h>

int main(){
  
    int qtd, n, in, out, i;
  
    scanf("%d", &qtd);
    
    in = 0;
    out = 0;
  
    for(i=0;i<qtd;i++){
        scanf("%d",&n);
        if((n>=10) && (n<=20)){
            in++;
        }else{
            out++;
        }
    }
  
    printf("%d in\n", in);
    printf("%d out\n",out);
    
    return 0;
}
