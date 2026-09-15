package lista01;

import javax.swing.JOptionPane;

public class Exerc09 {

    public static void main(String[] args) {
        
        String altura_st = JOptionPane.showInputDialog("Digite sua altura");

        try {
            double altura = Double.parseDouble(altura_st);

            double peso_ideal = ((72.7*altura) - 58);

            JOptionPane.showMessageDialog(
                null,
                "Seu peso ideal é: " + peso_ideal
            );
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
