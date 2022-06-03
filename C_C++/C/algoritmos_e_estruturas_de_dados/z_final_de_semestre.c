#include <stdio.h>

main(){
    int M[6][6], V[36],A,i=0;
    printf("Digite os valores.\n");

    for (int L = 0; L < 6;L++)
        for (int C = 0; C < 6; C++)
        {
            scanf("%d",&M[L][C]);
        }
    
    printf("Digite o valor da variavel: \n");
    scanf("%d", &A);

    for (int L = 0; L < 6;L++)
        for (int C = 0; C < 6; C++)
        {
            V[i] = M[L][C] * A;
            i++;
        }
    
    for (int i = 0; i < 36; i++)
    {
        printf("%d",&V[1]);
    }
}