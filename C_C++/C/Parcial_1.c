#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Parcial 1
int main()
{
    int num[15] = {21, 3, 54, 23, 56, 87, 34, 25, 65, 45, 10, 12, 6, 18, 14};
    int dig, i;

    printf("Digite un numero para ver se está no vetor: ");
    scanf("%d", &dig);

    for (i = 0; i < 15; i++)
    {
        if (dig == num[i])
        {
            printf("O numero está na posição: %d \n", num[i]);
        }
        else
        {
            printf("Numero não encontrado. \n");

        }
    }
}
