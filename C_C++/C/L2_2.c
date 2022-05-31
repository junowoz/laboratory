#include <stdio.h>
#include <stdlib.h>

int main()
{
    float valor, salario, emp;
    int parcelas;
	
	printf("Empr�stimo Banc�rio. \n");
	
	printf("Ingresse o valor do empr�stimo: ");
	scanf("%f",&valor);
	
	printf("Ingresse o numero de parcelas: ");
	scanf("%i",&parcelas);
	
	printf("Ingresse seu sal�rio: ");
	scanf("%f",&salario);
	
	emp = valor / parcelas;
	
	if (emp <= (salario*0.30))
	{
		printf("Aprovado.");
	} 
	else 
	{
		printf("Recusado.");
	}
	
	return 0;
}
