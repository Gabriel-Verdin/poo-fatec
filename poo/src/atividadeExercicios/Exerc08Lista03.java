package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc08Lista03 {

    public static void main(String[] args) {
        
        int count = 0;
        int soma = 0;

        for(int i = 1; i <= 10; i++) {
            String numero = JOptionPane.showInputDialog("Digite o " + i + "º número: ");

            try {
                int num = Integer.parseInt(numero);

                soma += num;
                count++;
            }
            catch(NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
            }
        }
        JOptionPane.showMessageDialog(null, 
            "A Soma dos números digitados é: " + soma +
            "\nA Média dos números digitados é: " + (soma / count)
        );

    }

}
