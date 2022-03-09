/**
 * @file Atividade acumulativa
 * @author Juan José Gouvêa
 * @brief Exercicios
 * @date Entrega: 02/03/2022
 * 
*  1º (Valor: 1,5) Desenvolva os algoritmos utilizando as estrutura ministrada, utilizando a
    linguagem C.

    a) Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, de 50 números que serão
    digitados pelo usuário. Ao final o algoritmo deve mostrar estas duas médias. O algoritmo deve mostrar
    também o maior número PAR digitado e o menor número ÍMPAR digitado. Esses dados devem ser
    armazenados em um vetor. Além disso, devem ser impressos os valores PARES maiores que a média
    PAR, bem como os valores ÍMPARES menor que a média ÍMPAR.

    b) Em uma cidade do interior, sabe-se que, de janeiro a abril de 1976 (121 dias), não ocorreu temperatura
    inferior a 15C nem superior a 40C. As temperaturas verificadas em cada dia estão disponíveis em uma
    unidade de entrada de dados.

    Fazer um algoritmo que calcule e imprima:
    - A menor temperatura ocorrida;
    - A maior temperatura ocorrida;
    - A temperatura média;
    - O número de dias nos quais a temperatura foi inferior à temperatura média.
    
    c) Escreva um algoritmo que receba quinze números do usuário e armazene em um vetor a raiz quadrada
    de cada número. Caso o valor digitado seja menor que zero o número –1 deve ser atribuído ao elemento
    do vetor. Após isso, o algoritmo deve imprimir todos os valores armazenados.
 */


/*
* Exercicio [A]
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int i, somapar,somaodd,max,min;
    int num[5],par[5],odd[5]; //Diminuindo de 50, a 5 pra facilitar a execução
    int media_par,media_odd;

    for (i = 0; i < 5; i++)
    {
        printf("Digite 5 números: ");
        scanf("%d",&num[i]);
        
             if (num[i] % 2 == 0)
            {
                par[i] = num[i];
            } else {
                odd[i] = num[i];
            }
    }

    //média de par
    somapar = 0;
    for (i = 0; i < 5; i++)
    {
        somapar = somapar + par[i];
    }

    media_par = somapar / 5;

    printf("\n");
    printf("A média dos pares é:  %d.",media_par);

    //media impar
    somaodd = 0;
    for (i = 0; i < 5; i++)
    {
        somaodd = somaodd + odd[i];
    }

    media_odd = somaodd / 5;

    printf("\n");
    printf("A média dos impares é:  %d.",media_odd);

    //Maior par e menor impar digitados
    max = par[0];
    min = odd[0];

    for (i = 0; i < 5; i++)
    {
        if (par[i] > max) 
        {
            max = par[i];
        } 
        
        if (odd[i] < min) 
        {
            min = odd[i];
        } 

    }
    
    printf("\n");
    printf("O maior par digitado foi: %d.",max);

    printf("\n");
    printf("O menor impar digitado foi:  %d.",min);
    
    //par maior que a media e impar menor que a media

    int pmm,omm = 0;
    for (i = 0; i < 5; i++)
    {
        if (par[i] > media_par) 
        {
            pmm = i; //-1
        }

        if (odd[i] < media_odd)
        {
            omm = i;
        } 
        
    }
    
    printf("\n");
    printf("O par maior que a média foi: %d.",pmm);
    printf("\n");
    printf("O impar menor que a média foi: %d.",omm);

    return 0;
}


/*
* Exercicio B
*/
int main()
{
    float temp[5],media; //Diminuindo de 121 pra 5 para facilitar
    int i,max,min,soma;

    for (i = 0; i < 5; i++)
    {
        printf("Insira a temperatura em Celsius no dia #%i: ",i);
        scanf("%f",&temp[i]);

        if (temp[i] > 40 || temp[i] < 15) 
        {
            printf("Temperatura inváida. \n");  //Bloqueando >40 e <15
        }
    }

    //Menor e maior temperatura
    max = temp[0];
    min = temp[0];

    for (i = 0; i < 5; i++)
    {
        if (temp[i] > max) 
        {
            max = temp[i];
        } 
        
        if (temp[i] < min) 
        {
            min = temp[i];
        }
    }
    
    printf("A menor temperatura ocorrida: %d.", min);
    printf("\n");
    printf("A maior temperatura ocorrida:  %d.", max);

    //Temperatura média
    soma = 0;
    for (i = 0; i < 5; i++)
    {
        soma = soma + temp[i];
    }

    media = soma / 5;

    printf("\n");
    printf("A média das temperaturas é:  %f.",media);
    
    //Dias em que a temperatura foi inferior à media

    int dias = 0;
    for (i = 0; i < 5; i++)
    {
        if (temp[i] < media) 
        {
            dias = i-1;
        }
    }
    
    printf("\n");
    printf("A temperatura foi inferior à media em: %i dias.",dias);

    return 0;
}

/*
* Exercicio [C]
*/

int main()
{

float num[15];  //Criando um vetor com 15 espaços
int i;
        
    for (i = 0; i < 15; i++) 
    {

        printf("Digite 15 números, #%i: ",i);
        scanf("%f",&num[i]);
        
             if (num[i] < 0)    //Se o número for menor que 0, transforme em -1
            {
                num[i] = -1;
            } else {

                num[i] = sqrt(num[i]); //Se não, transforme em sua raiz quadrada
            }
    }

//Print de valores armazenados
    
    printf("\n");   
    for (i = 0; i < 15; i++)
    {
        printf("Sqrt do #%i: %f \n",i,num[i]); //Print do array
    }
    
}