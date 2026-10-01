package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc13Lista05 {

    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "A palavra invertida é: " + palavraInvertida);

    }

}
