package atividadeExercicios;

import javax.swing.JOptionPane;

public class Lista06Exercicio02 {

    public static void main(String[] args) {
        
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho da senha desejada: ");
        String s = "0123456789";

        try {
            int tamanhoSenha = Integer.parseInt(tamanho);
            String senhaGerada = "";
            
            for(int i = 0; i <= tamanhoSenha - 1; i++) {
                int n = (int) (Math.random()*s.length());

                senhaGerada += s.charAt(n);
            }

            JOptionPane.showMessageDialog(null, "Senha gerada: " + senhaGerada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
        }

    }

}
