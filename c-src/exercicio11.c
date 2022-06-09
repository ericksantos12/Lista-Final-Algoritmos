// Fazer um programa em "C" que lê um conjunto de 10 valores inteiros e verifica se algum dos valores é igual a média dos mesmos.

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int array[10];
    int media = 0;

    int index = -1;
    int valor = 0;



    for (int i = 0; i < 10; i++)
    {
        printf("Insira um valor para a posicao %d: ", i);
        scanf("%d", &array[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        media += array[i];
    }
    media /= 10;

    for (int i = 0; i < 10; i++)
    {
        if (array[i] == media)
        {
            valor = array[i];
            index = i;
        }
    }



    if (index == -1)
    {
        printf("Nenhum valor encontrado");
    }
    else
    {
        printf("O valor da media e %d e foi encontrado na posicao %d", valor, index);
    }
    
    return 0;
}
