// Fazer um programa que imprime a tabela ASCII (código decimal, código hexa, caracter) para os códigos de 0 a 127.

public class exercicio5 {
    public static void main(String[] args) {
        int decimal = 0;
        String hexa = "";
        String caracter = "";
        
        for (int i = 0; i <= 127; i++) {
            decimal = i;
            hexa = Integer.toHexString(i);
            caracter = Character.toString(i);

            System.out.printf("Decimal: %d\nHexadecimal: %s\nCaracter: %s\n\n", decimal, hexa, caracter);
        }    
    }
}
