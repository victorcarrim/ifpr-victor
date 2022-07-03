#include <stdio.h>

int main(){
	
    int num;
    num= 1;

    while(num != 2002){
        scanf("%d", &num);
        if(num == 2002){
            printf("Acesso Permitido\n" );
        }
        
        else{
            printf("Senha Invalida\n" );
        }
    }
    
    return 0;
}
