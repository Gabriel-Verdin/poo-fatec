package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc03Lista01 {

    public static void main(String[] args) {
        
        String salarioHoraStr = JOptionPane.showInputDialog("Digite o valor que você ganha por hora");
        String tempoTrabalhadoStr = JOptionPane.showInputDialog("Digite o tempo trabalhado");

        try {
            double salarioHora = Double.parseDouble(salarioHoraStr);
            int tempoTrabalhado = Integer.parseInt(tempoTrabalhadoStr);

            JOptionPane.showMessageDialog(
                null, 
                "Salário Hora: " + salarioHora +
                "\nTempo Trabalhado: " + tempoTrabalhado +
                "\nSalário a receber: " + (salarioHora * tempoTrabalhado)    
            );

        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
