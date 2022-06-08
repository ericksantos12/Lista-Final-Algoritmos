import java.util.Scanner;

// Fazer um programa que lê valores para uma matriz do tipo "float" de 5 linhas por 3 colunas e imprime a diferença entre a média dos elementos das colunas pares e a média dos elementos das linhas ímpares.

public class exercicio12 {
    public static void main(String[] args) {
        float[][] matriz = new float[5][3];
        Scanner input = new Scanner(System.in);
        int contador = 0;
        float mediaColuna = 0;
        float mediaLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Insira o valor da linha %d e coluna %d: ", i, j);
                matriz[i][j] = input.nextFloat();
            }
        }

        mostrarMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 == 0) {
                    contador++;
                    mediaColuna += matriz[i][j];
                }
            }
        }
        mediaColuna /= contador;
        contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(i % 2 == 0)) {
                    contador++;
                    mediaLinha += matriz[i][j];
                }
            }
        }
        mediaLinha /= contador;

        System.out.println("\nA diferença entre a média das colunas pares e a média das linhas ímpares é: " + (mediaColuna - mediaLinha));

    }


    static void mostrarMatriz(float[][] m){
        System.out.println("");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("| %8.2f ", m[i][j]);
            }
            System.out.println("|");
        }
    }
}
