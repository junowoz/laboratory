#include <stdio.h>

int main() {
    int prato,sobremesa,bebida,caloria;
    int total;

    printf("Informe seu prato: \n1. Vegetariano: 180 \n2. Peixe: 230 \n3. Frango: 250 \n4. Carne:350\n");
    printf("Ingresar: ");
    scanf("%d", &prato);

    switch(prato)
    {
        case 1:
            caloria = 180;
            prato = caloria;
            break;
            
    	case 2:
            caloria = 230;
            prato = caloria;
            break;

        case 3:
            caloria = 250;
            prato = caloria;
            break;

        case 4:
            caloria = 350;
            prato = caloria;
            break;
        default:
            printf("Ingresse um valor entre 1 e 4.");
    }

	printf("\nInforme sua sobremesa: \n1. Abacaxi: 75 \n2. Sorvete Diet: 110 \n3. Mousse Diet: 170 \n4. Mousse Chocolate: 200\n");
    printf("Ingresar: ");
    scanf("%d", &sobremesa);

// Orden dos fatores de igualdade importa SIM.
    switch(sobremesa)
    {
        case 1:
            caloria = 75;
            sobremesa = caloria;
            break;
            
    	case 2:
            caloria = 110;
            sobremesa = caloria;
            break;

        case 3:
            caloria = 170;
            sobremesa = caloria;
            break;

        case 4:
            caloria = 200;
            sobremesa = caloria;
            break;
        default:
            printf("Ingresse um valor entre 1 e 4.");
    }
    

	printf("\nInforme seu prato: \n1. Chá: 20 \n2. Suco de Laranja: 70 \n3. Suco de Melão: 100 \n4. Refrigerante Diet: 65\n");
    printf("Ingresar: ");
    scanf("%d", &bebida);

    switch(bebida)
    {
        case 1:
            caloria = 20;
            bebida = caloria;
            break;
            
    	case 2:
            caloria = 70;
            bebida = caloria;
            break;

        case 3:
            caloria = 100;
            bebida = caloria;
            break;

        case 4:
            caloria = 65;
            bebida = caloria;
            break;
        default:
            printf("Ingresse um valor entre 1 e 4.");
    }

	total = prato + sobremesa+ bebida;
	printf("\nA quantidade total de calorias é: %d",total);
	
    return 0;
}
