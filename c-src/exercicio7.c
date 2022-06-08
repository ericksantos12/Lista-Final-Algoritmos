// Fazer um programa em "C" que lê 10 valores e imprime o maior e o menor valores lidos.
#include <stdio.h>

int main(int argc, char const *argv[])
{
    int array[10];
    int maior;
    int menor;

    for (int i = 0; i < 10; i++)
    {
        printf("Insira um valor para a posicao %d: ", i);
        scanf("%d", &array[i]);
    }
    
    maior = array[0];
    menor = array[0];
    for (int i = 0; i < 10; i++)
    {
        if (array[i] > maior)
        {
            maior = array[i];
        }
        if (array[i] < menor)
        {
            menor = array[i];
        }
    }

    printf("O maior valor e %d e o menor valor e %d", maior, menor);
    

    return 0;
}
