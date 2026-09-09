package semana03;

import javax.swing.JOptionPane;

public class Excecao03 {

    public static void main(String[] args) {
        int idade = -1;

        while(idade <= 0) {
            String s = JOptionPane.showInputDialog("Idade?");
         
            try {
                idade = Integer.parseInt(s);
                JOptionPane.showMessageDialog(null, "Idade: " + idade);
            }
            catch(NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "A idade deve ser um número inteiro: " + erro);
            }
        }

    }

}
