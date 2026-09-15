package lista01;

import javax.swing.JOptionPane;

public class Exerc08 {

    public static void main(String[] args) {
        
        String celcuis_st = JOptionPane.showInputDialog("Digite a temperatura em graus Celcius");

        try {
            int celcius = Integer.parseInt(celcuis_st);

            double farenheit = (celcius * 9/5) + 32;

            JOptionPane.showMessageDialog(
                null, 
                "Temperatura em Celcius: " + celcius +
                "\nTemperatura em Farenheit: " + farenheit
            );
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um numero valido: " + erro);
        }        

    }

}
