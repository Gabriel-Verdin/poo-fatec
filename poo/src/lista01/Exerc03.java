package lista01;

import javax.swing.JOptionPane;

public class Exerc03 {

    public static void main(String[] args) {
        
        String metros_st = JOptionPane.showInputDialog(null, "Digite o número de metros que deseja converter");

        try {
            double metros = Double.parseDouble(metros_st);

            double centimetros = metros * 100;

            JOptionPane.showMessageDialog(
                null,
                "Número em centímetros: " + (centimetros)
            );
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
