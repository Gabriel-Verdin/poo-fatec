package semana04;

import javax.swing.JOptionPane;

public class UsaCalculadora {

    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));

        int resultado = Calculadora.somar(n1, n2);
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

    }

}
