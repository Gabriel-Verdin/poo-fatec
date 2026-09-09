package semana03;

import javax.swing.JOptionPane;

public class Excecao02 {

    public static void main(String[] args) {
        
        while(true) {
            String s = JOptionPane.showInputDialog("Idade?");
         
            try {
                int a = Integer.parseInt(s);
                JOptionPane.showMessageDialog(null, "Idade: " + a);
                break;
            }
            catch(NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "A idade deve ser um número inteiro: " + erro);
            }
        }

    }

}
 