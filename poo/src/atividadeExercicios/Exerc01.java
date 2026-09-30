package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc01 {

    public static void main(String[] args) {
        
        String numero1_st = JOptionPane.showInputDialog(null, "Digite o primeiro número");
        String numero2_st = JOptionPane.showInputDialog(null, "Digite o segundo número");

        try {
            double numero1 = Double.parseDouble(numero1_st);
            double numero2 = Double.parseDouble(numero2_st);

            JOptionPane.showMessageDialog(
                null,
                "Soma: " + (numero1 + numero2) +
                "\nSubtração: " + (numero1 - numero2) +
                "\nMultiplicação: " + (numero1 * numero2) +
                "\nDivisão: " + (numero1 / numero2)
            );
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }
    }   
}
