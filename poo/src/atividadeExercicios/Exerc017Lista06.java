package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc017Lista06 {

    public static void main(String[] args) {
        
        String ladoStr = JOptionPane.showInputDialog("Digite o valor do Lado: ");

        try {
            float lado = Float.parseFloat(ladoStr);

            double volume = Math.pow(lado, 3);
            JOptionPane.showMessageDialog(null, "O volume da caixa-d'água é de: " + volume + " metros cúbicos");

        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
