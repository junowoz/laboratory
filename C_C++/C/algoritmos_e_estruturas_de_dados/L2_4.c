#include <stdio.h>
#include <stdlib.h>

int main()
{
    float pe,pf,pq;
    int cp;
	
	printf("Ingresse o pre�o de etiqueta: ");
	scanf("%f",&pe);
	
	printf("Ingresse o c�digo da condi��o de pagamento: ");
	scanf("%i",&cp);
	
	
	switch(cp) {
      case 1 :
      		pf = pe - (pe*0.10);
         printf("O pre�o final �: %f",pf);
         break;
      case 2 :
      		pf = pe - (pe*0.05);
      	 printf("O pre�o final �: %f",pf);
         break;
      case 3 :
      		pf = pe / 2;
         printf("Voc� pagar� duas parcelas de %f cada uma, mantendo o pre�o de %f.",pf,pe);
         break;
      case 4 :
      		pf = pe / 3;
      		pq = pe + (pe*0.10);
         printf("Voc� pagar� tr�s parcelas de %f cada uma, e um aumento de 10%% no pre�o: %f.",pf,pq);
         break;
      default :
         printf("C�digo Inv�lido.");
   }
	
	return 0;
}
