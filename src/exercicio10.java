import java.util.Scanner;

/* 
Fazer uma rotina que recebe um array do tipo double e o número de valores que devem ser solicitados ao usuário e devolve o array preenchido com os valores digitados.
*/

public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor;
        int inteiro;
        String texto = "";

        System.out.print("Insira a quantidade: ");
        inteiro = input.nextInt();

        vetor = new double[inteiro];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            vetor[i] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            texto += vetor[i] + " ";
        }

        System.out.println(texto);
    }
}
