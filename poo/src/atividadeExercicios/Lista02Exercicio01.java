package atividadeExercicios;

import javax.swing.JOptionPane;

public class Lista02Exercicio01 {

    public static void main(String[] args) {
        
        String numeroStr = JOptionPane.showInputDialog("Digite um número qualquer");

        try {
            int numero = Integer.parseInt(numeroStr);

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR");
            }
            else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR");
            }
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
