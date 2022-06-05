import java.util.Scanner;

/*
Fazer uma rotina que recebe como parâmetro um array de 5 posições contendo as notas de um aluno ao longo do ano e devolve a média do aluno.
*/

public class exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas = new float[5];
        float media = 0;

        // Percorre o array adicionando valores
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Insira a %dª nota: ", i + 1);
            notas[i] = input.nextFloat();
        }

        // Percorre o array somando os valores
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        // Divide a soma dos valores pelo tamanho do array
        media /= notas.length;

        System.out.printf("A média do aluno é de: %.2f", media);
    }
}
