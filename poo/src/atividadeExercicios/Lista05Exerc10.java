package atividadeExercicios;

import javax.swing.JOptionPane;

public class Lista05Exerc10 {

    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int contador = 0;

        while(frase.contains("as")) {
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, "A frase contém 'as' " + contador + " vezes.");
    }
}
