package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc15Lista05 {

    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int contador = 0;

        while(frase.contains("as")) {
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, "A frase contém 'as' " + contador + " vezes.");
    }
}
