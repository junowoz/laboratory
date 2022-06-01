#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

float quadrado(float a){
	
	float area_q;
	area_q = a * a;
	
	printf("\n O quadrado tem uma area de: %.2f cm",area_q);

}

float triangulo(float base, float altura){
	
	float area_t;
	area_t = (base * altura)/2;
	
 	printf("\n O triangulo tem uma area de: %.2f cm",area_t);
	
}

int main()
{
	setlocale(LC_ALL,"portuguese");
	
//AREA DO QUADRADO
	printf("AREA DO QUADRADO");
	
	float a;
	
	printf("\n Ingrese o tamanho dos lados do quadrado: ");
	scanf("%f",&a);
	
	quadrado(a);
	
	printf("\n");

//AREA DO TRIANGULO	
	printf("\n AREA DO TRIANGULO");
	
	float altura,base;
	
	printf("\n Ingrese a altura do triângulo: ");
	scanf("%f",&altura);
	printf("Ingrese a base do triângulo: ");
	scanf("%f",&base);
	
	triangulo(altura,base);
	
	return 0;
}

