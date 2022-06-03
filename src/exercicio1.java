// Fazer um programa que pergunta um valor em metros e imprime o correspondente em decímetros, centímetros e milímetros. 

import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
        float valor = 0;
        float dm = 0;
        float cm = 0;
        float mm = 0;
        
        valor = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor em metros"));
        
        dm = valor * 10;
        cm = valor * 100;
        mm = valor * 1000;

        JOptionPane.showMessageDialog(null, "Metros: " + valor + "\nDecímetro: " + dm + "\nCentímetros: " + cm + "\nMilímetros: " + mm);
    }
}
