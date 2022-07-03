#include <stdio.h>

int main() {

     float num;
    int val,cont;
    for(cont=1;cont <=6;cont++)
    {
    scanf("%f",&num);
        if(num>=0)
        {   
        val=val+1;
        }
    }
    printf("%d valores positivos\n",val);

    return 0;
}
