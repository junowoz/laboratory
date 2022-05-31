/**
 * @file Conditional Structures
 * @author junowoz.xyz
 * @brief training with Conditional Structutres
 * @date 2022-03-01
 * 
 * 1) Ler um número inteiro entre 1 e 12 e escrever
    o mês correspondente. Caso o usuário digite
    um numero fora desse intervalo, deverá
    aparecer uma mensagem informando que não
    existe mês com este numero
 */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Student GPA
int main()
{
    float N1,N2,MD;

    printf("Digite a 1 nota: ");
    scanf("%f",&N1);

    printf("Digite a 2 nota: ");
    scanf("%f",&N2);

    MD = ((N1 + N2)/2);

    if (MD >= 6) 
    {
        printf("Aprovado com uma nota de:  %f", MD); 
    }
        else if (1+1==2)
        {
            printf("Só uma tentativa"); 
        }
    else
    {
        printf("Reprovado com uma nota de:  %f", MD); 
    }
}

/*Try_with for_Exercise 1

int main()
{
    int i;
    int num[12] = {1,2,3,4,5,6,7,8,9,10,11,12};
    const char *mon[12] = {"Jan","Fev","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dec"};

    printf("Type a number between 1 and 12: ");
    scanf("%d",&i);

        for (i; i < 12; i++)
        {
            if (num[i] = mon[i])
            {
                printf("The month is: %*mon",*mon);
            }
            else
            {
                printf("This month does not exist");

            }
        }

    system ("pause");
}
*/
