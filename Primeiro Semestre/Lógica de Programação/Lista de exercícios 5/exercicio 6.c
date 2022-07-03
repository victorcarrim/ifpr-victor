#include <stdio.h>
int main (){
    int horainicio, final, minutoinicio, minutofinal, tempohoratotal, tempominutototal;
    scanf("%d %d %d %d", &horainicio, &minutoinicio, &final, &minutofinal);

    tempohoratotal = final - horainicio;

    if (tempohoratotal < 0){
        tempohoratotal = 24 + (final - horainicio);
    }

    tempominutototal = minutofinal - minutoinicio;
    
    if (tempominutototal < 0){
    tempominutototal = 60 + (minutofinal - minutoinicio);
    tempohoratotal--;
  }

    if (horainicio == final && minutoinicio == minutofinal){
        printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    }
    else printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempohoratotal, tempominutototal);
    return 0;
}
