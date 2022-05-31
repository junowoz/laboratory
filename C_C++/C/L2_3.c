#include <stdio.h>
#include <stdlib.h>

int main()
{
    int codigo;
	
	printf("Ingresse um c�digo para o produto, 1-10. \n");
	scanf("%i",&codigo);
	
	if (codigo == 1)
	{
		printf("Alimento n�o-perec�vel.");
	} 
	else if (codigo == 2 || codigo == 3 || codigo == 4)
	{
		printf("Alimento perec�vel.");
	}
	else if (codigo == 5 || codigo == 6)
	{
		printf("Vestu�rio.");
	}
	else if (codigo == 7)
	{
		printf("Higiene pessoal.");
	}
	else if (codigo == 8 || codigo == 9 || codigo == 10)
	{
		printf("Utens�lios dom�sticos.");
	}
	else
	{
		printf("Inv�lido.");
	}
	
	printf("\n");
		
//Usando Switch
	
	printf("Ingresse um c�digo para o produto, 1-10. \n");
	scanf("%i",&codigo);
	
	switch(codigo) {
      case 1 :
         printf("Alimento n�o-perec�vel.");
         break;
      case 2: case 3: case 4 :
      	 printf("Alimento perec�vel.");
         break;
      case 5: case 6 :
         printf("Vestu�rio.");
         break;
      case 7 :
         printf("Higiene pessoal.");
         break;
      case 8 : case 9: case 10 :
         printf("Utens�lios dom�sticos.");
         break;
      default :
         printf("Inv�lido.");
   }
	
	
	return 0;
}
