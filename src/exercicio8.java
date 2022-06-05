import java.util.Arrays;
import java.util.Scanner;

// Fazer um programa que lê um conjunto de 10 valores e os imprime ordenados.

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] conjunto = new int[10];

        String texto = "";

        // Percorre o array inserindo valores
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print("(" + i + ") Insira um valor: ");
            conjunto[i] = input.nextInt();
        }

        // Ordena o array
        conjunto = bubbleSort(conjunto);

        // Concatena os valores do array na variavel texto
        for (int i = 0; i < conjunto.length; i++) {
            texto += conjunto[i] + " ";
        }
        
        // Mostra na tela o array ordenado
        System.out.println(texto);
    }

    static int[] bubbleSort(int[] array) {

        int auxiliar = 0;

        // Primeiro laço percorre o array pelo tamanho dele
        for (int i = 0; i < array.length; i++) {
            // Segundo laço percorre entre o primeiro elemento até o penúltimo elemento
            for (int j = 0; j < array.length - 1; j++) {
                // Verifica se o primeiro elemento é maior que o segundo elemento, se for ele troca de posições entre eles
                if (array[j] > array[j + 1]) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
        return array;
    }

}
