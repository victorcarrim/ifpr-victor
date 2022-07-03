#include <stdio.h>

int main() {
    int x = 0;
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    
    while (x != 4){    
		scanf("%d", &x);
			if (x == 1){
                alcool+=1;     
            }
            
            else if (x == 2){
				gasolina += 1;    
            }
            
            else if (x == 3){
                diesel += 1;
            }
        }
        
        printf("MUITO OBRIGADO\n");
        printf("Alcool: %d\n", alcool);
        printf("Gasolina: %d\n", gasolina);
        printf("Diesel: %d\n", diesel);

    return 0;
}
