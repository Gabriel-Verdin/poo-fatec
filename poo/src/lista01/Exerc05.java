package lista01;

import javax.swing.JOptionPane;

public class Exerc05 {

    public static void main(String[] args) {
        
        String lado_st = JOptionPane.showInputDialog("Digite o lado do quadrado");

        try {   
            double lado = Double.parseDouble(lado_st);

            JOptionPane.showMessageDialog(
                null,
                "Área do quadrado: " + (lado * lado) +
                "\nDobro da área: " + ((lado * lado) * 2) 
            );
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
