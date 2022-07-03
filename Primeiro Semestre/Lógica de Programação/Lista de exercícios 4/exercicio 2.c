#include <stdio.h>
#include <math.h>

int main (){
	
	double valora, valorb, valorc, x1, x2, delta;
	
	printf("Formula de Bharkara\nEntre com os tres valores: ");
	scanf("%lf %lf %lf", &valora, &valorb, &valorc);
	
	delta = pow(valorb, 2) - 4 * valora * valorc;
	x1 = (-valorb + sqrt(delta)) / (2 * valora);
	x2 = (-valorb - sqrt(delta)) / (2 * valora);
	
	if (delta<0 || valora==0){
		printf("Impossivel calcular\n");}
	else {
		printf("R1 = %.5f\n", x1);
		printf("R2 = %.5f\n", x2);}
	
	return 0;
}
