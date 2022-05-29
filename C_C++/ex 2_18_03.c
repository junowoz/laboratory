#include <stdio.h>

int main() {
    char tipo;
    float km, consumo;

    printf("\nTipos de carro: A = 12km pL, B = 9km pL, C = 8km pL\n");
    printf("Informe seu tipo de carro: ");
    scanf("%c", &tipo);
    printf("Informe o trajeto em kilometros: ");
    scanf("%f",&km);

    switch(tipo)
    {
        case 'A': case 'a':
            consumo = km/12;
            printf("O consumo de combustivel do seu carro é: %.1f litros",consumo);
            break;

        case 'B': case 'b':
            consumo = km/9;
            printf("O consumo de combustivel do seu carro é: %.1f litros",consumo);
            break;

        case 'C': case 'c':
            consumo = km/8;
            printf("O consumo de combustivel do seu carro é: %.1f litros",consumo);
            break;
        default:
            printf("Ingresse um valor maior.");
    }

    return 0;
}
