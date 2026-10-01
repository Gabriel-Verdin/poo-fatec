package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc06Lista02 {
    public static void main(String[] args) {
        
        String quantidadeAnos = JOptionPane.showInputDialog("Digite a quantidade de anos de Casamento: ");

        try {
            int anos = Integer.parseInt(quantidadeAnos);

            if (anos >= 25 && anos < 50) {
                JOptionPane.showMessageDialog(null, "O casal está comemorando Bodas de Prata");
            }
            else if (anos >= 50 && anos < 75) {
                JOptionPane.showMessageDialog(null, "O casal está comemorando Bodas de Ouro");
            }
            else if (anos > 75) {
                JOptionPane.showMessageDialog(null, "O casal está comemorando Bodas de Diamante");
            }
            else {
                int faltam = 25 - anos;
                JOptionPane.showMessageDialog(null, "O casal ainda não atingiu as bodas de prata. Faltam " + faltam + " anos.");
            }
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }   

    }
}
