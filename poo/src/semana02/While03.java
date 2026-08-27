package semana02;

import javax.swing.JOptionPane;

public class While03 {

    public static void main(String[] args) {
        
        // Caixa de mercado

        double valor, total = 0;
        do {
            String s = JOptionPane.showInputDialog("Forneça um valor");

            if(s == null) break;
            
            valor = Double.parseDouble(s);
            total += valor;
        }
        while (valor > 0);

        JOptionPane.showMessageDialog(null, "Total da compra: " + total);

    //     double valor, total = 0;

    //     do {
    //         valor = Double.parseDouble(JOptionPane.showInputDialog("Forneça um valor"));
    //         total += valor;
    //     }
    //     while (valor > 0);
            
    //     JOptionPane.showMessageDialog(null, "Total da compra" + total);
    
    }

}
