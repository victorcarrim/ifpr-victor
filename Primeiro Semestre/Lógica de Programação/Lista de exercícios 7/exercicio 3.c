#include <stdio.h>

int main() {
 float  num,total,media;
  int cont,totalnum;
     totalnum = 0;
     total = 0;
     media = 0;
  
        for (cont = 1; cont <= 6; cont++) {
          scanf("%f", &num);
        if (num > 0) {
          totalnum += 1;
          total += num;
       }
      }
      media = total / totalnum;

     printf("%d valores positivos\n", totalnum);
     printf("%.1f\n",media);
    return 0;
}
