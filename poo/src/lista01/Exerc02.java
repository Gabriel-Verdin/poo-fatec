package lista01;

import javax.swing.JOptionPane;

public class Exerc02 {

    public static void main(String[] args) {
        
        String nota01_st = JOptionPane.showInputDialog(null, "Digite a primeira nota");
        String nota02_st = JOptionPane.showInputDialog(null, "Digite a segunda nota nota");
        String nota03_st = JOptionPane.showInputDialog(null, "Digite a terceira nota");

        try {
            double nota1 = Double.parseDouble(nota01_st);
            double nota2 = Double.parseDouble(nota02_st);
            double nota3 = Double.parseDouble(nota03_st);

            JOptionPane.showMessageDialog(
                null,
                "Média das notas: " + ((nota1 + nota2 + nota3) / 3)
            );
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
