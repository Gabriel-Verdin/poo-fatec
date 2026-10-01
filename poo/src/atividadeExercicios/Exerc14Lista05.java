package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc14Lista05 {

    public static void main(String[] args) throws InterruptedException {
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
            Thread.sleep(500); 
        }

    }

}
