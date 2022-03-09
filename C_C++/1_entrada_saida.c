#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//Treinamento básico
int main() {
    int r, a;
    int lata_valor = 20;
    double litro = 15.0;
  
    //Areas
    printf("Entre o raio do cilindo: ");
    scanf("%d",&r);
    printf("Entre a altura do cilindo: ");
    scanf("%d",&a);

    double area_cilindro = (3.14 * (pow(r, 2)) + 2 * 3.14 * r * a);
    printf("A area é: %lf metros quadrados.\n",area_cilindro);  //Em printf não pode ser colocado o %.

    //Quantidade de latas
    double latas = area_cilindro/litro;

    printf("São necessárias %lf latas para pintar o cilindro de %lf m2\n",latas,area_cilindro);

    //Valor Lata
    double custo = lata_valor * latas;

    printf("O custo de pintar os tanques é de: %lf\n",custo);

    return 0;
}


/*Exercício_1

Calcule a quantidade de latas de tinta necessárias e o custo para 
pintar tanques cilíndricos de combustível, onde são fornecidos a altura
e o raio desse cilindro sabendo que:

Lata = 20,00
-CLata = contem 5L
-1LPinta = 3m^2

CLata_pinta = 15m2

Area Cilindro: 3.14 * R^2 + 2 * 3.14 * R * A
R = raio
A = altura 

quantas latas de tinta são necessarias para pintar o tanque cilindrico?
quanto custa pintar esse tanque?
*/


