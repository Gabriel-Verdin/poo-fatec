package semana02;

import javax.swing.JOptionPane;

public class While01 {

    public static void main(String[] args) throws InterruptedException {
        
        // Caixa de mercado

        double total = 0;

        while (true) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Forneça um valor"));
            if(valor == 0) break;

            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Forneça a quantidade"));
        
            total += (valor * quantidade);
        }
        JOptionPane.showMessageDialog(null, "Total da compra: " + total);


        // int i = 0; // Inicialização

        // while (i<=10) { // Comparação
            
        //     // Execução
        //     System.out.println(i);
        //     Thread.sleep(500);

        //     // Incremento
        //     i++;
        // }


    }

}
