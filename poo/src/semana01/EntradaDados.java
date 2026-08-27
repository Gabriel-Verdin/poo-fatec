package semana01;

import javax.swing.JOptionPane;

public class EntradaDados {

    public static void main(String[] args) {
        
        String a = JOptionPane.showInputDialog("Forneça N1");
        String b = JOptionPane.showInputDialog("Forneça N2");

        double n1 = Double.parseDouble(a);
        double n2 = Double.parseDouble(b);

        JOptionPane.showMessageDialog(
            null, 
            "Soma: " + (n1 + n2) +
            "\nSubtração: " + (n1 - n2) +
            "\nMultiplicação: " + (n1 * n2) +
            "\nDivisão: " + (n1 / n2) 
        );
 
        // if(a == null) {
        //     System.out.println("Cancelar pressionado");
        // }
        // else {
        //     System.out.println(a);
        // }

    }

}
