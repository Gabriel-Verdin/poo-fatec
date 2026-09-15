package lista01;

import javax.swing.JOptionPane;

public class Exerc06 {

    public static void main(String[] args) {
        
        String salario_hora_st = JOptionPane.showInputDialog("Digite o valor que você ganha por hora");
        String tempo_trabalhado_st = JOptionPane.showInputDialog("Digite o tempo trabalahdo");

        try {
            double salario_hora = Double.parseDouble(salario_hora_st);
            int tempo_trabalhado = Integer.parseInt(tempo_trabalhado_st);

            JOptionPane.showMessageDialog(
                null, 
                "Salário Hora: " + salario_hora +
                "\nTempo Trabalhado: " + tempo_trabalhado +
                "\nSalário a receber: " + (salario_hora * tempo_trabalhado)    
            );

        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número válido: " + erro);
        }

    }

}
