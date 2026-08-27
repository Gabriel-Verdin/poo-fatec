package semana02;

import javax.swing.JOptionPane;

public class While02 {

    public static void main(String[] args) throws InterruptedException {
        
        // Caixa de mercado

        double total = 0;
        double valor = 10; // Esse 10 só serve para poder entrar no laço

        while (valor > 0) {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Forneça um valor"));

            total += valor;
        }
        JOptionPane.showMessageDialog(null, "Total da compra: " + total);

    }

}
