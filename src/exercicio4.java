import java.util.Scanner;

/*
Faça um programa que lê dois valores e imprime:

Se o primeiro valor for maior que o segundo, a lista de valores do primeiro até o segundo;

Se o primeiro valor for menor que o segundo a lista de valores do segundo até o primeiro em ordem decrescente;

Se ambos forem iguais a mensagem "valores iguais".
*/

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        String texto = "";

        System.out.print("Insira o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.print("Insira o segundo valor: ");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            for (int i = valor1; i >= valor2; i--) {
                texto += i + " ";
            }
        } else if (valor1 < valor2){
            for (int i = valor2; i >= valor1; i--) {
                texto += i + " ";
            }
        } else {
            texto = "Valores iguais";
        }

        System.out.println(texto);
    }
}
