package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc09Lista03 {

    public static void main(String[] args) {

        int par = 0, impar = 0;
        
        for(int i = 1; i <= 10; i++) {
            String numero = JOptionPane.showInputDialog("Digite o " + i + "º número: ");

            try {
                int num = Integer.parseInt(numero);

                if (num % 2 == 0) {
                    par++;
                }
                else {
                    impar++;
                }
            }
            catch(NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
            }
        }
        JOptionPane.showMessageDialog(null, 
            "O número de Pares foi de: " + par + 
            "\nO número de Ímpares foi de: " + impar);

    }

}
