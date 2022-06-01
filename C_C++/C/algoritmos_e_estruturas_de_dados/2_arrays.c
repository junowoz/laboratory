/**
 * @file Arrays
 * @author junowoz.xyz
 * @brief Variety of exercises using Arrays(Vetores e Matrizes)
 * @date 2022-03-01
 */

/*Desenvolva um programa que leia um vetor VET de
10 posições e imprima uma lista numerada.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[10] = {1,2,3,43,5,65,7,11,9,0};
    int i;
    printf("Imprimir o vetor \n");

    for(i=0; i<10; i++){
        printf("%d \n",vet[i]);
    }
        
    return vet[10];
}

/*Desenvolva um programa que leia dois vetores de
4 posições e imprima o vetor soma*/

int main()
{
    int vet1[4] = {2,4,6,10};
    int vet2[4] = {5,8,1,23};
    int soma = 0;
    int i;

    printf("Lendo dois vetores e somando. \n");

    for (i = 0; i < 4; i++)
    {
        soma = vet1[i] + vet2[i];

        printf("Soma dos vetores: %d \n",soma);
    }

    return 0;
}

//Percorrendo um array e somando todos os elementos nele
int main(void)
{
    int lista[5] = {3,51,18,2,45};
    int i, soma = 0;

    for (i = 0; i < 5; i++) {   //Esse numero 5 representa a quantidade de repetições
        soma = soma + lista[i];
        
        printf("Soma = %d\n",soma);
    }
}

//What's the biggest?
int main()
{
    int i, A[5] = {3,18,2,51,45};
    int ma = A[0];

    for (i = 0; i < 5; i++)
    {
        if (ma < A[i])
        {
            ma = A[i];
        }
        
    }
    
    printf("Maior numero: %d\n",ma);
}

//Copiando um array
// não se pode atribuir arrays inteiros, só suas posições individuais.
int main()
{
    int v[5] = {1,2,3,4,5};
    int v1[5];
    int i;

    //v1 = v; ERRADO
    
    for (i = 0; i < 5; i++)
    {
        v1[i] = v[i]; //CORRETO    
    }
    //de esta forma copio el vector de v en v1
}

//Digite notas
int  main ()
{
    int notas[100], indice;

    for (indice = 0; indice < 100; indice++) {
    printf(" Digite a nota: ");

    scanf("%d",&notas[indice]);
    printf("%d",notas[indice]);
    }
}

//Insert notes and print the gpa
int main(){
    float notas[100];
    int i;

    printf("Notas dos estudantes\n");

    for (i = 0; i > 100; i++){

        printf("Digite as notas dos estudantes: %d\n",i);
        scanf("%f",&notas[i]);
    }

    float media = 0;
    for (i = 0; i < 100; i++)
    {   
        media = media + notas[i];
        media = media / 100;
    }
    
    for (i = 0; i < 100; i++)
    {
        if (notas[i] > media)
        {
            printf("Notas: %f\n",notas[i]);
        }
        
    }
    return 0;
}