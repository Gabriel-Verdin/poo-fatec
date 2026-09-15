package lista01;

import javax.swing.JOptionPane;

public class Exerc10 {

    public static void main(String[] args) {
        
        final double PORCENTAGEM_DESCONTO = 0.05;
        String iptu_st = JOptionPane.showInputDialog("Digite o valor do IPTU");

        try {
            Double iptu = Double.parseDouble(iptu_st);

            double desconto = iptu * PORCENTAGEM_DESCONTO;
            double valor_total_desconto = iptu - desconto;

            JOptionPane.showMessageDialog(
                null, 
                "Valor do IPTU: " + (iptu) +
                "\nValor do Desconto a Vista: " + (desconto) +
                "\nValor Final do IPTU: " + (valor_total_desconto)
            );

        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
