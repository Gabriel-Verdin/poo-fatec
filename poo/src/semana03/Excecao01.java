package semana03;

import javax.swing.JOptionPane;

public class Excecao01 {

    public static void main(String[] args) {
    
        String s = JOptionPane.showInputDialog("Idade?");

        try {
            int a = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "Idade: " + a);

            int calculo = 1000 / a;
            JOptionPane.showMessageDialog(null, "Calculo: " + calculo);
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "A idade deve ser um número inteiro: " + erro);
        }
        catch(ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "A idade não deve ser zero: " + erro);
        }
        finally { // Realizar encerramento de recursos
            JOptionPane.showMessageDialog(null, "Bloco encerrado");
        }

    }

}
