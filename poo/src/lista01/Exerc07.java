package lista01;

import javax.swing.JOptionPane;

public class Exerc07 {

    public static void main(String[] args) {
        
        String farenheit_st = JOptionPane.showInputDialog("Digite a temperatura em graus Farenheit");


        try {
            int farenheit = Integer.parseInt(farenheit_st);

            double celcius = (5 * (farenheit - 32) / 9);

            JOptionPane.showMessageDialog(
                null, 
                "Temperatura em Farenheit: " + farenheit +
                "\nTemperatura em Celcius: " + celcius
            );
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um numero valido: " + erro);
        }
    }

}
