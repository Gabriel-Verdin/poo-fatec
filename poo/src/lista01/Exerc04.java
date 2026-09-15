package lista01;

import javax.swing.JOptionPane;

public class Exerc04 {

    public static void main(String[] args) {
        
        final double PI = 3.1415;

        String raio_St = JOptionPane.showInputDialog("Digite o raio do círculo");

        try {
            double raio = Double.parseDouble(raio_St);

            double area = PI * (raio * raio);

            JOptionPane.showMessageDialog(
                null,
                "A área do círculo é igual a: " + (area));
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
