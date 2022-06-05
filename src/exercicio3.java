import java.util.Scanner;

/*
3 - Fazer um programa que solicite 2 números e informe: (Source)

a) A soma dos números;

b) O produto do primeiro número pelo quadrado do segundo;

c) O quadrado do primeiro número;

d) A raiz quadrada da soma dos quadrados;

e) O seno da diferença do primeiro número pelo segundo;

f) O módulo do primeiro número.
*/

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;

        double soma = 0;
        double produtoQuadrado = 0;
        double quadradoPrimeiro = 0;
        double raizSomaQuadrados = 0;
        double senoDaDiferenca = 0;
        double moduloPrimeiro = 0;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextDouble();

        soma = numero1 + numero2;
        produtoQuadrado = numero1 * (numero2 * numero2);
        quadradoPrimeiro = numero1 * numero1;
        raizSomaQuadrados = Math.sqrt((numero1 * numero1) + (numero2 * numero2));
        senoDaDiferenca = Math.sin(numero1 - numero2);
        moduloPrimeiro = Math.abs(numero1);

        System.out.println("\nA soma dos números: " + soma);
        System.out.println("O produto do primeiro número pelo quadrado do segundo: " + produtoQuadrado);
        System.out.println("O quadrado do primeiro número: " + quadradoPrimeiro);
        System.out.println("A raiz quadrada da soma dos quadrados: " + raizSomaQuadrados);
        System.out.println("O seno da diferença do primeiro número pelo segundo: " + senoDaDiferenca);
        System.out.println("O módulo do primeiro número: " + moduloPrimeiro);
    }
}
