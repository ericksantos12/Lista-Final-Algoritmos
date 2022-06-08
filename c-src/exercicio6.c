// Fazer um programa em "C" que lê o preço de um produto e inflaciona esse preço em 10% se ele for menor que 100 e em 20% se ele for maior ou igual a 100.

#include <stdio.h>

int main(int argc, char const *argv[])
{
    float preco = 0;

    printf("Insira o preco do produto: ");
    scanf("%f", &preco);

    if (preco < 100)
    {
        preco *= 1.10;
    }
    else
    {
        preco *= 1.20;
    }
    
    printf("O preco reajustado e: %f", preco);

    return 0;
}
