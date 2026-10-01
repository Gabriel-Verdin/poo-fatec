package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc10Lista04 {

    public static void main(String[] args) {
        
        int nota = 11;

        while (nota < 0 || nota > 10) {
            String input = JOptionPane.showInputDialog("Digite uma nota entre 0 e 10: ");
            try {
                nota = Integer.parseInt(input);
                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(null, "Nota inválida. Digite uma nota entre 0 e 10.");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
            }
            
        }

    }

}
