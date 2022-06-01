#include <stdio.h>
#include <stdlib.h>

int main()
{
    float salario, bonus;
    int ano;
	
	printf("Bem vindo a empresa XKW. A seguir, ingresse seu salario mensal: ");
	scanf("%f",&salario);
	
	printf("Ingresse seus anos de serviço: ");
	scanf("%i",&ano);
	
	if (ano >= 5)
	{
		bonus = salario*0.20;
		printf("Você recebeu um bônus de 20%%: %.2f",bonus);
	} 
	else 
	{
		bonus = salario*0.10;
		printf("Você recebeu um bônus de 10%%: %f",bonus);
	}
	
	return 0;
}
