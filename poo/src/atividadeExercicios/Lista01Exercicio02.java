package atividadeExercicios;

import javax.swing.JOptionPane;

public class Lista01Exercicio02 {

    public static void main(String[] args) {
        
        String nota01Str = JOptionPane.showInputDialog(null, "Digite a primeira nota");
        String nota02Str = JOptionPane.showInputDialog(null, "Digite a segunda nota nota");
        String nota03Str = JOptionPane.showInputDialog(null, "Digite a terceira nota");

        try {
            double nota1 = Double.parseDouble(nota01Str);
            double nota2 = Double.parseDouble(nota02Str);
            double nota3 = Double.parseDouble(nota03Str);

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
