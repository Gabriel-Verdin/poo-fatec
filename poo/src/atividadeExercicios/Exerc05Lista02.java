package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc05Lista02 {
    public static void main(String[] args) {
        
        String num1Str = JOptionPane.showInputDialog("Digite o Primeiro número: ");
        String num2Str = JOptionPane.showInputDialog("Digite o Segundo número: ");
        String num3Str = JOptionPane.showInputDialog("Digite o Terceiro número: ");


        try {
            float num1 = Float.parseFloat(num1Str);
            float num2 = Float.parseFloat(num2Str);
            float num3 = Float.parseFloat(num3Str);

            if (num1 > 0 && num2 > 0 && num3 > 0) {
                float media = (num1 + num2 + num3) / 3;
                JOptionPane.showMessageDialog(null, "A média é: " + media);
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite apenas números positivos");
            }

        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }
    }
}
