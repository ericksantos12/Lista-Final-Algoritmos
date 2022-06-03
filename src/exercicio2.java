import javax.swing.JOptionPane;

//Fazer um programa que solicita um número decimal e imprime o correspondente em hexa e octal.

public class exercicio2 {
    public static void main(String[] args) {
        int numero = 0;
        String hexa = "";
        String octal = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        hexa = Integer.toHexString(numero);
        octal = Integer.toOctalString(numero);

        JOptionPane.showMessageDialog(null, "Decimal: " + numero + "\nHexa: " + hexa + "\nOctal: " + octal);
    }    
}
